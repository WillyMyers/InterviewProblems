package main.java.hackerrank;

import java.util.Arrays;
import java.util.List;

public class CountingSort {

    public static List<Integer> countingSort(List<Integer> arr) {
        Integer[] count = new Integer[100];
        Arrays.fill(count, 0);
        for (Integer integer : arr) {
            count[integer]++;
        }

        return Arrays.asList(count);
    }

    public static void main(String[] args) {
        System.out.println(countingSort(List.of(1, 1, 3, 2, 1)));
    }
}
