package Recursion.Questions;

import java.util.*;

// its a pattern
public class combinationSum {
    public static void main(String[] args) {
        int[] candidates = {2,3,6,7};
        int target = 7;
        List<List<Integer>> outer = new ArrayList<>();
        List<Integer> inner = new ArrayList<>();
        sum(candidates,target,outer,inner,0);
        System.out.println(outer);
        
    }
    static void sum(int[] arr, int target,List<List<Integer>> outer,List<Integer> inner,int index){

        if(target == 0){
            outer.add(new ArrayList<>(inner));
            return;
        }

        // giving i = index so that we don't get values like (2,2,3) and (3,3,2)
        for(int i = index;i<arr.length;i++){
            if(target< arr[i]){
                return;
            }
            inner.add(arr[i]);
            sum(arr,target-arr[i],outer,inner,i);
            inner.remove(inner.size()-1);
        }
    }
}
