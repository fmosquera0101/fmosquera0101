package co.com.fredymosquera.easylevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class SecuenceEquation {
    public static void main(String[] args) {
        int[] p ={5,2,1,3,4};
        int[] r = permutationEquation(p);
        System.out.println(Arrays.toString(r));
    }

    // Complete the permutationEquation function below.
    static int[] permutationEquation(int[] p) {
        int N = p.length;
        List<Integer> ret = new ArrayList<>();

        for (int i = 1; i <= N; i++) {
            int pi = finIndex(p, i);
            int pii = finIndex(p, pi);
            ret.add(pii);
        }
        return ret.stream().mapToInt(k -> k).toArray();
    }
    private static  int finIndex(int p[], int val){
        for (int j = 0; j < p.length; j++) {
            if(val == p[j]){
                return j+1;
            }
        }
        return -1;
    }
}
