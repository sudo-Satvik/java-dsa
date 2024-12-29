package data_structure.c_stacks.c_infix_prefix_postfix;

import java.util.Stack;

// For evaluating the prefix expression, I have to convert the prefix to infix and then solve it
public class E_PrefixEvaluation {
    public static void main(String[] args) {
        String str = "-9/*+5346";
        Stack<Integer> st = new Stack<>();
        for (int i = str.length() - 1 ; i >= 0 ; i--) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) st.push(ascii - 48);
            else{
                int v2 = st.pop();
                int v1 = st.pop();
                if (ch == '+') st.push(v2 + v1);
                if (ch == '-') st.push(v2 - v1);
                if (ch == '/') st.push(v2 / v1);
                if (ch == '*') st.push(v2 * v1);
            }
        }
        System.out.println("Ans: " + st.peek());
    }
}
