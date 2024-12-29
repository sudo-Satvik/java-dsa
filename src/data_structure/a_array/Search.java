package data_structure.a_array;

public class Search {
    public static void main(String[] args) {
        int[] arr = {1, 23, 54, 75, 34};
        System.out.println(search(arr, 23));
    }
    private static int search(int[] arr, int target){
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) return i;
        }
        return -1;
    }
}
