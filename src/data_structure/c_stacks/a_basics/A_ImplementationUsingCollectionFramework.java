package data_structure.c_stacks.a_basics;
import java.util.Stack;

public class A_ImplementationUsingCollectionFramework {
    public static void main(String[] args) {
        // Stack created
        Stack<Integer> stack = new Stack<>();

        System.out.println("Is the stack empty(true/false): "+stack.isEmpty());


        // Pushing/Inserting the element
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println("Stack: "+stack);
        stack.push(5);

        // Getting the top most value in the stack
        System.out.println("Top most element: "+stack.peek());
        stack.push(6);
        System.out.println("Top most element: "+stack.peek());

        // Removing the top most value and returning the removed value
        System.out.println("The value which is removed: "+stack.pop());
        stack.pop();
        System.out.println(stack);

        // Size of the stack
        System.out.println("Size of the stack: "+stack.size());

        // Checking if the stack is empty or not?
        System.out.println("Is the stack empty(true/false): "+stack.isEmpty());
    }
}
