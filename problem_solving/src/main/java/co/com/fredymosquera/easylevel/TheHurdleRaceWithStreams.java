package co.com.fredymosquera.easylevel;

import java.util.Arrays;
import java.util.Optional;

public class TheHurdleRaceWithStreams {
    public static void main(String[] args) {

    }

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {

        int max = Arrays.stream(height).max().getAsInt();

        if(k < max){
            return  max - k;
        }
        return 0;

    }

}
