package Arrays;

import java.util.Arrays;

public class Q_maxItem {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,88};
        System.out.println(Arrays.toString(arr));
        System.out.println(max(arr));
    }
    static int max(int[] arr){
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        return max;

    }
}
