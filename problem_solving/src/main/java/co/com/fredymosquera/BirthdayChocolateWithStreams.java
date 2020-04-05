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
        if(s.size() == 1 && s.get(0) == d){
            return 1;
        }else {
            return (int) IntStream.range(0, s.size() - 1)
                    .flatMap(
                            i -> IntStream.range(1, m)
                                    .map(j -> s.get(i) + s.get(i + 1))
                    ).filter(k -> k == d).count();
        }
    }
}
