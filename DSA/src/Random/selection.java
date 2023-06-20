package Random;

import java.util.Arrays;

public class selection {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,5,9,3,2,5,1};
        int n = arr.length;
        for(int i = 0;i<arr.length;i++){
            int last = n-1-i;
            int a = maxIndex(arr,0,last);
            swap(arr,a,last);
        }
        System.out.println(Arrays.toString(arr));
    }
    static int maxIndex(int[] arr,int s,int e){
        int max = s;
        for(int i = 0;i<e;i++){
            if(arr[i]>arr[max]){
                max = i;
            }
        }
        return max;
    }
    static void swap(int[] arr, int maxIndex,int e){
        int temp = arr[maxIndex];
        arr[maxIndex] = arr[e];
        arr[e] = temp;
    }
}
