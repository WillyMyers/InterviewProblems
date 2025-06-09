package main.java.hackerrank;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.List;

public class PlusMinus {

    public static void plusMinus(List<Integer> arr) {
        int positive = 0;
        int negative = 0;
        int zero = 0;
        for (Integer i : arr) {
            if (i == 0) {
                zero++;
            } else if (i < 0) {
                negative++;
            } else {
                positive++;
            }
        }
        scaleAndPrint(positive, arr.size());
        scaleAndPrint(negative, arr.size());
        scaleAndPrint(zero, arr.size());
    }

    private static void scaleAndPrint(int positive, int size) {
        System.out.println(BigDecimal.valueOf(positive).divide(BigDecimal.valueOf(size), 6, RoundingMode.HALF_EVEN));
    }

    public static void main(String[] args) {
        List arr = List.of(-4, 3, -9, 0, 4, 1);
        plusMinus(arr);
    }
}
