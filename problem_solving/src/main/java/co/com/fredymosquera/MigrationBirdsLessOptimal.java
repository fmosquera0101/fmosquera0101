package co.com.fredymosquera;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class MigrationBirdsLessOptimal {

    public static void main(String[] args) {

        InputStream inputStream = new MigrationBirdsLessOptimal().getClass().getClassLoader().getResourceAsStream("input.txt");
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
        List<Integer> freq = new ArrayList<>(arr);
        int idx = 0;
        int max = -1;


        for (int i = 0; i < n; i++) {
            int count = 1;
            if(freq.get(i) == 0){
                continue;
            }
            int j = i ;
            for (; j < n ; j++) {
                if(arr.get(i) == arr.get(j)){
                    freq.set(j, 0);
                    count = count + 1;
                }
            }
            freq.set(i, count);
            if(freq.get(i) > max){
                max = freq.get(i);
                idx = i;
            }
        }
        return arr.get(idx);
    }
}
