package data_structure.stacks.basics;

import java.util.Stack;

public class StackUnderflow {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        System.out.println("Original Stack:- "+st);
        // Stack Underflow: The situation when the data of the stack is become empty, and we can't perform operations
        // like st.pop() or st.peek() because it's throw an exception: EmptyStackException
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
        st.pop();
        System.out.println(st);
    }
}
