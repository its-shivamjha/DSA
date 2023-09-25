package Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        //array of primitives
        int[] arr = new int[4];
        arr[0] = 23;
        arr[1] = 23;
        arr[2] = 23;
        arr[3] = 23;

        //taking input
        for(int i = 0;i<arr.length;i++){
            arr[i] = s.nextInt();
        }

        //gto get output
        for(int i = 0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }

//        for (int j : arr) {                 // j = element of array arr[i] //enhanced for loop
//            System.out.print(j + " ");
//        }

        //easy way to print array -- use of toString
        System.out.println();
        System.out.println(Arrays.toString(arr));

        //array of object
        String[] str= new String[4];

        for(int i =0; i<str.length;i++){
            str[i] = s.next();
        }
        System.out.println(Arrays.toString(str));

        str[0]= "shiv";             //modify the array
        System.out.println(Arrays.toString(str));
        System.out.println(str);


        s.close();

    }
}
