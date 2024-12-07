package data_structure.stacks.questions;

import java.util.Stack;

public class H_MinStack {
        Stack<Long> st = new Stack<>(); // Use Long to avoid overflow during encoding
        long min;

        public H_MinStack() {
            min = Long.MAX_VALUE; // Initialize min to a very large value
        }

        public void push(int val) {
            if (st.isEmpty()) {
                st.push(0L); // Store the difference (val - min), which is 0 for the first element
                min = val;
            } else {
                st.push((long) val - min); // Store the difference to encode the min
                if (val < min) {
                    min = val; // Update min if val is smaller
                }
            }
        }

        public void pop() {
            if (st.isEmpty()) return;

            long top = st.pop(); // Get the top element
            if (top < 0) {
                // If the top is negative, it means the min was updated
                min = min - top; // Restore the previous min
            }
        }

        public int top() {
            if (st.isEmpty()) return -1;

            long top = st.peek();
            if (top > 0) {
                return (int) (min + top); // Decode the value if it's not negative
            } else {
                return (int) min; // If negative, return the current min
            }
        }

        public int getMin() {
            if (st.isEmpty()) return -1;
            return (int) min;
        }
    }


