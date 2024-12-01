package data_structure.stacks.basics;

import java.util.Stack;

public class UsingCollecFrameWork {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);        // First
        st.push(32);
        st.push(5);         // Last
        st.push(90);        // Removed
        st.pop();
        System.out.println(st.peek());
        System.out.println(st);
        System.out.println("Size: "+st.size());
    }
}
