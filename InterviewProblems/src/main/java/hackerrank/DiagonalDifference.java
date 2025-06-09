package main.java.hackerrank;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class DiagonalDifference {

    public static int diagonalDifference(List<List<Integer>> arr) {
        return Math.abs(diagonal(arr) - diagonal(arr.stream().map(DiagonalDifference::reverse).collect(Collectors.toList())));
    }

    private static List<Integer> reverse(List<Integer> list) {
        List<Integer> copy = new ArrayList<>(list);
        Collections.reverse(copy);
        return copy;
    }

    private static int diagonal(List<List<Integer>> arr) {
        int result = 0;
        for (int i = 0; i < arr.size(); i++) {
            result += arr.get(i).get(i);
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(diagonalDifference(List.of(
                List.of(1, 2, 3),
                List.of(4, 5, 6),
                List.of(9, 8, 9))));
    }
}
