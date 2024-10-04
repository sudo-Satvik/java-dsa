package data_structure.array;

public class Unique {
    public static void main(String[] args) {
        int[] arr = {1, 2, 1, 2, 3, 4, 4, 5, 5, 8};
        System.out.println(unique(arr));
    }
    private static int unique(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {               // 0, 1, 2, 3, 4, 5, 6
            for (int j = i + 1; j < n ; j++){
                if (arr[i] == arr[j]) {
                    arr[i] = -1;
                    arr[j] = -1;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) count++;
            
        }
        return count;
    }
}
