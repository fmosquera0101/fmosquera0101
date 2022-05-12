package co.com.fredymosquera.easylevel;

import java.util.ArrayList;
import java.util.List;

public class HowManyGames {

    public static void main(String[] args) {
        int p = 20;
        int d = 3;
        int m = 6;
        int s = 85;
        System.out.println(howManyGames(p, d, m, s));
    }

    public static int howManyGames(int p, int d, int m, int s) {
        int maxOrders = s / m;

        List<Integer> orders = new ArrayList<>();
        int total = 0;
        int counter = 0;
        for (int i = 0; i < maxOrders; i++) {
            if(p <= m){
                orders.add(m);
                total += m;
                if(total <= s){
                    counter++;
                }
            }else{
                orders.add(p);
                total += p;
                if(total <= s){
                    counter++;
                }

            }

            p -= d;

        }


        return counter;
    }
}
