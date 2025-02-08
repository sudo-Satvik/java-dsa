package data_structure.g_strings.a_basics;
// String Immutability
public class String5 {
    public static void main(String[] args) {
        String message = "Hello";
        // We want to convert the given string to "Heylo"
//        message.charAt(2) = 'y';        // Not allowed in string because string is mutable

        System.out.println(message.substring(0, 2) + 'y' + message.substring(3));
    }
}
