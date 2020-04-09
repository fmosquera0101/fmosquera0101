package co.com.fredymosquera.easylevel;

public class BreakingRecords {

	public static void main(String[] args) {
		int [] scores = {10, 5, 20, 20 ,4 ,5, 2, 25, 1};// {3, 4, 21, 36, 10, 28, 35, 5, 24, 42};
		int [] ret = breakingRecords(scores);
		System.out.println(ret[0]+" "+ret[1]);

	}
	
	// Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
    	
    	int score = scores[0];
    	int scoremin = scores[0];
    	int recordMax = 0;
    	int recordMin = 0;
    	
    	for (int i = 1; i < scores.length; i++) {
			if(scores[i] > score) {
				score = scores[i];
				recordMax++;
				
			}
			
			if(scoremin > scores[i]) {
				scoremin = scores[i];
				recordMin++;
				
			}
		}
    	
    	
				
			
    	return new int[] {recordMax, recordMin};

    }

}
