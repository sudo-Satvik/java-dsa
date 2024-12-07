package data_structure.stacks.advance;

import java.util.Stack;

public class Infix {
    public static void main(String[] args) {
        String str = "9-5+3*4/6";
        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();
        for(int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int ascii = (int) ch;
            // Check for the number
            if (ascii>=48 && ascii<=57) val.push(ascii-48);
            // For operators
            else if (op.isEmpty() || ch == '(') op.push(ch);
            else{
                if (ch == '+' || ch == '-'){
                    // Work
                    int v2 = val.pop();
                    int v1 = val.pop();
                    if (op.peek() == '+') val.push(v1 + v2);
                    if (op.peek() == '-') val.push(v1 - v2);
                    if (op.peek() == '*') val.push(v1 * v2);
                    if (op.peek() == '/') val.push(v1 / v2);
                    op.pop();
                    op.push(ch);
                }
                if (ch == '*' || ch == '/') {
                    if (op.peek() == '*' || op.peek() == '/') {
                        int v2 = val.pop();
                        int v1 = val.pop();
                        if(op.peek() == '*') val.push(v2*v1);
                        if(op.peek() == '/') val.push(v2/v1);
                        op.pop();
                        op.push(ch);
                    } else op.push(ch);
                }
            }
        }

        // Now val stack need to be 1 size
        while(val.size() > 1) {
            int v2 = val.pop();
            int v1 = val.pop();
            if (op.peek() == '-') val.push(v1 - v2);
            if (op.peek() == '+') val.push(v1 + v2);
            if (op.peek() == '*') val.push(v1 * v2);
            if (op.peek() == '/') val.push(v1 / v2);
            op.pop();
        }
        System.out.println(val.peek());
    }
}
