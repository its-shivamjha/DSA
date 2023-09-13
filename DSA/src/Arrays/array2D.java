package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class array2D {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //int[][] arr = new int[3][];
        /* int[][] arr2d ={
                            {1,2,3}
                            {1,2}
                            {1,2,3,4}
                            }
           for(int row =0;row<arr.length;row++){                //arr[row].length will take the value = length of each row of the arr2d which is  3,2,4 respectively
            for(int col =0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
         */
        //INPUT
        int[][] arr = new int[3][2];
        for(int row =0;row<arr.length;row++){
            for(int col =0;col<arr[row].length;col++){
                arr[row][col]= in.nextInt();
            }
        }
        //OUTPUT
        for(int row =0;row<arr.length;row++){
            for(int col =0;col<arr[row].length;col++){
                System.out.print(arr[row][col]+" ");
            }
            System.out.println();
        }
        //easier way
        for(int row =0;row<arr.length;row++){
            System.out.println(Arrays.toString(arr[row]));

        }
        //more easier way -enhanced for loop
        for(int[] a: arr){
            System.out.println(Arrays.toString(a));
        }

        //System.out.println(arr);  this won't work

        }
}
