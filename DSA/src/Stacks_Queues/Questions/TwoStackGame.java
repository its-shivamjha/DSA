package Stacks_Queues.Questions;
import java.util.*;

public class TwoStackGame {
    public static void main(String[] args) {
        Stack<Integer> stack1 = new Stack<>();
        stack1.push(1);
        stack1.push(6);
        stack1.push(4);
        stack1.push(2);
        stack1.push(4);
        Stack<Integer> stack2 = new Stack<>();
        stack2.push(5);
        stack2.push(8);
        stack2.push(1);
        stack2.push(2);

        int max = 10;
        int max1 = maxPop(stack1, stack2, 0, max, 0) - 1;
        System.out.println(max1);
    }

    static int maxPop(Stack<Integer> stack1, Stack<Integer> stack2, int count, int max, int sumSoFar) {
        if (sumSoFar > max || (stack1.isEmpty() && stack2.isEmpty())) {
            return count;
        }

        int ans1 = Integer.MIN_VALUE;
        int ans2 = Integer.MIN_VALUE;

        if (!stack1.isEmpty()) {
            int popped1 = stack1.pop();
            ans1 = maxPop(stack1, stack2, count + 1, max, sumSoFar + popped1);
            stack1.push(popped1);
        }

        if (!stack2.isEmpty()) {
            int popped2 = stack2.pop();
            ans2 = maxPop(stack1, stack2, count + 1, max, sumSoFar + popped2);
            stack2.push(popped2);
        }

        return Math.max(ans1, ans2);
    }
}
