package main.java.hashmap;

import static org.junit.Assert.*;

import org.junit.Test;

public class MyHashMapTest {

	MyHashMap<Integer, String> map = new MyHashMap<>();
	
	@Test
	public void testPrintMap() {
		MyHashMap<Integer, String> map = new MyHashMap<>();
		map.put(21, "first");
		map.put(25, "second");
		map.put(30, "third");
		map.put(33, "fourth");
		map.put(35, "fifth");
		map.put(30, "sixth");
		map.put(35, "fifth");
		map.printMap();
	}

	@Test
	public void testGetPut() {
		MyHashMap<Integer, String> map = new MyHashMap<>();
		map.put(21, "first");
		assertTrue(map.get(21).equals("first"));
		map.put(21, "second");
		assertTrue(map.get(21).equals("second"));
		
		map.put(21, "first");
		map.put(25, "second");
		map.put(33, "third");
		assertTrue(map.get(21).equals("first"));
		assertTrue(map.get(25).equals("second"));
		assertTrue(map.get(33).equals("third"));
	}
}
