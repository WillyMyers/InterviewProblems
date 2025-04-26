package main.java.factorial;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(null));
		System.out.println(factorial(BigInteger.ZERO));
        System.out.println(factorial(BigInteger.valueOf(10000)));
        System.out.println(factorialDynamic(10000));

	}

	private static BigInteger factorial(BigInteger bi) {
		if(bi == null || bi.equals(BigInteger.ZERO) || bi.equals(BigInteger.ONE)){
			return BigInteger.ONE;
		}else{
			return bi.multiply(factorial(bi.subtract(BigInteger.ONE)));
		}
	}

    private static BigInteger factorialDynamic(int target) {
        BigInteger result = BigInteger.valueOf(1L);
        for (int i = 1; i <= target; i++) {
            result = result.multiply(BigInteger.valueOf(i));
		}
        return result;
	}
}
