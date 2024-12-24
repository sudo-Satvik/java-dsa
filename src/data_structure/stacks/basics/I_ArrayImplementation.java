package data_structure.stacks.basics;

import java.util.Arrays;

/*Implementation of the array in a stack*/
public class I_ArrayImplementation {
    public static class Stack {
        private int[] arr = new int[100];
        private int idx = 0;
        void push(int x) {
            arr[idx] = x;
            idx++;
        }

        int peek() {
            if (idx == 0) {
                System.out.println("Empty stack");
                return Integer.MIN_VALUE;
            }
            return arr[idx - 1];
        }

        int pop() {
            if (idx == 0) {
                System.out.println("Stack is empty!");
                return Integer.MIN_VALUE;
            }
            int top = arr[idx - 1];
            arr[idx - 1] = 0;
            idx--;
            return top;
        }

        void display() {
            for (int i = 0; i < idx; i++) {
                System.out.print(arr[i] + " ");
            }
        }

        int size() {
            return idx;
        }
    }
    public static void main(String[] args) {
        Stack st = new Stack();
        st.push(12);
        st.push(13);
        st.push(14);
        st.push(15);
        st.push(16);
        st.push(18);

        st.pop();

        st.display();

        System.out.println("\nPeek element: "+st.peek());
        System.out.println("Size of the stack: "+st.size());
    }
}
