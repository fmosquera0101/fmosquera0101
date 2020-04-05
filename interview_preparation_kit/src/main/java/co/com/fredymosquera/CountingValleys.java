package co.com.fredymosquera;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
/**
 * 
 * @author fredy mosquera lemus
 *
 */
public class CountingValleys {
	// Complete the countingValleys function below.
    static int countingValleys(int n, String s) {
    	
    	int valleys = 0;
    	int down = 0;
    	
    	for (int i = 0; i < s.length(); i++) {
			if(s.charAt(i) == 'D'){
				down++;
			}else if(s.charAt(i) == 'U'){
				down--;
			}
			
			if(down == 0 && s.charAt(i) == 'U'){
				valleys++;
			}
			
			
		}
    	
    	return valleys;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String s = scanner.nextLine();

        int result = countingValleys(n, s);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }

}
