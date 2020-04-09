package co.com.fredymosquera.easylevel;
import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;

import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

/**
 * 
 * @author fredy mosquera lemus
 *
 */

public class DiagonalDifference {
	/*
	 * Complete the 'diagonalDifference' function below.
	 *
	 * The function is expected to return an INTEGER.
	 * The function accepts 2D_INTEGER_ARRAY arr as parameter.
	 */
	public static int diagonalDifference(List<List<Integer>> arr) {
		// Write your code here

		int sizeArr = arr.size();
		int sumDiagA = 0;
		int sumDiagB = 0;
		int i = 0;
		int aux = 0;

		for (List<Integer> list : arr) {
			for (int j = 0; j < sizeArr; j++) {
				if(i == j){
					sumDiagA += list.get(i);
				}
				if((j+1) == sizeArr){
					sumDiagB += list.get(j - aux);
					aux++;
				}
			}
			i++;
		}
		return Math.abs(sumDiagA - sumDiagB);


	}
	public static void main(String[] args) throws IOException {
		BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

		int n = Integer.parseInt(bufferedReader.readLine().trim());

		List<List<Integer>> arr = new ArrayList<>();

		IntStream.range(0, n).forEach(i -> {
			try {
				arr.add(
						Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
						.map(Integer::parseInt)
						.collect(toList())
						);
			} catch (IOException ex) {
				throw new RuntimeException(ex);
			}
		});

		int result = diagonalDifference(arr);

		bufferedWriter.write(String.valueOf(result));
		bufferedWriter.newLine();

		bufferedReader.close();
		bufferedWriter.close();
	}
}
