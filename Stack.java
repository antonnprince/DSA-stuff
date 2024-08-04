import java.util.Stack;

public class Stack{
    public static void main(String[] args)
    {
        Stack<Integer> stack = new Stack<>();
        
        stack.push(0);
        stack.push(1);
        stack.push(2);
        System.out.println("Current stack is ");
        for(Integer item : stack)
        {
            System.out.println(item);
        }
        
        System.out.println("Topmost element is "+stack.peek());

        stack.pop();
        
        System.out.println("Stack after popping ");

        for(Integer item : stack)
        {
            System.out.println(item);
        }
        
        System.out.println("First element is "+stack.get(0));
    }
}
