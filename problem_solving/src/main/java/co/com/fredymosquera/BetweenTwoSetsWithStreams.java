package co.com.fredymosquera;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BetweenTwoSetsWithStreams {

	
	public static void main(String[] args) {
		List<Integer> a = Arrays.asList(1);
		List<Integer> b = Arrays.asList(100);
		int count = getTotalX(a, b);
		System.out.println("count: "+count);
	}
	
	/*
     * Complete the 'getTotalX' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     */

    public static int getTotalX(List<Integer> a, List<Integer> b) {
    	
    	List<Integer> ab = new ArrayList<Integer>();
    	ab.addAll(a);
    	ab.addAll(b);
    	Integer min = ab.stream().min(Integer::compare).get();
    	Integer max = ab.stream().max(Integer::compare).get();
    	
    	int count = 0;
    	for(int x = min; x <= max; x++) {
    		final int numm = x;
    		long sizeStreamA = a.stream().filter(integer -> numm % integer == 0).count();
    		long sizeStreamB = b.stream().filter(integer ->integer % numm  == 0).count();

    		if(sizeStreamA == a.size()  && sizeStreamB == b.size()) {
    			count++;
    		}
    		
    	}
    	return count;

    }
}
