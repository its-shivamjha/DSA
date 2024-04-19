
package Recursion.QuickSort;

import java.util.Arrays;


public class QuickSort {
    public static void main(String[] args) {
        int[] arr = { 1, 2, 3, 4, 5 };
        quickSort(arr, 0, arr.length-1);
        System.out.println(Arrays.toString(arr));
    }

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
        quickSort(arr,start,high);
    }
}