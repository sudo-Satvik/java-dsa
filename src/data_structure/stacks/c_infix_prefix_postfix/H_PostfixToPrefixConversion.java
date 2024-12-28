package data_structure.stacks.c_infix_prefix_postfix;

import java.util.Stack;

public class H_PostfixToPrefixConversion {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";        // -9/*+5346
        Stack<String> st = new Stack<>();
        for (int i = 0 ; i < postfix.length() ; i++) {
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) st.push(""+ch);
            else{
                String val2 = st.pop();
                String val1 = st.pop();
                char o = ch;
                st.push(o + val1 + val2);
            }
        }
        System.out.println("Ans: " + st.peek());
    }
}
