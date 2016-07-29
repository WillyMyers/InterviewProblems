package test.java.anagram;

import static org.junit.Assert.*;

import org.junit.Test;

import main.java.anagram.Anagram;

public class TestAnagram {

	Anagram anagram = new Anagram();
	
	@Test
	public void testDogGod() {
		assertTrue(anagram.isAnagram("dog", "god"));
	}
	
	@Test
	public void testDogGodCaseInsensitive() {
		assertTrue(anagram.isAnagramCaseInsensitive("Dog", "god"));
	}
	
	@Test
	public void testDogGodCaseSensitive() {
		assertFalse(anagram.isAnagram("Dog", "god"));
	}
	
	@Test
	public void testNull() {
		assertFalse(anagram.isAnagram(null, "god"));
	}
	
	@Test
	public void testEmpty() {
		assertFalse(anagram.isAnagram("", "god"));
	}
	
	@Test
	public void testDifferent() {
		assertFalse(anagram.isAnagram("spaniel", "dog"));
	}

}
