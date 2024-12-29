package data_structure.a_array;

public class Swapping {
    public static void main(String[] args) {
        int a = 13, b = 14;
        swap(a, b);
    }
    private static void swap(int a, int b){
        int temp = b;
        b = a;
        a = temp;
        System.out.println("a: "+a+" & b: "+b);
    }
}
