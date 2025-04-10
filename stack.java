import java.util.*;

public class stack{
    public static void main(String[] args){
        Stack<String> stack = new Stack<String>();
        //System.out.println(stack.empty());
        stack.push("minecraft");
        stack.push("skyrim");
        stack.push("DOM");
        System.out.println(stack.empty());
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());
        System.out.println(stack);
        System.out.println(stack.search("minecraft"));
        System.out.println(stack.search("xyz"));

        // stack LIFO stores objects

        
        //use case of stack
        // 1. undo redo features in text editors
        // 2. moving back forword through browser history
        // 3. backtracking algorithms
        // 4. calling functions (call stack)

    }
}