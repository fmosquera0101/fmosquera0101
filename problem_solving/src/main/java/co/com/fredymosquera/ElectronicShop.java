package co.com.fredymosquera;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class ElectronicShop {

    public static void main(String[] args) {

        InputStream inputStream = new ElectronicShop().getClass().getClassLoader().getResourceAsStream("input_electronicShop.txt");
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
        int expend = -1;
        int higher = 0;
        for (int i = 0; i < keyboards.length; i++) {
            for (int j = 0; j < drives.length; j++) {
                int sumexpend = keyboards[i] + drives[j];
                if( (b - sumexpend) >= 0){
                    if ( sumexpend > higher){
                        higher = sumexpend;
                    }
                    expend =  higher;
                }

            }
        }
        return expend;
    }
}
