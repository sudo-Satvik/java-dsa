package data_structure.stacks.basics;

import java.util.Stack;

public class BottomInsert {
    public static void insertAtBottom(Stack<Integer> st, int data){
        Stack<Integer> gt = new Stack<>();
        while (!st.isEmpty()) {
            gt.push(st.pop());
        }
        gt.push(data);
        while (!gt.isEmpty()) {
            st.push(gt.pop());
        }
        System.out.println("Expected Stack: "+st);
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(17);
        System.out.println("Original Stack: "+st);
        insertAtBottom(st, 11);
    }
}
