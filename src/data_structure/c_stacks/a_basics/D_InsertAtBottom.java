package data_structure.c_stacks.a_basics;

// Inserting an element at the bottom of the stack

import java.util.Stack;

public class D_InsertAtBottom {
    public static void insertAtBottom(Stack<Integer> st, int val){
        Stack<Integer> temp = new Stack<>();

        // st -> temp
        while (!st.isEmpty()) {
            temp.push(st.pop());
        }
        temp.push(val);

        // temp -> st
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

        insertAtBottom(st, 100);
        System.out.println("After adding 100 at bottom: "+st);

        insertAtBottom(st, 2000);
        System.out.println("After adding 2000 at bottom: "+st);
    }
}
