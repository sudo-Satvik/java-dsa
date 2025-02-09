package data_structure.g_strings.b_advance;
import java.util.*;
/**@StringBuilder: It is a class, used instead of string for performance enhancement
 * <h3>Important Constructors of StringBuilder class</h3>
 * <ul>
 *     <li>StringBuilder()</li>
 *     <li>StringBuilder(String str)</li>
 *     <li>StringBuilder(int capacity)</li>
 *     <p>By-default capacity is 16</p>
 * </ul>
 * */
public class StringBuilder1 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("Hello World");
        System.out.println("String Builder says: " + str);

        StringBuilder empty = new StringBuilder();
        System.out.println("Empty Builder have: " + empty.length() + " elements");

        StringBuilder capacity = new StringBuilder(10);
        System.out.println("Capacity of this String is: " + capacity.capacity());
    }
}
