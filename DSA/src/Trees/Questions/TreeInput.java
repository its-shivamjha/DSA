import java.util.LinkedList;
import java.util.*;

public class TreeInput {
    public static void main(String[] args) {
        Integer[] nums = { 1, 2, 3, 4, 5, 6 };
        TreeNode root = new TreeNode(0);
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int index = 1;

        while (!queue.isEmpty() && index < nums.length) {
            TreeNode curr = queue.poll();

            if(index < nums.length && nums[index] != null){
                curr.left = new TreeNode(nums[index]);
                queue.add(curr.left);
            }
            index++;

            if(index < nums.length && nums[index] != null){
                curr.right = new TreeNode(nums[index]);
                queue.add(curr.right);
            }
            index++;
        }

        BFS.bfs(root);
    }
}
