package data_structure.c_stacks.c_infix_prefix_postfix;

import java.util.Stack;

public class J_PrefixToInfixConversion {
    public static void main(String[] args) {
        String prefix = "-9/*+5346";
        Stack<String> st = new Stack<>();
        for (int i = prefix.length() - 1 ; i >= 0 ; i--) {
            char ch = prefix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) st.push(""+ch);
            else{
                String val2 = st.pop();
                String val1 = st.pop();
                char o = ch;
                st.push("(" + val2 + o + val1 + ")");
            }
        }
        System.out.println("Ans: "+st.peek());
    }
}
