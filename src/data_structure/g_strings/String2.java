package data_structure.g_strings;
// String + int or char or String
public class String2 {
    public static void main(String[] args) {
        String str = "abc";
        str += "def";
        str += 'S';
        str += 10;
        System.out.println(str);


        // Important
        System.out.println("abc" + "xyz");           // string + string
        System.out.println("abc" + 'x');             // string + char
        System.out.println("abc" + 10);              // string + number
        System.out.println("abc" + 10 + 20);         // string + number + number
        System.out.println(10 + 20 + "abc");         // number + number + string
    }
}
