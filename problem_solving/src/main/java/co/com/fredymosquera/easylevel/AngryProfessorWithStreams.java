package co.com.fredymosquera.easylevel;

import java.util.Arrays;

public class AngryProfessorWithStreams {

    public static void main(String[] args) {

    }

    // Complete the angryProfessor function below.
    static String angryProfessor(int k, int[] a) {
        long count = Arrays.stream(a).filter(i -> i <= 0).count();
        return  count >= k?"NO":"YES";
    }

}
