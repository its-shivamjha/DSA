import java.util.*;

public class Main {
    public static void main(String[] args) {
        String s = "1234NNN234232";
        TreeNode root = constructTree(s);

        if (root != null) {
            display(root);
        } else {
            System.out.println("Empty tree");
        }

        displayPreOrder(root);
    }

    static TreeNode constructTree(String s) {
        if (s == null || s.isEmpty()) {
            return null;
        }

        TreeNode root = new TreeNode(s.charAt(0) - '0');
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int index = 1;

        while (!q.isEmpty() && index < s.length()) {
            TreeNode curr = q.poll();

            if (index < s.length() && s.charAt(index) != 'N') {
                curr.left = new TreeNode(s.charAt(index) - '0');
                q.add(curr.left);
            }
            index++;

            if (index < s.length() && s.charAt(index) != 'N') {
                curr.right = new TreeNode(s.charAt(index) - '0');
                q.add(curr.right);
            }
            index++;
        }
        return root;
    }

    static void display(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<List<Integer>> list = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            List<Integer> temp = new ArrayList<>();
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                temp.add(curr.val);

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
            list.add(temp);
        }
        System.out.println(list);
    }

    static void displayPreOrder(TreeNode root){
        if(root == null) return;
        System.out.print(root.val+" ");
        displayPreOrder(root.left);
        displayPreOrder(root.right);;
    }
}