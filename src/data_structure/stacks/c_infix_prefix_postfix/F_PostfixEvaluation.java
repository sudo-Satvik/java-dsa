package data_structure.stacks.c_infix_prefix_postfix;

import java.util.Stack;

// For evaluating the postfix expression, I have to convert the postfix to infix and then solve it
public class F_PostfixEvaluation {
    public static void main(String[] args) {
        String str = "953+4*6/-";
        Stack<Integer> st = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) st.push(ascii - 48);
            else {
                int v1 = st.pop();
                int v2 = st.pop();
                if (ch == '+') st.push(v2 + v1);
                if (ch == '-') st.push(v2 - v1);
                if (ch == '*') st.push(v2 * v1);
                if (ch == '/') st.push(v2 / v1);
            }
        }
        System.out.println(st.peek());
    }
}
