package data_structure.stacks.practice;

import java.util.Stack;

/**
 * @Quest: Check Whether a given bracket is balanced or not?
 * @Explaination1: String str = "()(())"   -> Yes Balanced
 * @Explaination2: String str = "()((()))(())"   -> Yes Balanced
 * @Explaination3: String str = "((())"   -> Not Balanced
 * @Explaination4: String str = "()(()"   -> Not Balanced
 * */

public class A_BalancedBrackets {
    public static boolean isBalanced(String str) {
        Stack<Character> st = new Stack<>();
        for (char ch : str.toCharArray()) {
            if (ch == '(') st.push(ch);
            else if (!st.isEmpty() && st.peek() == '(' && ch == ')') st.pop();
            else return false;
        }
        return st.isEmpty();
    }
    public static void main(String[] args) {
        String str = "()(())";
        System.out.println("Ans: " + isBalanced(str));
    }
}
