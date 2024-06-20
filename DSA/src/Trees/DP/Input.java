package Trees.DP;

import java.util.*;


public class Input {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        Scanner in = new Scanner(System.in);


        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int idx = 0;

        while (!q.isEmpty()) {
            int size = q.size();

            for(int i = 0;i<size;i++){
                TreeNode curr = q.poll();

                if(idx < arr.length){
                    curr.left = new TreeNode(arr[idx]);
                    q.add(curr.left);
                }
                idx++;

                if(idx < arr.length){
                    curr.right = new TreeNode(arr[idx]);
                    q.add(curr.right);
                }
                idx++;
            }
        }

        bfs(root);

    }

     static void bfs(TreeNode root){
            List<List<Integer>> ans  = new ArrayList<>();

            Queue<TreeNode> q = new LinkedList<>();
            q.add(root);
            int level = 0;

            while(!q.isEmpty()){
                int size = q.size();
                List<Integer> temp = new ArrayList<>();

                for(int i = 0;i<size;i++){
                    TreeNode curr = q.poll();
                    temp.add(curr.val);

                    if(curr.left!= null){
                        q.add(curr.left);
                    }

                    if(curr.right != null){
                        q.add(curr.right);
                    }
                }

                ans.add(temp);
                level++;
            }

            System.out.println(ans);
            System.out.println("Level : "+level);
        }
}

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;

    public TreeNode(int val){
        this.val = val;
    }
}
