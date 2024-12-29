package data_structure.a_array;

public class IsSorted {
    public static void main(String[] args) {
        int[] arr = {1 , 2 , 3 , 3 , 5};
        System.out.println(isSorted(arr));
    }
    private static boolean isSorted(int[] arr){
        for (int i = 0; i < arr.length - 1; i++) {
            if(arr[i] > arr[i + 1]) return false;
        }
        return true;
    }
}
