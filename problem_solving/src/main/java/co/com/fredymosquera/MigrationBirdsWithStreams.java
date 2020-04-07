package co.com.fredymosquera;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class MigrationBirdsWithStreams {

    public static void main(String[] args) {

        InputStream inputStream = new MigrationBirdsWithStreams().getClass().getClassLoader().getResourceAsStream("input.txt");
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
        int n = Integer.parseInt(in.nextLine());

       // List<Integer> arr = Arrays.asList(1,4,4,4,5,3);
        List<Integer> arr = Arrays.stream(in.nextLine().split(" "))
                .map( s -> Integer.parseInt(s)).collect(Collectors.toList());
        System.out.println(migratoryBirds(arr));
    }

    // Complete the migratoryBirds function below.
    static int migratoryBirds(List<Integer> arr) {
       Map<Integer, Long> map = arr.stream()
               .collect(Collectors
                       .groupingBy(Function.identity(), Collectors.counting()));

        Map.Entry<Integer, Long> entrys = map.entrySet().stream()
                .max(Map.Entry.comparingByValue()).get();



       return entrys.getKey();
    }
}
