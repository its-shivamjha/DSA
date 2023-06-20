package Arrays;

import java.util.Arrays;

public class Q_revArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        rev(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void rev(int[] arr){
        int n= arr.length;
        for(int i=0;i<=n/2;i++){
            int temp = arr[i];
            arr[i] = arr[n-i-1];
            arr[n-i-1]= temp;
        }
    }
}
