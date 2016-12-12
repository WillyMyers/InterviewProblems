package main.java.scb;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

public class TestPersonServiceImpl {

	PersonServiceImpl ps = new PersonServiceImpl();
	
	@Test
	public void testAddNullList() {
		ps.add(null);
	}
	
	@Test
	public void testAddEmptyList() {
		ps.add(new ArrayList<Person>());
	}
	
	@Test
	public void testAddListWithNullPerson() {
		List<Person> persons = new ArrayList<>();
		persons.add(null);
		ps.add(persons);
	}
	
	@Test
	public void testAddListWithDuplicates() {
		Person p = new Person(1, "Willy");
		List<Person> persons = Arrays.asList(p,p);
		ps.add(persons);
		assertEquals(1, ps.countPersons("Willy"));
		
		
	}
}
