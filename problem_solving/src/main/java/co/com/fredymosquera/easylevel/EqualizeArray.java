package co.com.fredymosquera.easylevel;

import java.util.*;

public class EqualizeArray {

    public static void main(String[] args) {
        List<Integer> arr = Arrays.asList(1, 2, 3, 1, 2, 3, 3, 3);
        System.out.println(equalizeArray(arr));
    }

    public static int equalizeArray(List<Integer> arr) {
        int max = 1;
        Map<Integer, Integer> mapMax = new HashMap<>();
        for (int i = 0; i < arr.size() ; i++) {
            if(!mapMax.containsKey(arr.get(i))){
                mapMax.put(arr.get(i), 1);
            }else{
                mapMax.put(arr.get(i), mapMax.getOrDefault(arr.get(i), 0) + 1);
                if(max < mapMax.get(arr.get(i))){
                    max = mapMax.get(arr.get(i));
                }
            }
        }
        return arr.size() - max;
    }

}
