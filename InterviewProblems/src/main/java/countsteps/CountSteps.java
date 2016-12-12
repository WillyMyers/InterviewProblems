package main.java.countsteps;

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
		for (int i = 0; i < aInt.length; i++) {
			aInt[i] = -1;
		}
		return countWays(n, aInt);

	}

	private int countWays(int n, int[] map) {
		if(n<0){
			return 0;
		}else if(n==0){
			return 1;
		}else if (map[n] > -1){
			return map[n];
		}else{
			map[n] = countWays(n-1, map)+countWays(n-2, map)+countWays(n-3, map);
			return map[n];
		}
	}
}
