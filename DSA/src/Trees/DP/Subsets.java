package Trees.DP;
import java.util.*;

public class Subsets {
    public static void main(String[] args) {
        int arr[] = {1,4,3};
        List<List<Integer>> ans = new ArrayList<>();

        subset1(arr,0 ,ans,new ArrayList<>());

        System.out.println(ans);


        // longest bitonic subsequence
        int maxBitonic = 0;
        int maxIncreasing = 0;
        for(int i = 0;i<ans.size();i++){
            if(isBitonic(ans.get(i))){
                maxBitonic = Math.max(ans.get(i).size(), maxBitonic);
            }

            if(isIncreasing(ans.get(i))){
                maxIncreasing = Math.max(ans.get(i).size(), maxIncreasing);
            }
        }

        System.out.println(maxBitonic);
        System.out.println(maxIncreasing);
    }

    static boolean isBitonic(List<Integer> arr) {
        boolean inc = true;

        for (int i = 1; i < arr.size(); i++) {
            if (inc && arr.get(i-1) > arr.get(i)) {
                inc = false;
            }

            if (!inc && arr.get(i-1) < arr.get(i)) {
                return false;
            }
        }

        return true;
    }

    static boolean isIncreasing(List<Integer> list){
        for(int i = 1;i<list.size();i++){
            if(list.get(i-1) > list.get(i)){
                return false;
            }
        }
        return true;
    }

    static void subset(int[] arr, int i, List<List<Integer>> ans,List<Integer> temp){
        if(i == arr.length){
            ans.add(new ArrayList<>(temp));
            return;
        }

        temp.add(arr[i]);
        subset(arr, i + 1, ans, temp);

        temp.remove(temp.size()-1);
        subset(arr, i + 1, ans, temp);
    }

    static void subset1(int[] arr, int index, List<List<Integer>> ans,List<Integer> temp){
        if(index == arr.length){
            ans.add(new LinkedList<>(temp));
            return;
        }


        temp.add(arr[index]);
        subset1(arr,index+1,ans,temp);
        temp.remove(temp.size()-1);
        subset1(arr, index+1, ans, temp);
    }
}
