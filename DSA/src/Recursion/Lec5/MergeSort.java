package Recursion.Lec5;

import java.util.Arrays;

public class MergeSort {
    public static void main(String[] args) {
        int[] arr = {1,8,9,5,11,32,5,6,7,1};
        int[] ans = mergeSort(arr);
        System.out.println(Arrays.toString(ans));

        System.out.println("This algorithm will not change the array");
        System.out.println(Arrays.toString(arr));
    }
    static int[] mergeSort(int[] arr){
        if(arr.length == 1){
            return arr;
        }
        int mid = arr.length/2;

        int[] left = mergeSort(Arrays.copyOfRange(arr,0,mid));
        int[] right = mergeSort(Arrays.copyOfRange(arr,mid,arr.length));

        return merge(left,right);
    }

    static int[] merge(int[] arr1,int[] arr2){
        int[] ans = new int[arr1.length+arr2.length];
        int i = 0;
        int j = 0;
        int k = 0;

        // whenever any one of the array ends
        while (i< arr1.length && j <arr2.length){
            if(arr1[i] <arr2[j]){
                ans[k++] = arr1[i];
                i++;
            }else{
                ans[k++] = arr2[j];
                j++;
            }
        }

        // if either of the array is not ended yet
        while(i<arr1.length){
            ans[k++] = arr1[i];
            i++;
        }
        while(j<arr2.length){
            ans[k++] = arr2[j];
            j++;
        }

        return  ans;
    }
}
