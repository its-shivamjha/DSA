import java.util.*;

public class ViewsOfTrees {
    public static void main(String[] args) {
        String s = "1234567NNNNN8N9";
        TreeNode root = Main.constructTree(s);

        // right view , left view using BFS
        rightView(root);
        leftView(root);
        
        // Vertical Order
        verticalOrderTraversal(root, 0);
        for(LinkedList<TreeNode> nodes : map.values()){
            for(TreeNode node : nodes){
                System.out.print(node.val+" ");
            }
            System.out.println();
        }

        // Boundary Traversal
        leftBoundary(root);
        System.out.println();
        leafBoundary(root);
        System.out.println();
        rightBoundary(root);


    }

    public static void rightView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                if (i == levelSize - 1) {
                    list.add(curr.val);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        System.out.println(list);
    }

    public static void leftView(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        List<Integer> list = new ArrayList<>();
        q.add(root);

        while (!q.isEmpty()) {
            int levelSize = q.size();

            for (int i = 0; i < levelSize; i++) {
                TreeNode curr = q.poll();
                if (i == 0) {
                    list.add(curr.val);
                }

                if (curr.left != null) {
                    q.add(curr.left);
                }

                if (curr.right != null) {
                    q.add(curr.right);
                }
            }
        }
        System.out.println(list);
    }

    public static TreeMap<Integer, LinkedList<TreeNode>> map = new TreeMap<>();
    public static void verticalOrderTraversal(TreeNode root, int horizontalDistance) {

        if (root == null)
            return;

        if (!map.containsKey(horizontalDistance)) {
            map.put(horizontalDistance, new LinkedList<>());
        }
        map.get(horizontalDistance).add(root);
        verticalOrderTraversal(root.left, horizontalDistance - 1);
        verticalOrderTraversal(root.right, horizontalDistance + 1);
    }

    static void leftBoundary(TreeNode root){
        if(root == null) return;

        System.out.print(root.val);
        if(root.left != null){
            leftBoundary(root.left);
        }else{
            leftBoundary(root.right);
        }
        
    }

    static void rightBoundary(TreeNode root) {
        if (root == null)
            return;

            if (root.right != null) {
                rightBoundary(root.right);
            } else {
                rightBoundary(root.left);
            }
            System.out.print(root.val);

    }

    static void leafBoundary(TreeNode root){
        if(root == null) return;
        if(root.left == null && root.right == null){
            System.out.print(root.val);
        }
        leafBoundary(root.left);
        leafBoundary(root.right);
    }
}
