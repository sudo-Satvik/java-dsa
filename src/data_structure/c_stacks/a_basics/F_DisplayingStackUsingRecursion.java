package data_structure.c_stacks.a_basics;

import java.util.Stack;

public class F_DisplayingStackUsingRecursion {
    public static void displayRecursive(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRecursive(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(17);
        System.out.println("Expected: "+st);
        System.out.print("Output: ");
        displayRecursive(st);
    }
}
