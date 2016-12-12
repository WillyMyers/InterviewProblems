package main.java.string;

import java.util.Arrays;

public class StringFunctions {

	public static void main(String[] args) {
		String s = "dogfood";
		boolean b = hasUniqueCharacters(s);
		System.out.println("Should be false, is " + b);
		
		s = "wanker";
		b = hasUniqueCharacters(s);
		System.out.println("Should be true, is " + b);
		
		b = isAnagram("dog", "god");
		System.out.println("Should be true, is " + b);
		
		b = isAnagram("house", "horse");
		System.out.println("Should be false, is " + b);
		
		b = isAnagram(null, "horse");
		System.out.println("Should be false, is " + b);

	}

	private static boolean isAnagram(String s1, String s2) {
		if(s1 == null || s2 == null){
			return false;
		}else{
			char[] ch1 = s1.toCharArray();
			char[] ch2 = s2.toCharArray();
			
			Arrays.sort(ch1);
			Arrays.sort(ch2);
			return Arrays.equals(ch1, ch2);
		}
		
	}

	private static boolean hasUniqueCharacters(String s) {
		if(s == null || s.isEmpty()){
			return false;
		}else{
			char[] ch = s.toCharArray();
			Arrays.sort(ch);
			
			for (int i = 0; i < ch.length - 1; i++) {
				if(ch[i] == ch[i+1]){
					return false;
				}	
			}
		}
		return true;
	}

}
