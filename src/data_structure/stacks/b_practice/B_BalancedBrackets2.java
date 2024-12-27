package data_structure.stacks.b_practice;

import java.util.Stack;

/**
 * @Quest: Find the minimum number bracket is needed to removed to make the given bracket as a balanced
 * @Explaination1: String str = "()(())"   -> 0
 * @Explaination2: String str = "()((()))(())"   -> 0
 * @Explaination3: String str = "((())"   -> 1
 * @Explaination4: String str = "()(()"   -> 1
 * */

public class B_BalancedBrackets2 {
    public static int balancedParenthesis2(String str) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for (char ch : str.toCharArray()) {
            if (ch == '(') {
                st.push(ch);
            } else if (!st.isEmpty() && st.peek() == '(' && ch == ')') {
                st.pop();
            } else st.push(ch);
        }
        count += st.size();
        return count;
    }
    public static void main(String[] args) {
        String str = "(()()(";
        System.out.println("Ans: " + balancedParenthesis2(str));
    }
}
