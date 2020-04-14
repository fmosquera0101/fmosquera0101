package co.com.fredymosquera.easylevel;

import java.util.Arrays;

public class CircularRotation {

    public static void main(String[] args) {
        int[] a = {3, 4, 5};
        int k = 2;
        int[] queries = {1, 2};
        int[] result = circularArrayRotation(a, k, queries);
        System.out.println(Arrays.toString(result));
    }

    // Complete the circularArrayRotation function below.
    static int[] circularArrayRotation(int[] a, int k, int[] queries) {
        int n = a.length;
        for (int i = 1; i <= k ; i++) {
            int tmp = a[n-1];
            for (int j = n -1; j > 0 ; j--) {
                a[j] = a[j - 1];
            }
            a[0] = tmp;

        }
        int lengthQueries = queries.length;
        int[] result = new int[lengthQueries];
        for (int i = 0; i < lengthQueries ; i++) {
            result[i] = a[queries[i]];
        }
        return result;
    }
}
