package main.java.fibonacci;

/**
 * Compute the nth fibonacci number with memoisation so it runs in O(n) time. Int is too small so overflows quickly
 */
public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fibonacci(50));
    }

    private static long fibonacci(long n) {
        return fibonacci(n, new long[(int) (n+1)]);
    }

    private static long fibonacci(long n, long[] memo) {
        if(n ==0 || n ==1){
            return n;
        }
        if(memo[(int) n] == 0){
            memo[(int) n] = fibonacci(n -1, memo) + fibonacci(n - 2, memo);
        }
        return memo[(int) n];
    }
}
