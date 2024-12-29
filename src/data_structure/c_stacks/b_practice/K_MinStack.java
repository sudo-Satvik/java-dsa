package data_structure.c_stacks.b_practice;
import java.util.Stack;

/**
 * A stack data structure that supports push, pop, top, and retrieving the minimum element in constant time.
 * <p>
 * This class implements the following operations:
 * <ul>
 *   <li>push(int val): Pushes the element {@code val} onto the stack.</li>
 *   <li>pop(): Removes the element on the top of the stack.</li>
 *   <li>top(): Retrieves the top element of the stack.</li>
 *   <li>getMin(): Retrieves the minimum element in the stack.</li>
 * </ul>
 *
 * <p>All operations are guaranteed to run in O(1) time complexity.</p>
 *
 * <p>Example usage:</p>
 * <pre>{@code
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * int min = minStack.getMin(); // Returns -3
 * minStack.pop();
 * int top = minStack.top();    // Returns 0
 * min = minStack.getMin();     // Returns -2
 * }</pre>
 */

public class K_MinStack {
    public static void main(String[] args) {
        Solution sol = new Solution();
        sol.push(12);
        sol.push(13);
        sol.push(2);
        sol.push(-23);
        sol.push(45);
        sol.push(55);
        System.out.println(sol.getMin());
    }
}

class Solution{
    Stack<Integer> st, min;
    public Solution() {
        st = new Stack<>();
        min = new Stack<>();
    }

    public void push(int val) {
        st.push(val);
        if (min.isEmpty() || min.peek() >= val) min.push(val);
    }

    public void pop() {
        if (st.peek().equals(min.peek())) min.pop();
        st.pop();
    }

    public int top() {
        return st.peek();
    }

    public int getMin() {
        return min.peek();
    }
}