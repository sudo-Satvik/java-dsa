package data_structure.c_stacks.c_infix_prefix_postfix;

import java.util.Stack;

public class I_PostfixToInfixConversion {
    public static void main(String[] args) {
        String postfix = "953+4*6/-";
        Stack<String> st = new Stack<>();
        for (int i = 0 ; i < postfix.length() ; i++) {
            char ch = postfix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) st.push(""+ch);
            else{
                String val1 = st.pop();
                String val2 = st.pop();
                char o = ch;
                st.push("(" + val2 + o + val1 + ")");
            }
        }
        System.out.println(st.peek());
    }
}
