package data_structure.c_stacks.a_basics;

import java.util.Stack;

public class E_InsertAtAnyIndex {
    public static void insertFromLast(Stack<Integer> st, int n, int val) {
        Stack<Integer> temp = new Stack<>();
        int range = st.size() - n + 1;
        while (st.size() > range ) {
            temp.push(st.pop());
        }
        temp.push(val);

        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
    }
    public static void insertFromFirst(Stack<Integer> st, int n, int val) {
        Stack<Integer> temp = new Stack<>();
        int range = st.size() - n + 1;
        while (st.size() > range) {
            temp.push(st.pop());
        }
        temp.push(val);

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

        insertFromLast(st, 3, 100);
        System.out.println("Inserting at 3rd position from last: "+st);

        insertFromFirst(st, 2, 1000);
        System.out.println("Inserting at 2nd position from first: "+st);
    }
}
