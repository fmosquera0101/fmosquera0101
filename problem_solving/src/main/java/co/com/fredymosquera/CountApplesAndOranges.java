package co.com.fredymosquera;

public class CountApplesAndOranges {

	
	// Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
    	
    	for (int i = 0; i < apples.length; i++) {
    		apples[i] = a + apples[i];
		}
    	int numApples = 0;
    	for (int i = 0; i < apples.length; i++) {
			if(apples[i] >= s && apples[i] <= t) {
				numApples++;
			}
		}
    	
    	for (int i = 0; i < oranges.length; i++) {
    		oranges[i] = b + oranges[i];
		}
    	int numOranges = 0;
    	for (int i = 0; i < oranges.length; i++) {
			if(oranges[i] >= s && oranges[i] <= t) {
				numOranges++;
			}
		}
    	
    	System.out.println(numApples+"\n"+numOranges);
    }
    
}
