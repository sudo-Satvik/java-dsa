package data_structure.stacks.a_basics;
import java.util.Stack;

/*Remove the element from bottom*/

public class G_RemoveAtBottom {
    public static int removeFromBottom(Stack<Integer> st) {
        Stack<Integer> temp = new Stack<>();
        // st -> temp
        while (!st.isEmpty()){
            temp.push(st.pop());
        }
        int removed = temp.pop();
        // temp -> st
        while (!temp.isEmpty()) {
            st.push(temp.pop());
        }
        return removed;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(5);
        st.push(6);
        st.push(7);
        st.push(8);
        st.push(9);

        System.out.println("Original Stack: " + st);
        removeFromBottom(st);
        System.out.println("Final Stack: " + st);
    }
}
