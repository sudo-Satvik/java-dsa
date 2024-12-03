package data_structure.stacks.basics;

import java.util.Arrays;

public class UsingArray {
    public static class Stack{
        private int[] arr = new int[10];
        private int idx = 0;    // Used for Array Iterator
        void push(int x) {
            if(isFull()){
                System.out.println("Stack is full!");
                return;
            }
            arr[idx] = x;
            idx++;
        }
        int peek() {
            if(idx == 0){
                System.out.println("Your stack is empty!");
                return Integer.MIN_VALUE;
            }
            return arr[idx-1];
        }
        int pop(){
            if(idx == 0) {
                System.out.println("Your stack is empty!");
                return Integer.MIN_VALUE;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }
        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
        int size(){
            return idx;
        }
        boolean isEmpty(){
            if(idx == 0) return true;
            return false;
        }
        boolean isFull(){
            if(idx == arr.length) return true;
            else return false;
        }
        int capacity(){
            return arr.length;
        }
    }

    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.display();
        System.out.println("Top Element: "+st.peek());
        System.out.println("Size: "+st.size());
        st.pop();
        st.display();
        System.out.println("Top Element: "+st.peek());
        System.out.println("Size: "+st.size());
        System.out.println(st.capacity());
    }
}
