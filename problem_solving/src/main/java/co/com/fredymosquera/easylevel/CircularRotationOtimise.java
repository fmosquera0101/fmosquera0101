package co.com.fredymosquera.easylevel;

import java.util.Arrays;

public class CircularRotationOtimise {

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
        k = k % n;
        reverse(a, 0, n -1);
        reverse(a, 0, k-1);
        reverse(a, k, n -1);

        int lengthQueries = queries.length;
        int[] result = new int[lengthQueries];
        for (int i = 0; i < lengthQueries ; i++) {
            result[i] = a[queries[i]];
        }
        return result;
    }

    private static void reverse(int[] a, int start, int end) {
        while (start < end){
            int tmp = a[start];
            a[start] = a[end];
            a[end] = tmp;
            start++;
            end--;
        }

    }

}
