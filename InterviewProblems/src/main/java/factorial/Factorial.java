package main.java.factorial;

import java.math.BigInteger;

public class Factorial {

	public static void main(String[] args) {
		System.out.println(factorial(null));
		System.out.println(factorial(BigInteger.ZERO));
		System.out.println(factorial(BigInteger.valueOf(6)));
		System.out.println(factorial(6));

	}

	private static BigInteger factorial(BigInteger bi) {
		if(bi == null || bi.equals(BigInteger.ZERO) || bi.equals(BigInteger.ONE)){
			return BigInteger.ONE;
		}else{
			return bi.multiply(factorial(bi.subtract(BigInteger.ONE)));
		}
	}
	
	private static long factorial(long n){
		if(n == 1 || n == 0){
			return 1;
		}else{
			return n * factorial(n-1);
		}
	}
}
