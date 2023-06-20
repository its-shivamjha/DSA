package Random;

import java.util.Arrays;

public class Insertion {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,5,9,3,2,5,1};
        int n = arr.length;
        insertion(arr,n);
        System.out.println(Arrays.toString(arr));
    }

    static void insertion(int[] arr,int n){
        for(int i = 0;i<n-1;i++){
            for(int j = i+1;j>0;j--){
                if(arr[j]<arr[j-1]){
                    swap(arr,j);
                }

            }
        }
    }
    static void swap(int[] arr,int j){
        int temp = arr[j];
        arr[j]= arr[j-1];
        arr[j-1] = temp;
    }
}
