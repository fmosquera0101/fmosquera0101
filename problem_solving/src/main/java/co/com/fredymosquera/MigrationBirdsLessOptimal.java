package co.com.fredymosquera;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;

public class MigrationBirds {

    public static void main(String[] args) {

        InputStream inputStream = new MigrationBirds().getClass().getClassLoader().getResourceAsStream("input.txt");
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
        int n = Integer.parseInt(in.nextLine());

       // List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
        List<Integer> arr = Arrays.stream(in.nextLine().split(" "))
                .map( s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(migratoryBirds(arr));
    }

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {

        int n = arr.size();
        List<Integer> freq = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> maxArr = Arrays.asList(0, 0, 0, 0, 0);
        int idx = 0;
        int max = -1;
        for (int i = 0; i < freq.size(); i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (freq.get(i) == arr.get(j)){
                    count++;
                }
            }
            maxArr.set(i, count);
            if(maxArr.get(i) > max){
                max = maxArr.get(i);
                idx = i;
            }
        }
        System.out.println("maxArr: "+maxArr);
        System.out.println("idx: "+idx);
        System.out.println(freq.get(idx));


        /*for (int i = 0; i < n; i++) {
            int count = 1;
            if(freq.get(i) == 0){
                continue;
            }
            int j = i + 1;
            for (; j < n ; j++) {
                if(arr.get(i) == arr.get(j)){
                    freq.set(j, 0);
                    count++;
                }
            }
            freq.set(i, count);
            if(freq.get(i) > max){
                max = freq.get(i);
                idx = i;
            }
        }*/
     //   System.out.println(idx);
       // System.out.println(freq);
        return arr.get(idx);
    }
}
