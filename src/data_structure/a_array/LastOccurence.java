package data_structure.a_array;

public class LastOccurence {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 1, 6, 7 };
        System.out.println(lastOccurence(arr, 1));
    }
    private static int lastOccurence(int[] arr, int target){
        int idx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target)
                idx = i;
        }
        return idx;
    }
}
