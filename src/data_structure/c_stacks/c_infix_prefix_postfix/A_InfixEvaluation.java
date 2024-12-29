package data_structure.c_stacks.c_infix_prefix_postfix;
import java.util.*;

/**
 * @Infix_Expressions: Infix expressions are mathematical expressions where operators are placed between operands. For example, in the expression 3 + 5, the operator + is between the two operands 3 and 5. This is the standard way of writing expressions in arithmetic and most programming languages, where operators (like +, -, *, /) are written in the middle of the numbers or variables they operate on.*/

public class A_InfixEvaluation {
    public static int infixExpression(String str) {
        Stack<Integer> numbers = new Stack<>();
        Stack<Character> operators = new Stack<>();
        for (int i = 0 ; i < str.length() ; i++) {
            char ch = str.charAt(i);
            int ascii = (int)ch;
            // '0' -> 48 and '9' -> 57
            if (ascii >= 48 && ascii <= 57)
                numbers.push(ascii - 48);
            else if (operators.size() == 0)
                operators.push(ch);
            else {
                if (ch == '+' || ch == '-') {
                    int val1 = numbers.pop();
                    int val2 = numbers.pop();
                    // Doing operations
                    if (operators.peek() == '-') numbers.push(val2 - val1);
                    if (operators.peek() == '+') numbers.push(val2 + val1);
                    if (operators.peek() == '*') numbers.push(val2 * val1);
                    if (operators.peek() == '/') numbers.push(val2 / val1);
                    operators.pop();
                    // Work ke baad push krdo
                    operators.push(ch);
                }
                if(ch =='*' || ch == '/') {
                    if (operators.peek() =='*' || operators.peek() == '/') {
                        int val1 = numbers.pop();
                        int val2 = numbers.pop();
                        // Doing operations
                        if (operators.peek() == '*') numbers.push(val2 * val1);
                        if (operators.peek() == '/') numbers.push(val2 / val1);
                        operators.pop();
                        // Work ke baad push krdo
                        operators.push(ch);
                    } else operators.push(ch);
                }
            }
        }
        // Number stack should be of 1 size
        while (numbers.size() > 1) {
            int val1 = numbers.pop();
            int val2 = numbers.pop();
            if (operators.peek() == '+') numbers.push(val2 + val1);
            if (operators.peek() == '-') numbers.push(val2 - val1);
            if (operators.peek() == '*') numbers.push(val2 * val1);
            if (operators.peek() == '/') numbers.push(val2 / val1);
            operators.pop();
        }
        return numbers.peek();
    }
    public static void main(String[] args) {
        String str = "9-5+3*4/6";

        System.out.println(str + "= " +infixExpression(str));
    }
}
