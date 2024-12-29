package data_structure.c_stacks.b_practice;
import java.util.*;

/**
 * @Question: The stock span problem is a financial problem where we have a series of daily price quotes for a stock and we need to calculate the span of stock price for all days. The span arr[i] of the stocks price on a given day i is defined as the maximum number of consecutive days just before the given day, for which the price of the stock on the given day is less than or equal to its price on the current day.
 *
 * @Example: arr[] = [100, 80, 60, 70, 60, 75, 85] ==> [1, 1, 1, 2, 1, 4, 6]
 * @Example2: arr[] = [10, 4, 5, 90, 120, 80] ==> [1, 1, 2, 4, 5, 1]
 * */

public class G_StockSpan {
        // Function to calculate the span of stock's price for all n days.
    public static ArrayList<Integer> calculateSpan(int[] arr) {
        ArrayList<Integer> span = new ArrayList<>();
        Stack<Integer> st = new Stack<>();

        for (int i = 0 ; i < arr.length ; i++) {
            while (!st.isEmpty() && arr[st.peek()] <= arr[i]) {
                st.pop();
            }

            if (st.isEmpty()) span.add(i + 1);
            else span.add(i - st.peek());

            st.push(i);
        }
        return span;
    }
    public static void main(String[] args) {
        int[] testCase1 = {100, 80, 60, 70, 60, 75, 85};        // [1, 1, 1, 2, 1, 4, 6]
        int[] testCase2 = {10, 4, 5, 90, 120, 80};              // [1, 1, 2, 4, 5, 1]
        int[] testCase3 = {11, 4, 5, 90, 120, 80};              // [1, 1, 2, 4, 5, 1]
        System.out.println("Stocks: " + Arrays.toString(testCase1));
        System.out.println("Answer1: " + calculateSpan(testCase1));
        System.out.println("====================================");
        System.out.println("Stocks: " + Arrays.toString(testCase2));
        System.out.println("Answer2: " + calculateSpan(testCase2));
        System.out.println("====================================");
        System.out.println("Stocks: " + Arrays.toString(testCase3));
        System.out.println("Answer3: " + calculateSpan(testCase3));
    }
}
