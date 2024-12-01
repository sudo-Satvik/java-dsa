package data_structure.stacks.basics;

import java.util.*;
//Copy stack in same order
public class CopyStack {
    // Reverse the stack
    public static Stack<Integer> revStack(Stack<Integer> st) {
        Stack<Integer> revSt = new Stack<>();
        while (!st.isEmpty()) {
            revSt.push(st.pop());
        }
        return revSt;
    }

    // Copy the stack while preserving the original stack
    public static Stack<Integer> copyStack(Stack<Integer> st) {
        Stack<Integer> tempStack = new Stack<>();
        Stack<Integer> copiedStack = new Stack<>();

        // Push elements to a temporary stack to preserve original stack
        while (!st.isEmpty()) {
            tempStack.push(st.pop());
        }

        // Push elements from tempStack to copiedStack to maintain original order
        while (!tempStack.isEmpty()) {
            int element = tempStack.pop();
            copiedStack.push(element);
            st.push(element); // Restore original stack
        }

        return copiedStack;
    }

    public static void main(String[] args) {
        Stack<Integer> originalStack = new Stack<>();
        originalStack.push(1);
        originalStack.push(2);
        originalStack.push(3);

        System.out.println("Original Stack: " + originalStack);

        // Test copyStack method
        Stack<Integer> newStack = copyStack(originalStack);

        System.out.println("Copied Stack: " + newStack);
        System.out.println("Original Stack after Copy: " + originalStack);
    }
}
