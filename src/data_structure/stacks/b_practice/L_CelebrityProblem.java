package data_structure.stacks.b_practice;

import java.util.Stack;

// https://www.geeksforgeeks.org/problems/the-celebrity-problem/1
public class L_CelebrityProblem {
    public static int celebrity(int M[][]) {
        int n = M[0].length;
        Stack<Integer> st = new Stack<>();

        // Filling the stack
        for(int i = 0 ; i < n ; i++) {
            st.push(i);
        }

        while(st.size() > 1) {
            int v1 = st.pop();
            int v2 = st.pop();
            if(M[v1][v2] == 0) // v1 v2 ko nhi jaanta ~ v1 can be celeb but v2 is not
                st.push(v1);
            else if(M[v2][v1] == 0) // v2 v1 ko nhi jaanta ~ v2 can be celeb but v1 is not
                st.push(v2);
        }
        // Consider it have only two elements only
        if(st.isEmpty()) return -1;

        int potential = st.pop();

        for(int j = 0 ; j < n ; j++) {
            if(M[potential][j] == 1) // koi potential ko jaanta hai?
                return -1;
            else if(j!=potential && M[j][potential] == 0)
                return -1;
        }

        return potential;
    }

    public static void main(String[] args) {
        int[][] party = {
                {0, 1, 1, 1, 1, 1, 1, 1, 1, 1},  // Person 0 knows everyone
                {0, 0, 1, 1, 1, 1, 1, 1, 1, 1},  // Person 1 knows everyone except themselves
                {0, 0, 0, 1, 1, 1, 1, 1, 1, 1},  // Person 2 knows everyone after them
                {0, 0, 0, 0, 1, 1, 1, 1, 1, 1},  // ...
                {0, 0, 0, 0, 0, 1, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 1, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 1, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 1, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 1},
                {0, 0, 0, 0, 0, 0, 0, 0, 0, 0}   // Person 9 knows no one
        };
        System.out.println(celebrity(party));
    }
}
