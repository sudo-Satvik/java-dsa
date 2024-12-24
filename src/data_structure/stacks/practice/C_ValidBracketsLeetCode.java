package data_structure.stacks.practice;

import java.util.Stack;

public class C_ValidBracketsLeetCode {
    public static boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()) {
            if (ch == '(' || ch == '{' || ch == '[') st.push(ch);
            else if (!st.isEmpty()) {
                if (st.peek() == '(' && ch == ')') st.pop();
                else if (st.peek() == '[' && ch == ']') st.pop();
                else if (st.peek() == '{' && ch == '}') st.pop();
                else return false;
            } else return false;
        }
        return st.isEmpty();
    }

    public static void main(String[] args) {
        System.out.println(isValid("]"));
    }
}
