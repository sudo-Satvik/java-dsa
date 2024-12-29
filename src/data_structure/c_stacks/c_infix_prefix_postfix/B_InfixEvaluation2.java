package data_structure.c_stacks.c_infix_prefix_postfix;

import java.util.Stack;

public class B_InfixEvaluation2 {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<Integer> num = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                num.push(ascii - 48);
            } else if (opr.isEmpty() || ch == '(' || opr.peek() == '(') {
                opr.push(ch);
            } else if (ch == ')') {
                // work and pop
                while (opr.peek() != '(') {
                    int val2 = num.pop();
                    int val1 = num.pop();
                    if (opr.peek() == '-') num.push(val1 - val2);
                    if (opr.peek() == '+') num.push(val1 + val2);
                    if (opr.peek() == '*') num.push(val1 * val2);
                    if (opr.peek() == '/') num.push(val1 / val2);
                    // popping the operators within braces
                    opr.pop();
                }
                // popping the opening bracket
                opr.pop();
            } else{
                if (ch == '*' || ch == '/') {
                    if (opr.peek() == '*' || opr.peek() == '/'){
                        int val2 = num.pop();
                        int val1 = num.pop();
                        // Performing the operations
                        if (opr.peek() == '*') num.push(val1 * val2);
                        if (opr.peek() == '/') num.push(val1 / val2);
                        opr.pop();
                    }
                    opr.push(ch);
                }
                if (ch == '+' || ch == '-') {
                    int val2 = num.pop();
                    int val1 = num.pop();
                    if (opr.peek() == '-') num.push(val1 - val2);
                    if (opr.peek() == '+') num.push(val1 + val2);
                    if (opr.peek() == '*') num.push(val1 * val2);
                    if (opr.peek() == '/') num.push(val1 / val2);
                    opr.pop();
                    opr.push(ch);
                }
            }
        }

        while (num.size() > 1) {
            int val2 = num.pop();
            int val1 = num.pop();
            if (opr.peek() == '-') num.push(val1 - val2);
            if (opr.peek() == '+') num.push(val1 + val2);
            if (opr.peek() == '*') num.push(val1 * val2);
            if (opr.peek() == '/') num.push(val1 / val2);
            opr.pop();
        }

        System.out.println("Ans: " + num.peek());
    }
}
