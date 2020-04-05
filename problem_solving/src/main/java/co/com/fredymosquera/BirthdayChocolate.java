package co.com.fredymosquera;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BirthdayChocolate {

    public static void main(String[] args) {

        List<Integer> s = Arrays.asList(4);
        int d = 4;
        int m = 1;
        System.out.println("parts: "+ birthday(s, d, m));
    }

    static int birthday(List<Integer> s, int d, int m) {
        int total = 0;
        for (int i = 0; i < s.size() - m + 1; i++) {
            int sum = 0;
            for (int j = i; j < i + m; j++) {
                sum = sum + s.get(j);
            }
            if (sum == d) {
                total = total + 1;
            }
        }
        return  total;
    }


}
