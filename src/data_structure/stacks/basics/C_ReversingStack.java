package data_structure.stacks.basics;

import java.util.Stack;

public class C_ReversingStack {
    public static void reversingStack(Stack<Integer> st){
        Stack<Integer> res = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        // st -> temp
        while (!st.isEmpty()){
            temp.push(st.pop());
        }

        // temp -> res
        while (!temp.isEmpty()) {
            res.push(temp.pop());
        }

        // res -> st
        while (!res.isEmpty()) {
            st.push(res.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(56);
        st.push(72);
        st.push(26);
        st.push(108);

        System.out.println("The original stack: "+st);

        reversingStack(st);

        System.out.println("The reversed stack: "+st);

    }
}
