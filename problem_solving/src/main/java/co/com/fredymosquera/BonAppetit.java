package co.com.fredymosquera;

import java.util.Arrays;
import java.util.List;

public class BonAppetit {

    public static void main(String[] args) {
        List<Integer> bill = Arrays.asList(3, 10, 2, 9);
        int k = 1;
        int b = 12;
        bonAppetit(bill, k, b);
    }

    // Complete the bonAppetit function below.
    static void bonAppetit(List<Integer> bill, int k, int b) {
        int noEaten = bill.get(k);
        bill.set(k, 0);
        int totalBill = 0;
        for (int money: bill) {
            totalBill += money;

        }
        int billSplited = (totalBill /2);
        if( billSplited == b){
            System.out.println("Bon Appetit");
        }else{
            System.out.println(b - billSplited);
        }

    }
}
