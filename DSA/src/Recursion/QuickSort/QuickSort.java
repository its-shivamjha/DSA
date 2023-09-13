
package Recursion.QuickSort;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 5,4,3,2,1};
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

    // put the pivot at the correct index : that means all less numbers should be in LHS and big numbers should be in RHS
    // then do the same for all other elements by making each of them as "pivot"
    // once only one element is left then just return it!!
    

    static void quickSort(int[] arr,int low, int high){
        if(low>=high){
            return;
        }

        int start = low;
        int end = high;
        int mid = start + (end - start)/2;

        // put the pivot to the correct index
        while (start<=end) {
            while(arr[start] < arr[mid]){
                start++;
            }
            while(arr[end] > arr[mid]){
                end--;
            }

            // swap the elements
            if(start <= end){
                int temp = arr[start];
                arr[start] = arr[end];
                arr[end] = temp;
                start++;
                end--;
            }
        }
        
        // sort the left and the right array
        quickSort(arr,low,end);
        quickSort(arr, start, high);
    }
}