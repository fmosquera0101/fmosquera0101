package co.com.fredymosquera.easylevel;

import java.util.stream.IntStream;

public class BeautifulDaysAtMoviesWithStreams {
    public static void main(String[] args) {
        StringBuilder nm = new StringBuilder(""+20);
        System.out.println(nm.toString()+"--"+nm+"--"+Integer.parseInt(nm.reverse().toString()));
        System.out.println(beautifulDays(20, 23, 6));
        IntStream.rangeClosed(20, 23).forEach(System.out::println);
    }

    // Complete the beautifulDays function below.
    static int beautifulDays(int i, int j, int k) {

      return (int)  IntStream.rangeClosed(i, j)
                .map(n ->  Math.abs(n - Integer.parseInt(new StringBuilder(""+n).reverse().toString())))
                .filter(n -> n % k == 0).count();

    }
}
