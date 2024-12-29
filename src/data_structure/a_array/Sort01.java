package data_structure.a_array;

import java.util.Arrays;

public class Sort01 {
    public static void main(String[] args) {
        int[] arr = {1, 0, 1, 0, 0, 0, 1};
        int j = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0)
                j++;
        }
        for (int i = 0; i < j; i++) {
            arr[i] = 0;
        }
        for (int i = j; i < arr.length; i++) {
            arr[i] = 1;
        }
        System.out.println(Arrays.toString(arr));
    }
}
