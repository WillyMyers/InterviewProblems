package main.java.dynamic;

import static java.lang.Integer.max;

/**
 * 1kg = $1
 * 3kg = $8
 * 5kg = $18
 * 6kg = $22
 * 7kg = $28
 *
 * Max weight is 11kg
 *
 * Therefore, we need to choose the items whose total weight does not exceed the
 * weight limit, and their total value is as high as possible. For example, the
 * best solution for the above example is to choose the 5kg item and 6kg item,
 * which gives a maximum value of $40 within the weight limit. Each item must
 * either be chosen or left behind. We cannot take a partial amount of an item.
 * Also, we cannot take an item multiple times.
 */
public class KnapsackProblem {

    public static void main(String[] args) {
        int[] weights = new int[]{1,3,5,6,7};
        int[] values = new int[]{1,8,18,22,28};
        int limit = 11;

        int result = solve(weights, values, limit);
        System.out.println("Best value should $40, calculated as $" + result);
    }

    private static int solve(int[] weights, int[] values, int limit) {
        int n = values.length;
        int[][] results = new int[n + 1][limit + 1];

        for(int i = 0; i <= n; i++){
            for(int j = 0; j <= limit; j++){
                if(i == 0 || j == 0){
                    results[i][j] = 0;
                }else if(weights[i - 1] <= j){
                    int x = values[i - 1];
                    int y = results[i - 1][j - weights[i - 1]];
                    int z = results[i - 1][j];
                    results[i][j] = max(x + y, z);
                }else{
                    results[i][j] = results[i-1][j];
                }
            }
        }
        return results[n][limit];
    }
}
