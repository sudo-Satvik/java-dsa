package data_structure.g_strings.c_practice;

public class C_ReversingString {
    public static StringBuilder reverseString(StringBuilder str) {
        int start = 0, end = str.length() - 1;
        while (start < end) {
            // reversing the elements
            char temp = str.charAt(start);
            str.setCharAt(start, str.charAt(end));
            str.setCharAt(end, temp);
            start++;
            end--;
        }
        return str;
    }
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("satvik");
        System.out.println(reverseString(str));
    }
}
