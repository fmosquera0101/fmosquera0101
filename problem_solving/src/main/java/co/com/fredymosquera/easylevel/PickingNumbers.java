package co.com.fredymosquera.easylevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class PickingNumbers {

    public static void main(String[] args) {
        List<Integer> a = Arrays.asList(1, 1, 2, 2, 4, 4, 5, 5 ,5);
        pickingNumbers(a);

    }

    public static int pickingNumbers(List<Integer> a) {

        Collections.sort(a);
        int higherList = 0;
        for (int i = 0; i < a.size() ; i++) {
            List<Integer> subListA = new ArrayList<>();
            subListA.add(a.get(i));
            for (int j = i + 1; j < a.size()  ; j++) {
                if(a.get(j) >= 0) {
                    int min = Math.abs(a.get(i) - a.get(j));
                    if (min <= 1) {
                        subListA.add(a.get(j));
                        a.set(j, -1);
                    }
                }
            }
            int sizeSubListA = subListA.size();
            if(sizeSubListA > higherList){
                higherList = sizeSubListA;
            }
            System.out.println(subListA);


        }
        System.out.println(a);
        System.out.println(higherList);
        return higherList;

    }
}
