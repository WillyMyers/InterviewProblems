package main.java.hackerrank;

import java.math.BigInteger;
import java.util.Comparator;
import java.util.List;

public class MinMaxSum {

    public static void miniMaxSum(List<Integer> arr) {
        BigInteger min = arr.stream().sorted().limit(4).map(BigInteger::valueOf).reduce(BigInteger.ZERO, BigInteger::add);
        BigInteger max = arr.stream().sorted(Comparator.reverseOrder()).limit(4).map(BigInteger::valueOf).reduce(BigInteger.ZERO, BigInteger::add);
        System.out.println(min + " " + max);
    }

    public static void main(String[] args) {
        List list = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
        miniMaxSum(list);
        //2063136757 2744467344
    }
}
