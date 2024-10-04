package data_structure.array;

public class Occurence{
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 2, 4, 5, 1, 4};
        System.out.println(occurence(arr, 1));
    }
    private static int occurence(int[] arr, int target){
        int count = 0;
        for (int a : arr) {
            if (a == target) count++;
        }
        return count;
    }
}
