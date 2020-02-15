package main.java.scb;

import java.util.Set;

/**
 * Get operations should exhibit the same performance while returning data
 */
public interface PersonService {

	void addOrUpdate(Person person) throws InterruptedException;
	
	Person get(int id);

	Set<Person> get(String name);

}
