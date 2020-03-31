package co.com.fredymosquera.hackerrank.interviewprep;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

/**
 * 
 * @author fredy mosquera lemus
 *
 */
public class RepeatedString {
	// Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	
    	int sizeS = s.length();
      	long div = n / sizeS;
     	long rest = n % sizeS;
    	long rep = 0;
    	
    	for (int i = 0; i < sizeS; i++) {
			if('a' == s.charAt(i)){
				rep++;
			}
		}
  
    	rep = rep * div;
   
    	for (int i = 0; i < rest; i++) {
    		if('a' == s.charAt(i)){
				rep++;
			}
		}
    	return rep;


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        long n = scanner.nextLong();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        long result = repeatedString(s, n);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
