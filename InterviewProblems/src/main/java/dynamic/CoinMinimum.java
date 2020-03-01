package main.java.dynamic;

import java.util.Arrays;

/**
 * Given denominations of 50p, 20p, 10p, 5p, 2p, and 1p what are the minimum
 * number of coins that are required to make amount n?
 */
public class CoinMinimum {

    private static int[] coins = { 50, 20, 10, 5, 2, 1 };

    public static void main(String[] args) {
        System.out.println("Min coins is " + getMinCoins(100) + " for 100p (should be 2)");
        System.out.println("Min coins is " + getMinCoins(50) + " for 50p (should be 1)");
        System.out.println("Min coins is " + getMinCoins(13) + " for 13p (should be 3)");
    }

    private static int getMinCoins(int n) {
        // this will store the optimal solution for all the values -- from 0 to given amount.
        int[] coinReq = new int[n+1];
        Arrays.fill(coinReq, Integer.MAX_VALUE);

        coinReq[0] = 0; // 0 coins are required to make the change for 0
        // now solve for all the amounts up to n
        for (int amount = 1; amount <= n; amount++) {
            // Now try taking every coin one at a time and pick the minimum
            for (int coin : coins) {
                if (coin <= amount) { // check if coin value is less than amount
                    // select the coin and add 1 to solution of (amount-coin value)
                    int x = coinReq[amount - coin] + 1; //gets a previously computed solution and adds 1
                    int y = coinReq[amount];
                    coinReq[amount] = Math.min(x, y);
                }
            }
        }
        //return the optimal solution for amount
        return coinReq[n];
    }
}
