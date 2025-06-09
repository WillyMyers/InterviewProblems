package main.java.hackerrank;

import java.util.HashSet;
import java.util.Set;

public class Pangrams {

    public static String pangrams(String s) {
        Set<Character> letters = new HashSet<>();
        for (Character c : s.toLowerCase().replace(" ", "").toCharArray()) {
            letters.add(c);
        }
        return letters.size() == 26 ? "pangram" : "not pangram";
    }

    public static void main(String[] args) {
        System.out.println(pangrams("We promptly judged antique ivory buckles for the next prize"));
        System.out.println(pangrams("We promptly judged antique ivory buckles for the prize"));
    }
}
