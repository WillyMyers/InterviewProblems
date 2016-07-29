package main.java.anagram;

import java.util.Arrays;

import org.hamcrest.core.StringEndsWith;

/**
 * Test if one string is an anagram of another - dog and god. Allow case insensitive.
 * @author willy
 *
 */
public class Anagram {

	public boolean isAnagramCaseInsensitive(String s1, String s2){
		return isAnagram(s1.toLowerCase(), s2.toLowerCase());
	}
	
	public boolean isAnagram(String s1, String s2){
		if(s1 == null || s2 == null){
			return false;
		}
		if(s1.length() != s2.length()){
			return false;
		}
		
		return sort(s1).equals(sort(s2));
	}

	private String sort(String s) {
		char[] content = s.toCharArray();
		Arrays.sort(content);
		return new String(content);
	}
}
