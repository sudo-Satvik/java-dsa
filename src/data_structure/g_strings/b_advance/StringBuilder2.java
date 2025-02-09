package data_structure.g_strings.b_advance;
import java.util.*;
// Functions for StringBuilder
public class StringBuilder2 {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("abcde");

        // setCharAt(idx, ch) and append(ch)
        str.setCharAt(1, 'z');
        System.out.println(str);
        System.out.println(str.append(str));
        System.out.println(str.append(10));

        // insert(idx, ch) and deleteCharAt(idx)
        StringBuilder gtr = new StringBuilder("hello");
        System.out.println(gtr.insert(2, 'y'));
        System.out.println(gtr.deleteCharAt(2));

        // reverse() and delete(firstIdx, lastIdx)
        StringBuilder sb = new StringBuilder("axyzte");
        System.out.println(sb.reverse());

    }
}
