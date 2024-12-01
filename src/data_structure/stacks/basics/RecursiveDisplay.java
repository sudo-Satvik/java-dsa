// Display Stack Recursively
package data_structure.stacks.basics;

import java.util.Stack;

public class RecursiveDisplay {
    public static void displayRecursively(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        displayRecursively(st);
        System.out.print(top+" ");
        st.push(top);
    }
    public static void displayRevRecursively(Stack<Integer> st) {
        if (st.isEmpty()) return;
        int top = st.pop();
        System.out.print(top+" ");
        displayRevRecursively(st);
        st.push(top);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(1);
        st.push(2);
        st.push(3);
        st.push(4);
        st.push(5);
        System.out.println(st);
        displayRecursively(st);
        System.out.println();
        displayRevRecursively(st);
    }
}
