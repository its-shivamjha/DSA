package Stacks_Queues;

public class DynamicStackMain {
    public static void main(String[] args) {
        DynamicStack stack = new DynamicStack();
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);
        stack.push(1);

        // It'll keep on adding items and when array is full it'll create an array of 2*size
        System.out.println(stack);
    }
}
