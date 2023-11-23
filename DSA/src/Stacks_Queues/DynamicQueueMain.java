package Stacks_Queues;

public class DynamicQueueMain {
    public static void main(String[] args) {
        DynamicQueue queue = new DynamicQueue(5);
        queue.push(0);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);
        queue.push(5);
        queue.push(5);
        queue.push(5);
        queue.push(5);
        queue.push(5);
        queue.push(5);
        queue.push(5);
        queue.display();
    }
}
