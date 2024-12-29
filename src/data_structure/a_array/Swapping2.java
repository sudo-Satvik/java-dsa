package data_structure.a_array;

public class Swapping2 {
    public static void main(String[] args) {
        swapping(100, 23);
    }
    private static void swapping(int a, int b){
        b = b - a;          // b = 13 - 12 = 1
        a = b + a;          // a = 13
        b = a - b;          // a - b
        System.out.println("a: "+a+" & "+"b: "+b);
    }
}
