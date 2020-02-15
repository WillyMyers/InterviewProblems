package main.java.scb;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class PersonServiceImpl implements PersonService {

    /**
     * keyed by name, multiple people can have the same name
     */
    private Map<String, Set<Person>> peopleByName = new ConcurrentHashMap<>();
    /**
     * keyed by id only one person can have the same id
     */
    private Map<Integer, Person> peopleById = new ConcurrentHashMap<>();

    private Lock lock = new ReentrantLock();

    @Override
    public void addOrUpdate(Person person) {
        if (person == null || person.getName() == null) {
            //log and throw exception
            return;
        }
        try {
            if (lock.tryLock(100, TimeUnit.MILLISECONDS)) {
                if (peopleById.containsKey(person.getId())) {
                    //it's an update so remove the old one before updating as they could have changed name
                    Person old = peopleById.get(person.getId());
                    peopleByName.get(old.getName()).remove(old);
                    peopleById.remove(old.getId());
                }
                peopleByName.computeIfAbsent(person.getName(), x -> new HashSet<>()).add(person);
                peopleById.put(person.getId(), person);
            } else{
            	//log that we didn't get a lock and the update failed...maybe throw a RuntimeException
			}
        } catch (InterruptedException ex) {
        	//ignore
        } finally {
            lock.unlock();
        }
    }

    @Override
    public Person get(int id) {
        return peopleById.get(id);
    }

    @Override
    public Set<Person> get(String name) {
        return new HashSet<>(peopleByName.get(name));
    }
}
