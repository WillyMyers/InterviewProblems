package main.java.countsteps;

import java.util.Arrays;

/**
 * A child is running up some stairs with n steps, and can hop 1, 2, or 3 steps
 * at a time, implement a method to count the possible combination of ways the
 * child can climb the stairs.
 * 
 * @author willy
 *
 */
public class CountSteps {

	public int countPossibleStepCombinations(int n) {
		int[] aInt = new int[n+1];
		Arrays.fill(aInt, -1);
		return countWays(n, aInt);

	}

	private int countWays(int n, int[] memo) {
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else if (memo[n] > -1){
			return memo[n];
		}else{
			memo[n] = countWays(n-1, memo)+countWays(n-2, memo)+countWays(n-3, memo);
			return memo[n];
		}
	}
}
