package Stacks_Queues;

public class CustomQueueMain {
    public static void main(String[] args) throws Exception {
        CustomQueue queue = new CustomQueue(10);
        queue.push(2);
        queue.push(3);
        queue.push(5);
        queue.push(19);
        queue.push(12);
        queue.push(1);
        System.out.println(queue);

        // Takes O(n) time : to resolve this we've Circular queue
        queue.remove();
        System.out.println(queue);


        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.remove();
        // queue.front();
        

    }
}
