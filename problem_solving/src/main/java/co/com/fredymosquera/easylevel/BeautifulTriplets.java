package co.com.fredymosquera.easylevel;

import java.util.List;

public class BeautifulTriplets {

    public static void main(String[] args) {

    }

    public static int beautifulTriplets(int d, List<Integer> arr) {
        // Write your code here

        int count = 0;
        for (int i = 0; i < arr.size() -2; i++) {
            for (int j = i + 1; j < arr.size() -1; j++) {
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
