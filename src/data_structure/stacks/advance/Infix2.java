package data_structure.stacks.advance;
import java.util.Scanner;
import java.util.Stack;

public class Infix2 {
    public static void main(String[] args) {
        String str = "3 + (5 + 4) * 4 / 2";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            if ((int)ch >= 48 && (int)ch <= 57) val.push((int)ch - 48);
            else if (op.isEmpty() || ch == '(' || op.peek() == '(') op.push(ch);
            else if (ch == ')'){
                while (op.peek() != '('){
                    int val2 = val.pop();
                    int val1 = val.pop();
                    if (op.peek() == '+') val.push(val1 + val2);
                    if (op.peek() == '-') val.push(val1 - val2);
                    if (op.peek() == '*') val.push(val1 * val2);
                    if (op.peek() == '/') val.push(val1 / val2);
                    op.pop();
                }
                op.pop();   // '(' hata diya
            }
            else{
                if (ch =='+' || ch == '-') {
                    int val2 = val.pop();
                    int val1 = val.pop();
                    // Performing the work
                    if (op.peek() == '+') val.push(val1 + val2);
                    if (op.peek() == '-') val.push(val1 - val2);
                    if (op.peek() == '/') val.push(val1 / val2);
                    if (op.peek() == '*') val.push(val1 * val2);
                    op.pop();
                    op.push(ch);
                } if (ch =='*' || ch == '/'){
                    if (op.peek() == '*' || op.peek() == '/'){
                        int val2 = val.pop();
                        int val1 = val.pop();
                        if (op.peek() == '/') val.push(val1 / val2);
                        if (op.peek() == '*') val.push(val1 * val2);
                        op.pop();
                        op.push(ch);
                    }else op.push(ch);
                }
            }
        }
        while (val.size() > 1) {
            int val2 = val.pop();
            int val1 = val.pop();
            if (op.peek() == '+') val.push(val1 + val2);
            if (op.peek() == '-') val.push(val1 - val2);
            if (op.peek() == '*') val.push(val1 * val2);
            if (op.peek() == '/') val.push(val1 / val2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
