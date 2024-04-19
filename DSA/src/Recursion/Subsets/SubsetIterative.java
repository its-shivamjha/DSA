package Recursion.Subsets;

import java.util.*;

public class SubsetIterative {
    // for each number or char either accept or reject
    public static void main(String[] args) {
        int[] arr = {1,2,3};
        subset(arr);

        int[] arr2 = {1,2,2};
        subsetsDuplicate(arr2);
    }

    static void subset(int[] arr){
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());

        for(int num: arr){
            int n = outer.size();        // so there are n number of elements already present in the outer list
            for(int i = 0;i<n;i++){
                // add the ith item in the list 
                List<Integer> internal = new ArrayList<>(outer.get(i));
                // add num to it
                internal.add(num);
                outer.add(internal); 
                
                // we can solve the duplicate part also if we 
                // just check 
                // if(!outer.contains(internal){
                //     outer.add(internal);
                // })
            }
        }
        System.out.println(outer);

    }


    // when duplicates are there.
    static void subsetsDuplicate(int[] arr){
        Arrays.sort(arr);
        List<List<Integer>> outer = new ArrayList<>();
        outer.add(new ArrayList<>());
        int start = 0;
        int end = 0;

        for(int i = 0;i<arr.length;i++){
            start = 0;
            if(i>0 && arr[i] == arr[i-1]){
                start = end+1;
            }
            end = outer.size()-1;
            int n = outer.size();        // so there are n number of elements already present in the outer list
            for(int j = start;j<n;j++){
                // add the ith item in the list 
                List<Integer> internal = new ArrayList<>(outer.get(j));
                // add num to it
                internal.add(arr[i]);
                outer.add(internal);
            }
        }
        System.out.println(outer.size());
        System.out.println(outer); 
    }
}
