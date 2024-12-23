package data_structure.stacks.basics;

import java.util.Stack;

public class H_RemoveAtAnyIndex {
    public static void removeFromLast(Stack<Integer> st, int idx) {
        Stack<Integer> temp = new Stack<>();
        int range = st.size() - idx;
        while (st.size() > range ) {
            temp.push(st.pop());
        }
        temp.pop();
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(85);
        st.push(19);
        st.push(55);
        st.push(71);

        System.out.println("Original Stack: "+st);

        removeFromLast(st, 3);
        System.out.println("Removing 3rd element: "+st);
    }
}
