package co.com.fredymosquera.easylevel;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FindDigit {

    public static void main(String[] args) {
        System.out.println(findDigits(111));
    }

    static int findDigits(int n) {
        return (int) Arrays.stream(Integer.toString(n).split(""))
                .map( x-> Integer.parseInt(x))
                .filter(x -> x != 0 && n % x == 0).count();

    }

}
