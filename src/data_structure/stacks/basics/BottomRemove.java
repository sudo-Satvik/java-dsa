package data_structure.stacks.basics;

import java.util.Stack;

public class BottomRemove {
    public static Stack<Integer> remBottom(Stack<Integer> st) {
        Stack<Integer> rt = new Stack<>();
        // First: copy the stack data to new stack except the last data
        while (st.size() > 1) {
            rt.push(st.pop());
        }
        // Remove all the rest data present in the st
        st.pop();
        // Now again revert the data to original stack
        while(!rt.isEmpty()) {
            st.push(rt.pop());
        }
        return st;
    }

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        System.out.println("Original Stack: "+st);
        System.out.println("Expected Stack: "+remBottom(st));
    }
}
