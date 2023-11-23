package Stacks_Queues.Questions;

import java.util.*;

public class TwoStacks {
    Stack<Integer> first;
    Stack<Integer> second;

    public TwoStacks() {
        first = new Stack<>();
        second = new Stack<>();
    }
    
    public void push(int x) {
        first.push(x);
    }
    
    public int pop() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int removed = second.pop();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return removed;
    }
    
    public int peek() {
        while(!first.isEmpty()){
            second.push(first.pop());
        }
        int firstElement = second.peek();

        while(!second.isEmpty()){
            first.push(second.pop());
        }
        return firstElement;
    }
    
    public boolean empty() {
        return first.isEmpty();
    }
}