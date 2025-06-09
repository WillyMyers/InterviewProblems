package main.java.hackerrank;

import java.util.Collections;
import java.util.List;

public class LonelyInteger {

    public static int lonelyinteger(List<Integer> a) {
        return a.stream().filter(f -> Collections.frequency(a, f) == 1).findFirst().orElse(-1);
    }

    public static void main(String[] args) {
        System.out.println(lonelyinteger(List.of(1, 2, 3, 4, 3, 2, 1)));
    }
}
