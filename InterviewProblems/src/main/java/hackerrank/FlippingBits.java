package main.java.hackerrank;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FlippingBits {

    public static long flippingBits(long n) {
        return flip(padTo32(Long.toBinaryString(n)));
    }

    private static long flip(String s) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            sb.append(s.charAt(i) == '0' ? '1' : '0');
        }
        return Long.parseLong(sb.toString(), 2);
    }

    private static String padTo32(String binaryString) {
        int missingZeros = 32 - binaryString.length();
        return IntStream.rangeClosed(1, missingZeros).mapToObj(m -> "0").collect(Collectors.joining()) + binaryString;
    }

    public static void main(String[] args) {
        System.out.println(flippingBits(9));
    }
}
