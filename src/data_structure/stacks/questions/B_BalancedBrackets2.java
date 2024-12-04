package data_structure.stacks.questions;
import java.util.Stack;
public class B_BalancedBrackets2 {
    public static int numberOfNonBalancedBrackets(String str){
        int ans = 0;
        Stack<Character> st = new Stack<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch == '(') st.push(ch);
            else if (ch == ')'){
                if (!st.isEmpty() && st.peek() == '(') st.pop();
                else ans++;
            }
        }
        ans += st.size();
        return ans;
    }
    public static void main(String[] args) {
//        String str = "()()()(";
//        String str = "((()()()))";
//        String str = "(())(())";
        String str = "((()))))";
        System.out.println(numberOfNonBalancedBrackets(str));
    }
}
