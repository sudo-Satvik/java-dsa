package data_structure.c_stacks.c_infix_prefix_postfix;

import java.util.Stack;

public class D_InfixToPostfixExpressions {
    public static void main(String[] args) {
        String str = "9-(5+3)*4/6";
        Stack<String> num = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57) {
                String s = "" + ch;
                num.push(s);
            } else if (opr.isEmpty() || ch == '(' || opr.peek() == '(') opr.push(ch);
            else if (ch == ')'){
                while (opr.peek() != '(') {
                    // Performing the task
                    String v2 = num.pop();
                    String v1 = num.pop();
                    char o = opr.pop();
                    String t = v1 + v2 + o;
                    num.push(t);
                }
                opr.pop();      // removing the bracket
            } else {
                if (ch == '+' || ch =='-'){
                    String v2 = num.pop();
                    String v1 = num.pop();
                    char o = opr.pop();
                    String t = v1 + v2 + o;
                    num.push(t);
                    opr.push(ch);
                }
                if (ch == '*' || ch == '/'){
                    if (opr.peek() == '*' || opr.peek() == '/'){
                        String v2 = num.pop();
                        String v1 = num.pop();
                        char o = opr.pop();
                        String t = v1 + v2 + o;
                        num.push(t);
                    }
                    opr.push(ch);
                }
            }
        }
        while (num.size() > 1) {
            String v2 = num.pop();
            String v1 = num.pop();
            char o = opr.pop();
            String t = v1 + v2 + o;
            num.push(t);
        }

        String postfix = num.pop();

        System.out.println("Ans: " + postfix);
    }
}
