package data_infixucture.stacks.c_infix_prefix_postfix;
import java.util.*;
/**
 * @Infix: a + b        where a, b belongs to {1,2,3,...,9}
 * @Prefix: +ab
 * @Postfix: ab+ */

public class C_InfixToPrefixExpressions {
    public static void main(String[] args) {
        String infix = "9-(5+3)*4/6";
        /*
        * 9 - (5 + 3) * 4 / 6
        * 9 - +53 * 4 / 6
        * 9 - *+534 / 6
        * 9 - /*+5346
        * -9/*+5346
        */
        Stack<String> num = new Stack<>();
        Stack<Character> opr = new Stack<>();
        for (int i = 0; i < infix.length(); i++) {
            char ch = infix.charAt(i);
            int ascii = (int)ch;
            if (ascii >= 48 && ascii <= 57){
                // Converting Char to String and push to the num Stack
                String s = "" + ch;
                num.push(s);
            }
            else if (opr.isEmpty() || ch == '(' || opr.peek() == '(')
                opr.push(ch);
            else if (ch ==')'){
                while (opr.peek() != '(') {
                    // Perform the work
                    String v2 = num.pop();
                    String v1 = num.pop();
                    char o = opr.pop();
                    String t = o + v1 + v2;
                    num.push(t);
                }
                opr.pop();      // '(' removed
            } else{
                if (ch == '*' || ch == '/'){
                    if (opr.peek() == '*' || opr.peek() == '/'){
                        String v2 = num.pop();
                        String v1 = num.pop();
                        char o = opr.pop();
                        String t = o + v1 + v2;
                        num.push(t);
                    }
                    opr.push(ch);
                }
                if (ch == '+' || ch =='-'){
                    String v2 = num.pop();
                    String v1 = num.pop();
                    char o = opr.pop();
                    String t = o + v1 + v2;
                    num.push(t);
                    opr.push(ch);
                }
            }
        }
        while (num.size() > 1){
            String v2 = num.pop();
            String v1 = num.pop();
            char o = opr.pop();
            String t = o + v1 + v2;
            num.push(t);
        }
        String prefix = num.pop();
        System.out.println("Ans: "+prefix);
    }
}
