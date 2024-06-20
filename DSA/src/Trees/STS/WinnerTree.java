
import java.util.*;

public class WinnerTree {
    private int[] tree;

    public WinnerTree(int[] arr) {
        this.tree = buildTree(arr);
    }

    private int[] buildTree(int[] arr) {
        int n = arr.length;
        int[] tree = new int[2*n-1];

        // Fill leaf nodes
        for (int i = 0; i < n; i++) {
            tree[n - 1 + i] = i; // Store index of the element
        }

        // Build internal nodes
        for (int i = n - 2; i >= 0; i--) {
            if (arr[tree[2 * i + 1]] < arr[tree[2 * i + 2]]) {
                tree[i] = tree[2 * i + 1];
            } else {
                tree[i] = tree[2 * i + 2];
            }
        }

        return tree;
    }

    private int[] buildTree1(int[] arr){
        int n = arr.length;
        int[] tree = new int[n*2-1];

        for(int i = 0;i<n;i++){
            tree[n-i+1] = i;
        }

        for(int i = n-2; i>= 0;i--){
            if(arr[tree[2*i+1]]<arr[tree[2*i+2]]){
                tree[i] = tree[2*i+1];
            }else{
                tree[i] = tree[2*i+2];
            }
        }

        return tree;
    }

    // For Example Usage
    public static void main(String[] args) {
        int[] originalArray = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
        WinnerTree winnerTree = new WinnerTree(originalArray);

        // Print the tree (You'll need a way to display the array)
        System.out.println(Arrays.toString(winnerTree.tree));
    }
}
