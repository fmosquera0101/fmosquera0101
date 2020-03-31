package co.com.fredymosquera;

import java.util.Arrays;

public class MinMaxSumArr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {256741038, 623958417, 467905213 ,714532089 ,938071625};
		miniMaxSum(arr);
	}
	
    // Complete the miniMaxSum function below.
    static void miniMaxSum(int[] arr) {
    	
    	Arrays.sort(arr);
    	StringBuilder minMax = new StringBuilder();
    	minMax.append(getMin(arr));
    	minMax.append(" ");
    	minMax.append(getMax(arr));
    	System.out.println(minMax.toString());
    }

	private static long getMin(int[] arr) {
		long min = 0;
    	for (int i = 0; i < arr.length - 1; i++) {
			min += arr[i];
		}
		return min;
	}
	private static long getMax(int[] arr) {
		long max = 0;
    	for (int i = 1; i < arr.length; i++) {
			max += arr[i];
		}
		return max;
	}

}
