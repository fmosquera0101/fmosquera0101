package co.com.fredymosquera.easylevel;

public class TheHurdleRace {
    public static void main(String[] args) {

    }

    // Complete the hurdleRace function below.
    static int hurdleRace(int k, int[] height) {
        int max = 0;
        for (int hg: height) {
            if(hg > max){
                max = hg;
            }
        }
        if(k < max){
            return  max - k;
        }
        return 0;

    }

}
