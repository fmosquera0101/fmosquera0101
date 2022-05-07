package co.com.fredymosquera.easylevel;

import java.util.*;

public class BeautifulTriplets {

    public static void main(String[] args) {

    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here

        int count = 0;
        for (Integer value : arr) {
            if(Collections.binarySearch(arr, value + d) >= 0 && Collections.binarySearch(arr, value + d * 2) >= 0){
                count++;
            }
        }


        return count;

    }

    public static int beautifulTripletsSets(int d, List<Integer> arr) {
        // Write your code here

        int count = 0;
        Set<Integer> set = new HashSet<>();
        for (Integer value : arr) {
            if(!set.contains(value)){
                set.add(value);
            }
        }


        for (Integer value : arr) {
            if(set.contains(value + d) && set.contains(value + d * 2)){
                count++;
            }
        }


        return count;

    }

    public static int beautifulTripletsBruteForce(int d, List<Integer> arr) {
        // Write your code here

        int count = 0;
        for (int i = 0; i < arr.size() ; i++) {
            for (int j = i + 1; j < arr.size(); j++) {
                if (arr.get(j) > arr.get(i)){
                    for (int k = j + 1; k < arr.size(); k++) {
                        if (arr.get(k) > arr.get(j)){
                            int subs1 = arr.get(j) - arr.get(i);
                            int subs2 = arr.get(k) - arr.get(j);

                            if(subs1 == subs2 && subs1 == d){
                                count++;
                            }
                        }else {
                            continue;
                        }
                    }
                }else{
                    continue;
                }


            }
        }


        return count;

    }

}
