package data_structure.stacks.basics;
import java.util.*;
public class ReverseStack {
    public static void reverseIterative(Stack<Integer> st){
        Stack<Integer> gt = new Stack<>();
        Stack<Integer> rt = new Stack<>();
        while (!st.isEmpty()){
            gt.push(st.pop());
        }
        while (!gt.isEmpty()){
            rt.push(gt.pop());
        }
        while (!rt.isEmpty()){
            st.push(rt.pop());
        }
    }
    public static void reverseRecursive(Stack<Integer> st){
        if (st.size() == 1) return;
        int top = st.pop();
        reverseRecursive(st);
        pushAtBottom(st, top);
    }
    public static void pushAtBottom(Stack<Integer> st, int data){
        Stack<Integer> gt = new Stack<>();
        while(!st.isEmpty()){
            gt.push(st.pop());
        }
        st.push(data);
        while(!gt.isEmpty()){
            st.push(gt.pop());
        }
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        System.out.println("Original Stack:- "+st);
//        reverseIterative(st);
        reverseRecursive(st);
        System.out.println("Reversed Stack:- "+st);
    }
}
