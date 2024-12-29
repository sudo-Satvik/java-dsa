package data_structure.c_stacks.a_basics;

import java.util.Stack;

/* Copying elements from one stack to another in same order*/
public class B_CopyingStack {
    public static Stack<Integer> deepCopyMaker(Stack<Integer> st){
        Stack<Integer> res = new Stack<>();
        Stack<Integer> temp = new Stack<>();

        // st -> temp
        while (!st.isEmpty()){
            temp.push(st.pop());
        }

        // temp -> res
        while (!temp.isEmpty()) {
            res.push(temp.pop());
        }
        return res;
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(12);
        st.push(56);
        st.push(72);
        st.push(26);
        st.push(108);

        System.out.println("The original stack: "+st);

        Stack<Integer> cst = deepCopyMaker(st);
//        cst.pop();            /*Proof that orig doesn't get affect*/
        System.out.println("The copied stack: "+cst);

    }
}
