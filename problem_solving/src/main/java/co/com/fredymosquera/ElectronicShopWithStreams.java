package co.com.fredymosquera;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ElectronicShopWithStreams {

    public static void main(String[] args) {

        InputStream inputStream = new ElectronicShopWithStreams().getClass().getClassLoader().getResourceAsStream("input_electronicShop.txt");
        Scanner in = new Scanner(new BufferedReader(new InputStreamReader(inputStream)));
        String [] line1 =in.nextLine().split(" ");
        int b = Integer.parseInt(line1[0]);
        int m = Integer.parseInt(line1[1]);
        int n = Integer.parseInt(line1[2]);
        int [] keyboards = Arrays.stream(in.nextLine().split(" "))
                .mapToInt( s -> Integer.parseInt(s)).toArray();
        int [] drives = Arrays.stream(in.nextLine().split(" "))
                .mapToInt( s -> Integer.parseInt(s)).toArray();
        System.out.println(getMoneySpent(keyboards, drives, b));

    }

    static int getMoneySpent(int[] keyboards, int[] drives, int b) {
       int expend = Arrays.stream(keyboards)
                .flatMap(k -> Arrays.stream(drives).map(d -> d + k))
                .filter(s -> (b - s) >= 0 ).max().orElse( -1);
        return expend;
    }
}
