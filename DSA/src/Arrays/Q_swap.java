package Arrays;

import java.util.Arrays;

public class Q_swap {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6};
        System.out.println(Arrays.toString(arr));
        swap(arr,0,5);
        System.out.println("Changed array is: "+Arrays.toString(arr));
    }
    static void swap(int[] arr1, int index1, int index2){
        int temp = arr1[index1];
        arr1[index1]= arr1[index2];
        arr1[index2] = temp;
    }
}
