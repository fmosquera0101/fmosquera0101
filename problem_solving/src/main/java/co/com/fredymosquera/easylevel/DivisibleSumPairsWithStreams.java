package co.com.fredymosquera.easylevel;

import java.util.stream.IntStream;

public class DivisibleSumPairsWithStreams {

    public static void main(String[] args) {

        int[] ar = new int[]{1, 3, 2, 6, 1, 2};
        int n = 6;
        int k = 3;

        System.out.println(divisibleSumPairs(n, k, ar));
    }

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        long pairs =IntStream.rangeClosed(0, n-1)
                .flatMap(
                        i -> IntStream.rangeClosed(i+1, n-1)
                        .map(j -> ar[i] + ar[j])
                        .filter(l -> l % k == 0)
                ).count();

        return (int) pairs;

    }
}
