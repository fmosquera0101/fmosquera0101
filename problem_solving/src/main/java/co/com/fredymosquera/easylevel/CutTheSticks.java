package co.com.fredymosquera.easylevel;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CutTheSticks {
    
    public static void main(String[] args) {
        int[] sticks = {1,1,1,1};
        System.out.println(Arrays.toString(cutTheSticks(sticks)));
        
        
    }
    
    // Complete the cutTheSticks function below.
    static int[] cutTheSticks(int[] arr) {
        List<Integer> sticks = Arrays.stream(arr).boxed().collect(Collectors.toList());
        List<Integer> sizeSticksCut = new ArrayList<>();
        sizeSticksCut.add(sticks.size());
        while (sticks.size() > 1){
            int theShortestStick = sticks.stream().mapToInt(v -> v).min().getAsInt();
            sticks.removeIf(s -> s == theShortestStick);
            if(sticks.size() > 0){
                sizeSticksCut.add(sticks.size());
            }
            
        }
        return sizeSticksCut.stream().mapToInt(s -> s).toArray();
    }
    
}
