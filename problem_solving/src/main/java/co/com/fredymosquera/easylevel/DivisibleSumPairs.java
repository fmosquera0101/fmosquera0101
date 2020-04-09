package co.com.fredymosquera.easylevel;

public class DivisibleSumPairs {

    public static void main(String[] args) {

        int[] ar = new int[]{1, 3, 2, 6, 1, 2};
        int n = 6;
        int k = 3;
        System.out.println(divisibleSumPairs(n, k, ar));
    }

    // Complete the divisibleSumPairs function below.
    static int divisibleSumPairs(int n, int k, int[] ar) {
        int pairs = 0;

        for (int i = 0; i < n - 1 ; i++) {
            int sum;
            for (int j = i+1; j < n  ; j++) {
                sum = ar[i] + ar[j];
                if(sum % k == 0){
                    pairs++;
                }
            }
        }

        return  pairs;

    }
}
