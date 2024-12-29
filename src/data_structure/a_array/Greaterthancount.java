package data_structure.a_array;

public class Greaterthancount {
    public static void main(String[] args) {
        int[] arr = {8, 6, 4, 1, 3, 4, 5};
        System.out.println(strictlyGreater(arr, 3));
    }
    private static int strictlyGreater(int[] arr, int target){
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > target) count++;
        }
        return count;
    }
}
