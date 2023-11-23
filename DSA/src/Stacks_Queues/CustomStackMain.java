package Stacks_Queues;

public class CustomStackMain {
    public static void main(String[] args) throws Exception{
        CustomStack stack = new CustomStack(8);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        System.out.println(stack);
        System.out.println(stack.peek());
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println(stack);
        
    }
}
