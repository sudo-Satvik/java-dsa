package data_structure.stacks.basics;
/*
stack overflow refers to a condition where the stack data structure exceeds its capacity, leading to an error. It can
happen in programming environments where memory for the stack is limited.
* */
public class StackOverflow {
    public static class Stack{
        private int[] arr = new int[5];
        private int idx = 0;    // Used for Array Iterator
        void push(int x) {
            if (idx== arr.length) System.out.println("Stack is full! Stack Overflow!!!");
            arr[idx] = x;
            idx++;
        }
        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(17);
        st.display();
    }
}
