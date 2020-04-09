package co.com.fredymosquera.easylevel;

import java.util.Arrays;

public class CountApplesAndOrangesWithStreams {
	
	// Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	
    	long numApples =  Arrays.stream(apples).map(app -> a + app).filter(app -> app >= s && app <= t).count();
    	long numOranges = Arrays.stream(oranges).map(orang -> b + orang).filter(orang -> orang >= s && orang <=t).count();
    	
    	System.out.println(numApples+"\n"+numOranges);
    }
    
    public static void main(String[] args) {
    	int s = 7;
    	int t = 10;
    	int a = 4; 
    	int b = 12;
		int [] apples = {2,3,-4};
		int [] oranges = {3,-2,-4};
		countApplesAndOranges(s, t, a, b, apples, oranges);
		
	}

}
