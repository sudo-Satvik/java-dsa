package data_structure.array;

public class Repeating {
    public static void main(String[] args) {
        int[] arr = {1, 5, 3, 4, 6, 4, 3};
        System.out.println(repeating(arr));
    }
    public static int repeating(int[] arr){
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (arr[i] == arr[j])
                    return arr[i];
            }
        }
        return -1;
    }
}
