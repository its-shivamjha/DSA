
import java.util.*;

import Trees.Main;

public class TopView {
    public static void main(String[] args) {
        String s = "1243438";
        TreeNode root = constructTree(s);

        System.out.println("Top View:");
        topview(root, 0);
        for (int i : map.values()) {
            System.out.print(i + " ");
        }

        System.out.println("\n Bottom View");
        bottomview(root, 0);
        for(int i : bottomMap.values()){
            System.out.print(i+ " ");
        }
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

    // // Map to store the top view nodes
    // static TreeMap<Integer, Integer> map = new TreeMap<>();

    // // Method to find top view of the tree
    // static void topView(TreeNode root, int hd) {
    //     if (root == null)
    //         return;

    //     if (!map.containsKey(hd)) {
    //         map.put(hd, root.val); // only this line for bottom view
    //     }
    //     topView(root.left, hd - 1);
    //     topView(root.right, hd + 1);
    // }

    static TreeMap<Integer,Integer> map = new TreeMap<>();

    static void topview(TreeNode root,int hd){
        if(root == null) return;

        if(!map.containsKey(hd)){
            map.put(hd,root.val);
        }
        topview(root.left,hd-1);
        topview(root.right,hd+1);
    }

    static TreeMap<Integer,Integer> bottomMap = new TreeMap<>();

    static void bottomview(TreeNode root,int hd){
        if(root == null) return;

        bottomMap.put(hd,root.val);
        bottomview(root.left,hd-1);
        bottomview(root.right, hd+1);
    }
}
