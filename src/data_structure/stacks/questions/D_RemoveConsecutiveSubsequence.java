// Given a sequence of numbers. Remove all the consecutive subsequences of length greater than or equal to 2 that contains the same element
package data_structure.stacks.questions;
import java.util.Arrays;
import java.util.Stack;
public class D_RemoveConsecutiveSubsequence {
    public static int[] removingSubsequences(int[] arr) {
        Stack<Integer> st = new Stack<>();
        for(int i = 0 ; i < arr.length ; i++){
            if (st.size() == 0|| st.peek() != arr[i]) st.push(arr[i]);
            else if (arr[i] == st.peek()){
                if (i == arr.length - 1 || arr[i] != arr[i+1]) st.pop();
            }
        }
        int[] ans = new int[st.size()];
        for (int i = ans.length - 1; i >= 0 ; i--) {
            ans[i] = st.pop();
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 4, 5, 6, 7, 7, 7, 7, 8, 8, 8, 9};
        System.out.println(Arrays.toString(removingSubsequences(arr)));
    }
}
