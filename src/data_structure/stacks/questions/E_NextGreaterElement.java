package data_structure.stacks.questions;

import java.util.Arrays;
import java.util.Stack;

public class E_NextGreaterElement {
    public static int[] usingStack(int[] arr){
        int[] ansArr = new int[arr.length];
        int n = ansArr.length;
        Stack<Integer> st = new Stack<>();
        ansArr[n - 1] = -1;
        for (int i = n - 2; i >= 0 ; i--) {
            while (st.size() > 0 && st.peek() < arr[i]){
                st.pop();
            }
            if (st.isEmpty()) ansArr[i] = -1;
            else ansArr[i] = st.peek();
            st.push(arr[i]);
        }
        return ansArr;
    }

    public static int[] usingNestedLoop(int[] arr) {
        int[] ansArr = new int[arr.length];
        for(int i = 0 ; i < arr.length ; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if (arr[i] < arr[j]){
                    ansArr[i] = arr[j];
                    break;
                } else {
                    ansArr[i] = -1;
                }
            }
        }
        return ansArr;
    }


    public static void main(String[] args) {
        int[] arr = {1, 3, 2, 1, 8, 6, 3, 4};
        System.out.println(Arrays.toString(usingNestedLoop(arr)));
        System.out.println(Arrays.toString(usingStack(arr)));
    }
}
