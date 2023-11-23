package Stacks_Queues;

public class CircularQueueMain {
    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);
        queue.push(2);
        queue.push(3);
        queue.push(1);
        queue.push(5);
        queue.push(8);
        queue.display();

        queue.remove();
        queue.display();
        
        queue.push(0);
        queue.display();
    }
}
