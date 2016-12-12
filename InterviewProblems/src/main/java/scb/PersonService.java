package main.java.scb;

import java.util.List;

public interface PersonService {

	public void add(List<Person> persons);
	
	public int countPersons(String name);
	
	public void clear();
}
