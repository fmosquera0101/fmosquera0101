package co.com.fredymosquera.easylevel;

import java.math.BigInteger;

public class ExtraLongFactorial {
    public static void main(String[] args) {
        extraLongFactorials(50);
    }
    static void extraLongFactorials(int n) {

        BigInteger bigInteger = new BigInteger(String.valueOf(n));
        for (int i = n -1; i > 1 ; i--) {
            bigInteger = bigInteger.multiply(new BigInteger(String.valueOf(i)));
        }

        System.out.println(bigInteger);
    }
}
