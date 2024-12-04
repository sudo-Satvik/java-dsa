package data_structure.stacks.questions;
import java.util.*;
// Check whether the given bracket sequence is balanced or not?
public class BalancedBrackets {
    public static boolean isBalanced(String str){
        Stack<Character> st = new Stack<>();
        int len = str.length();
        for (int i = 0; i < len; i++) {
            char ch = str.charAt(i);
            if (ch=='('){
                st.push(ch);
            } else{
                if (st.isEmpty()) return false;
                else if (st.peek() == '(') st.pop();
            }
        }
        if (st.isEmpty()) return true;
        return false;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println(isBalanced(str));
    }
}
