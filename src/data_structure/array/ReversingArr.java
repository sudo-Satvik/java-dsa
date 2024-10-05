package data_structure.array;
import java.util.Arrays;

public class ReversingArr {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 7};
        System.out.println(Arrays.toString(reverse3(arr)));
    }
    // O(N^2)
    private static int[] reverse(int[] arr){
        int[] temp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            temp[i] = arr[arr.length-1-i];
        }
        arr = temp;
        return arr;
    }
    // O(N)
    private static int[] reverse2(int[] arr){
        int[] temp = new int[arr.length];
//        int j = 0;
//        for (int i = arr.length - 1; i >= 0 ; i--) {        // 5, 4, 3, 2, 1, 0
//            temp[j++] = arr[i];                             // temp[0] = arr[5]
//        }
        int i = arr.length - 1, j = 0;
        while (i >= 0) temp[j++] = arr[i--];
        return temp;
    }
    // Inplace ~ not using temp variables!
    private static int[] reverse3(int[] arr){
        int i = 0, j = arr.length - 1;
        while (i < j){
            swap(arr, i, j);
            i++;
            j--;
        }
        return arr;
    }
    /*In your reverse3 method, you call swap(arr[i], arr[j]), but this passes the values of arr[i] and arr[j], not the actual references to the array elements. So, the changes made in swap are local and do not reflect in the original array.
    Fix:
    You need to modify the swap method to directly swap the elements in the array. You can do this by passing the array and the indices to the swap method instead of the values:
    */
//    private static void swap(int a, int b){
//        b = b - a;
//        a = b + a;
//        b = a - b;
//    }
    private static void swap(int[] arr, int i, int j){
        arr[j] = arr[j] - arr[i];
        arr[i] = arr[j] + arr[i];
        arr[j] = arr[i] - arr[j];
    }
}
