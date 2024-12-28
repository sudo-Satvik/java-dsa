package data_structure.stacks.c_infix_prefix_postfix;
import java.util.Stack;

public class G_PrefixToPostConversion {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";        // 953+4*6/-
        Stack<String> st = new Stack<>();
        // if prefix, we'll run the loop in opposite direction
        for (int i = prefix.length() - 1 ; i >= 0 ; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) st.push(""+ch);
            else{
                String val1 = st.pop();
                String val2 = st.pop();
                char o = ch;
                st.push(val1 + val2 + o);
            }
        }
        System.out.println(st.peek());
    }
}
