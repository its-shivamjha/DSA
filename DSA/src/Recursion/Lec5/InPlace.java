package Recursion.Lec5;

import java.util.Arrays;

public class InPlace {
    public static void main(String[] args) {
        int[] arr = {5,4,3,2,1};
        mergeSort(arr,0,arr.length);
        System.out.println(Arrays.toString(arr));

        System.out.println("This algorithm will actually change the array see :) ");
        System.out.println(Arrays.toString(arr));
    }
    static void mergeSort(int[] arr,int s,int e){
        if(e-s ==1){
            return;
        }
        int mid = s+(e-s)/2;

        mergeSort(arr,s,mid);
        mergeSort(arr,mid,e);

        mergeInPlace(arr,s,mid,e);
    }

    static void mergeInPlace(int[] arr,int s,int mid,int e){
        int[] ans = new int[e-s];
        int i = s;
        int j = mid;
        int k = 0;

        // whenever any one of the array ends
        while (i< mid && j < e){
            if(arr[i] <arr[j]){
                ans[k++] = arr[i];
                i++;
            }else{
                ans[k++] = arr[j];
                j++;
            }
        }

        // if either of the array is not ended yet
        while(i<mid){
            ans[k++] = arr[i];
            i++;
        }
        while(j<e){
            ans[k++] = arr[j];
            j++;
        }

        for(int l = 0;l<ans.length;l++){
            arr[s+l] = ans[l];
        }

    }
}
