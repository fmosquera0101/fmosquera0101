package co.com.fredymosquera;


import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class BirthdayChocolateWithStreams {


    public static void main(String[] args) {

        List<Integer> s = Arrays.asList(4);
        int d = 4;
        int m = 1;
        System.out.println("parts: "+ birthday(s, d, m));
    }

    static int birthday(List<Integer> s, int d, int m){

            return (int) IntStream.range(0, s.size() - m + 1)
                    .flatMap(
                            i -> IntStream.range(i, m+i)
                                    .map(j -> s.get(j))
                    ).filter(k -> k == d).count();

    }
}
