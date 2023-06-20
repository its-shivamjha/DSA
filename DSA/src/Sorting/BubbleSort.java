package Sorting;

import java.util.Arrays;

public class BubbleSort {
    //also known as "Syncing sort" or "Exchange Sort" - used to sort the array in an order
    //Here we keep swapping the alternate elements ,arr.length times and the swapping array keeps getting smaller.
    public static void main(String[] args){
        int[] arr = {1,2,2,3,4,4,5,1};
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    static void bubbleSort(int[] arr){
        boolean swapped;        //to avoid the iteration when the array is already sorted
        //Run the steps n-1 times
        for(int i = 0;i<arr.length;i++){
            swapped = false;
            //After each pass the largest number will come at last respective index
            for(int j = 1;j<arr.length-i;j++){
                if(arr[j]< arr[j-1]){               //sorting ascending
                    swap(arr,j);
                    swapped = true;
                }
            }
            if(!swapped) {
                break;
            }
        }

    }

    static void swap(int[] arr,int j){
        int temp = arr[j];
        arr[j] = arr[j-1];
        arr[j-1] = temp;
    }

}
