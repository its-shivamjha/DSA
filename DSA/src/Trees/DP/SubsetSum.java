package Trees.DP;


public class SubsetSum {
    public static void main(String[] args) {
    int[] arr = {1 , 0 ,3, 2, 1};
    System.out.println(subsetSum(arr,0,6,0));
    }
    
    static boolean subsetSum(int[] arr, int i, int target, int sum) {
        if(sum == target) return true;
        if (sum > target) return false;
        if(i == arr.length) return false;

        return subsetSum(arr, i + 1, target, sum + arr[i]) || subsetSum(arr, i + 1, target, sum);
    }
}


