package co.com.fredymosquera;

import java.util.Arrays;
import java.util.List;

public class BirthdayChocolate {

    public static void main(String[] args) {

        List<Integer> s = Arrays.asList(1, 2 ,1, 3 ,2);
        int d = 3;
        int m = 2;
        System.out.println("parts: "+ birthday(s, d, m));
    }
    // Complete the birthday function below.
    static int birthday(List<Integer> s, int d, int m) {

        int count = 0;
        for (int i = 0; i <  s.size(); i++) {
            int sum = s.get(i);
            if (s.size() > m) {
                for (int j = i + 1; j <= m; j++) {
                    sum = sum + s.get(j);
                    if (sum == d) {
                        count++;
                        break;
                    }
                }
            }else if(sum == d){
                count++;
            }
        }

        return count;
    }
}
