package data_structure.a_array;
// Program to find the sum of all element in the array
public class Sum {
    public static void main(String[] args) {
        int[] arr = {1, 23, 54, 75, 34};
        sum(arr);
    }
    public static void sum(int[] arr){
        int sum = 0;
        for(int a : arr){
            sum += a;
        }
        System.out.println(sum);
    }
}
