package main.java.hackerrank;

import java.util.ArrayList;
import java.util.List;

public class MatchingStrings {

    public static List<Integer> matchingStrings(List<String> strings, List<String> queries) {
        List<Integer> results = new ArrayList<>(queries.size());
        for (String q : queries) {
            results.add((int) strings.stream().filter(s -> s.equals(q)).count());
        }
        return results;
    }

    public static void main(String[] args) {
        System.out.println(matchingStrings(List.of("abc", "abcd", "abc", "abc"), List.of("abc", "abcd", "abcde")));
    }
}
