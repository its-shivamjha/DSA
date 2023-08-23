package Sorting;

import java.util.Arrays;

public class AllSorting {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 4, 5, 8, -7, -6, -5, -1};
        SelectionSort(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {1, 2, 4, 5,6,9, 8, -7, -6, -5, -1};
        bubbleSort(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {5,4,-1,5,7,8,9};
        insertionSort(arr3);
        System.out.println(Arrays.toString(arr3));


        // in the loop header i-- and --i is same
        for(int i = 10;i>0;i--){
            System.out.print(i--+" ");
        }
        System.out.println();
        for(int i = 10;i>0;--i){
            System.out.print(--i+" ");
        }
    }


    static void SelectionSort(int[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            // Find the minimum element in the unsorted array.
            int minIndex = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[minIndex]) {
                    minIndex = j;
                }
            }

            // Swap the minimum element with the first element in the unsorted array.
            int temp = array[i];
            array[i] = array[minIndex];
            array[minIndex] = temp;
        }
    }

        // compare the alternate elements and keep swapping
        static void bubbleSort(int[] arr){
            int n = arr.length;

            for(int i = 0;i<n;i++){
                for(int j = 1;j<n-i;j++){
                    if(arr[j]<arr[j-1]){
                        int temp = arr[j];
                        arr[j] = arr[j-1];
                        arr[j-1] = temp;
                    }
                }
            }
        }

        // O(n^2) keep increasing the sorted array part
        static void insertionSort(int[] arr){
                for(int i = 0;i<arr.length-1;i++){
                    for(int j = i+1;j>0;j--){
                        if(arr[j]<arr[j-1]){
                            int temp = arr[j];
                            arr[j] = arr[j-1];
                            arr[j-1] = temp;
                        }
                    }
                }

        }

}
