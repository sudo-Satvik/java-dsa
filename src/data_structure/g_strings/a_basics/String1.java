package data_structure.g_strings.a_basics;

public class String1 {
    public static void main(String[] args) {
        String str = "Satvik";
        String gtr = "ratvik";
        System.out.println(str);

        // charAt() function of string
        System.out.println("Char At result: " + str.charAt(0));

        // length() function of string
        System.out.println("Length result: " + str.length());

        // indexOf() function of string
        // opposite of charAt(). indexOf() returns the index of given element
        System.out.println("Index of result: " + str.indexOf("t"));

        // compareTo() function of string
        // returns 0  if both strings are same and returns +ve if first letter is of a string is lexicographically
        // greater and returns -ve if that element is small.

        System.out.println("Compare to result: " + str.compareTo(gtr));


        // contains() function of string
        System.out.println("Does vik present: " + str.contains("vik"));

        // startsWith() function of string
        System.out.println("Starts with Sat: " + str.startsWith("Sat"));

        // endsWith() function of string
        System.out.println("Ends with ik: " + str.endsWith("ik"));

        // toLowerCase(), toUpperCase() functions of string
        System.out.println(str.toLowerCase());
        System.out.println(str.toUpperCase());

        // concat(strName) function of string
        System.out.println(str.concat(gtr));
    }
}
