import java.util.Arrays;

public class WinTree {
    int[] tree;

    public WinTree(int[] arr){
        buildTree(arr);
    }

    int[] buildTree(int[] arr){
        int n = arr.length;
        this.tree = new int[2*n-1];

        for(int i = 0;i<n;i++){
            tree[n-i+1] = i;
        }

        for(int i = n-2;i>= 0;i--){
            if(arr[tree[2*i+1]] < arr[tree[2*i+2]]){
                tree[i] = tree[2*i+1];
            }else{
                tree[i] = tree[2*i+2];
            }
        }
        return tree;
    }

    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        WinTree winTree = new WinTree(originalArray);

        // Print the tree (You'll need a way to display the array)
        System.out.println(Arrays.toString(winTree.tree));
    }
}
