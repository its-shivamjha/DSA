package Sorting;

import java.util.Arrays;

public class SelectionSort {
    //select the largest/smallest element and put it at the correct position
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,5,9,3,2,5,1};
        selectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void selectionSort(int[] arr){
        //find the largest number in the array and swap it for the correct index
        //and the array will keep reducing by one element for searching the maximum integer
        for(int i = 0;i<arr.length;i++){
            int last = arr.length - i - 1;
            int maxIndex = getMaxIndex(arr,0,last);
            swap(arr,maxIndex,last);
        }
    }

    static void swap(int[] arr ,int first, int second){
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }

    static int getMaxIndex(int[] arr ,int start, int last){
        int max = start;
        for(int i = 0;i<=last;i++){
            if(arr[max]<arr[i]){
                max = i;
            }
        }
        return max;
    }

}
