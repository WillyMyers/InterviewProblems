package main.java.string;

import java.util.Arrays;
import java.util.stream.IntStream;

public class StringFunctions {

    public static void main(String[] args) {
//		String s = "dogfood";
//		boolean b = hasUniqueCharacters(s);
//		System.out.println("Should be false, is " + b);
//
//		s = "badger";
//		b = hasUniqueCharacters(s);
//		System.out.println("Should be true, is " + b);
//
//		b = isAnagram("dog", "god");
//		System.out.println("Should be true, is " + b);
//
//		b = isAnagram("house", "horse");
//		System.out.println("Should be false, is " + b);
//
//		b = isAnagram(null, "horse");
//		System.out.println("Should be false, is " + b);

        String reversedOne = reverseOne("sausages");
        System.out.println(reversedOne);

        String reversedTwo = reverseTwo("sausages");
        System.out.println(reversedTwo);

        String reversedThree = reverseThree("sausages");
        System.out.println(reversedThree);
    }

    private static String reverseThree(String arg) {

        char[] arr = arg.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i <= arr.length; i++) {
            sb.append(arr[arr.length - i]);
        }
        return sb.toString();
    }

    private static String reverseTwo(String arg) {
        char[] arr = arg.toCharArray();
        return IntStream.rangeClosed(1, arr.length).mapToObj(i -> arr[arr.length - i]).collect(StringBuilder::new, StringBuilder::append, StringBuilder::append).toString();
    }

    private static String reverseOne(String arg) {
        return new StringBuilder(arg).reverse().toString();
    }

    private static boolean isAnagram(String s1, String s2) {
        if (s1 == null || s2 == null) {
            return false;
        } else {
            char[] ch1 = s1.toCharArray();
            char[] ch2 = s2.toCharArray();

            Arrays.sort(ch1);
            Arrays.sort(ch2);
            return Arrays.equals(ch1, ch2);
        }

    }

    private static boolean hasUniqueCharacters(String s) {
        if (s == null || s.isEmpty()) {
            return false;
        }
        char[] ch = s.toCharArray();
        Arrays.sort(ch);

        for (int i = 0; i < ch.length - 1; i++) {
            if (ch[i] == ch[i + 1]) {
                return false;
            }
        }

        return true;
    }

}
