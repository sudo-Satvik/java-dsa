package data_structure.a_array;

public class SecondMaximum {
    public static void main(String[] args) {
        int[] arr = {1, -1, 2, 3, 4};
        System.out.println(secondMaximum(arr));
        System.out.println(findingSecondMin(arr));
    }
    private static int secondMaximum(int[] arr){
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = i;
            }
        }
        arr[max] = Integer.MIN_VALUE;
        max = Integer.MIN_VALUE;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max){
                max = i;
            }
        }
        return max;
    }
    public static int findingMin(int[] arr){
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] < min) min = arr[i];
            }
        }
        return min;
    }

    public static int findingSecondMin(int[] arr){
        int min = findingMin(arr);
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (arr[i] == min) arr[i] = Integer.MAX_VALUE;
        }
        return findingMin(arr);
    }

}
