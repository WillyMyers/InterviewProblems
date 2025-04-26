//package main.java.scb;
//
//import java.util.ArrayList;
//import java.util.Arrays;
//import java.util.List;
//
//import org.junit.Test;
//
//import static org.junit.Assert.*;
//
//public class TestPersonServiceImpl {
//
//	PersonServiceImpl ps = new PersonServiceImpl();
//
//	@Test
//	public void testAddNullPerson() {
//		ps.addOrUpdate(null);
//	}
//
//	@Test
//	public void testAddPersonWithNullName() {
//		Person p = new Person(100, null);
//		ps.addOrUpdate(p);
//	}
//
//	@Test
//	public void testAddPersonWithEmptyName() {
//		Person p = new Person(100, "");
//		ps.addOrUpdate(p);
//	}
//
//	@Test
//	public void testAddDuplicates() {
//		Person p = new Person(1, "Willy");
//		ps.addOrUpdate(p);
//		ps.addOrUpdate(p);
//		assertNotNull(ps.get(1));
//	}
//
//	@Test
//	public void testAddWihNewName() {
//		Person p = new Person(1, "Willy");
//		ps.addOrUpdate(p);
//		Person p2 = new Person(1, "WillyMyers");
//		ps.addOrUpdate(p2);
//		assertNotNull(ps.get(1));
//		assertNull(ps.get("Willy"));
//	}
//}
