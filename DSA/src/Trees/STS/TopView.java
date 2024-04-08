import java.util.*;

public class TopView {
    public static void main(String[] args) {
        String s = "1243438";
        TreeNode root = Main.constructTree(s);

        System.out.println("Top View:");
        topView(root, 0);
        for (int i : map.values()) {
            System.out.print(i + " ");
        }
    }

    // Map to store the top view nodes
    static TreeMap<Integer, Integer> map = new TreeMap<>();

    // Method to find top view of the tree
    static void topView(TreeNode root, int hd) {
        if (root == null)
            return;

        if (!map.containsKey(hd)) {
            map.put(hd, root.val);
        }
        topView(root.left, hd - 1);
        topView(root.right, hd + 1);
    }
}
