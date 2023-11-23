package Stacks_Queues;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;


public class InBuilts{
    public static void main(String[] args) {
        
        // STACK : Internally it is an array (java.util.Stack) : LIFO 
        // when you want to store the answers so far
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        System.out.println(stack);
        stack.pop();
        System.out.println(stack);
        System.out.println(stack.peek());

        // QUEUE : it is an interface : we can implement using linked list 
        // FIFO : insert from back remove from front
        Queue<Integer> queue = new LinkedList<>();
        queue.add(2);
        queue.add(3);
        queue.add(4);
        queue.add(5);
        queue.add(8);
        System.out.println(queue.peek());
        System.out.println(queue);

        // DEQUEUE : Insert or remove from both the sides 
        // is used well in trees
        Deque<Integer> deque = new ArrayDeque<>();
        deque.add(5);
        deque.add(4);
        deque.add(5);
        deque.add(4);
        deque.remove(4);                    // removes the first instance of the object
        System.out.println(deque.peek());     // shows the first element
        System.out.println(deque);

    }   
}