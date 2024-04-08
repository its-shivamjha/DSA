public class Height {
    public static int diameter = 0;
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);
        root.left.left.left = new TreeNode(8);
        root.left.left.right = new TreeNode(9);
        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);
        root.right.left.left = new TreeNode(10);
        root.right.right.right = new TreeNode(11);

        System.out.println(height(root.left));
        System.out.println(depth(root.left));

        diameter(root);
        System.out.println(diameter);
    }

    // maximum numbef of edges from root node to 
    static int height(TreeNode root) {
        if (root == null) {
            return -1; // Base case: Height of an empty tree is -1
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }

    // number of nodes
    static int depth(TreeNode root) {
        if (root == null) {
            return 0;
        }

        int leftHeight = depth(root.left);
        int rightHeight = depth(root.right);

        return Math.max(leftHeight, rightHeight)+1;
    }

    // maximum number of edges between 2 farthest nodes in a tree
    static int diameter(TreeNode root) {
        if (root == null)
            return -1;

        // for the current node get the height of left subtree and right subtree
        int leftHeight = diameter(root.left);
        int rightHeight = diameter(root.right);
        diameter = Math.max(diameter, leftHeight + rightHeight + 2);    // + 2 for the two connecting edges(root to left and root to right)

        // and when returning to the parent always add 1 to the max coz parent to
        // current node , a new edge will count as well right
        return Math.max(leftHeight, rightHeight)+1;
    }

}
