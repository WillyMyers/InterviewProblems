package main.java.scb;

import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public class PersonServiceImpl implements PersonService {

	private Map<String, Set<Person>> people = new ConcurrentHashMap<>();

	/**
	 * Add Person objects to the map in a thread safe manner. 
	 */
	@Override
	public void add(List<Person> persons) {
		if (persons != null) {
			for (Person person : persons) {
				if (person != null) {
					if (!people.containsKey(person.getName())) {
						people.putIfAbsent(person.getName(), new HashSet<Person>());
					}
					people.get(person.getName()).add(person);
				}
			}
		}
	}

	@Override
	public int countPersons(String name) {
		if(name != null){
			Set<Person> set = people.get(name);
			if(set != null){
				return set.size();
			}
		}
		return 0;
	}

	@Override
	public void clear() {
		// TODO Auto-generated method stub

	}

}
