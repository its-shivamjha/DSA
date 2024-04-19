
import java.util.*;

public class BFS {
    public static void main(String[] args){
        TreeNode tree = new TreeNode(1);
        tree.left = new TreeNode(2);
        tree.right = new TreeNode(3);
        tree.left.left = new TreeNode(4);
        tree.left.right = new TreeNode(5);
        tree.left.left.left = new TreeNode(8);
        tree.left.left.right = new TreeNode(9);
        tree.right.left = new TreeNode(6);
        tree.right.right = new TreeNode(7);
        tree.right.left.left = new TreeNode(10);
        tree.right.right.right = new TreeNode(11);

        // display(tree);
        bfs(tree);
        System.out.println(levelSuccessor(tree,tree.right.left));
        zigZag(tree);

        }


        //! preorder display
        static void display(TreeNode root){
            if(root == null) return;
            System.out.println(root.val);
            display(root.left);
            display(root.right);
        }

        //! BFS or Level Order Traversal
        static void bfs(TreeNode root){
            List<List<Integer>> ans = new ArrayList<>();
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 0;

            while(!queue.isEmpty()){
                int levelSize = queue.size();
                List<Integer> currLevel = new ArrayList<>();

                for(int i = 0;i<levelSize;i++){
                    TreeNode node = queue.poll();
                    currLevel.add(node.val);

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
                level++;
                ans.add(currLevel);
            }

            System.out.print(ans);
            System.out.println("\nNo of levels : " + level);
        }


        //! level order successor of a node
        static int levelSuccessor(TreeNode root, TreeNode target){
            Queue<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            int level = 0;

            while(!queue.isEmpty()){
                int levelSize = queue.size();

                for(int i = 0;i<levelSize;i++){
                    TreeNode node = queue.poll();
                    if(node == target){
                        return queue.peek().val;
                    }

                    if (node.left != null) {
                        queue.add(node.left);
                    }
                    if (node.right != null) {
                        queue.add(node.right);
                    }
                }
            }
            return -1;
        }


        //! Zig zag traversal
        static void zigZag(TreeNode root) {
            List<List<Integer>> ans = new ArrayList<>();
            Deque<TreeNode> queue = new LinkedList<>();
            queue.add(root);
            boolean reverse = false;

            while (!queue.isEmpty()) {
                int levelSize = queue.size();
                List<Integer> currLevel = new ArrayList<>();

                // for normal levels , normal traversal just as BFS
                if(reverse == false){
                    for (int i = 0;i<levelSize;i++) {
                        TreeNode node = queue.removeFirst();
                        currLevel.add(node.val);

                        if (node.left != null) {
                            queue.addLast(node.left);
                        }
                        if (node.right != null) {
                            queue.addLast(node.right);
                        }
                    }
                }else{
                    // For reverse levels , traverse queue in reverse and add elements in front of the queue
                    // and also first add right and then left so that in the next traversal 
                    // if you can traverse normally and get the correct result

                    for (int i = 0;i<levelSize;i++) {
                        TreeNode node = queue.removeLast();
                        currLevel.add(node.val);

                        if (node.right != null) {
                            queue.addFirst(node.right);
                        }
                        if (node.left != null) {
                            queue.addFirst(node.left);
                        }
                    }
                }
                reverse = !reverse;
                ans.add(currLevel);
            }

            System.out.print(ans);
            // System.out.println("\nNo of levels : " + level);
        }
    
}