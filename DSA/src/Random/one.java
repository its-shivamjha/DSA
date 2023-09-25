package Random;

import java.util.Arrays;

public class one {
    public static void main(String[] args) {
        int[] arr = {2,3,5,8,5,9,3,2,5,1};

        for(int i= 0;i<arr.length;i++ ){
            boolean b = false;
            for(int j = 0;j<arr.length-i;j++){
                if (arr[j] > arr[j+1]){
                    swap(arr,j);
                    b = true;
                }
            }
            if(b== false){
                break;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int[] arr,int j){
        int temp = arr[j];
        arr[j] = arr[j+1];
        arr[j+1] = temp;

    }

}
