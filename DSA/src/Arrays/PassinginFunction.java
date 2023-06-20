package Arrays;

import java.util.Arrays;

public class PassinginFunction {
    public static void main(String[] args) {
        int[] arr = {2,3,5,7};
        System.out.println(Arrays.toString(arr));
        change(arr);        //arrays are mutable and can be changed.
        System.out.println(Arrays.toString(arr));
    }

    static void change(int[] arr){
        arr[0]=99;          // value is being changed and arr is passed by reference value
    }

}
