package data_structure.array;

public class Max {
    public static void main(String[] args) {
        int[] arr = {1, 23, 54, 75, 34};
        max(arr);
    }

    private static void max(int[] arr) {
        int max = Integer.MIN_VALUE;
        for (int a : arr){
            if (max < a){
                max = a;
            }
        }
        System.out.println("The max value in the array is: " + max);
    }
}
