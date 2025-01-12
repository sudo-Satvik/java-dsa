package data_structure.e_hashmap.b_questions;
import java.util.*;

public class A_MostFrequentElement {
    public static int mostFreq(int[] arr){
        int max = -1;
        HashMap<Integer, Integer> frequency = new HashMap<>();
        for(int e : arr) {
           if (!frequency.containsKey(e))
               frequency.put(e, 1);
           else
               frequency.put(e, frequency.get(e) + 1);
        }
        for (var e : frequency.entrySet()) {
            if (e.getValue() > max){
                max = e.getKey();
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int[] arr = {1, 4, 2, 5, 1, 4, 4, 6, 4, 4, 4};
        System.out.println(mostFreq(arr));
    }
}