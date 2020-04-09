package co.com.fredymosquera.easylevel;

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
        List<Integer> type = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> freq = Arrays.asList(0, 0, 0, 0, 0);
        int idx = 0;
        int max = -1;
        for (int i = 0; i < type.size(); i++) {
            int count = 1;
            for (int j = 0; j < n; j++) {
                if (type.get(i) == arr.get(j)){
                    count++;
                }
            }
            freq.set(i, count);
            if(freq.get(i) > max){
                max = freq.get(i);
                idx = i;
            }
        }

        System.out.println(freq);
        return type.get(idx);
    }
}
