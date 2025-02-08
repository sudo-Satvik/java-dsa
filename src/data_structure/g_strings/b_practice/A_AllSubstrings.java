package data_structure.g_strings.b_practice;
// Write a Java code to print the all Subsequences of a String

public class A_AllSubstrings {
    public static void main(String[] args) {
        String str = "abcd";
        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j <= str.length(); j++) {
                System.out.print(str.substring(i, j) + " ");
            }
        }
    }
}
