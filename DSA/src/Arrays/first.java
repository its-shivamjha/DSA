
package Arrays;

import java.util.Arrays;

public class first {
    public static void main(String[] args) {

                    //run time -creating object at runtime -Dynamic memory allocation
        int[] arr =new int[5];
        //compiled time
        //new is used to create an object.
        System.out.println(arr[1]);     // will print 0

        String[] str = new String[5];
        str[0] = "shiv";
        System.out.println(Arrays.toString(str));     // will print null (any reference variable by default is of null type )

        char[] str2 = {'s','h','i','v'};
        str2[0] = 'c';
        System.out.println(str2);
        System.out.println(Arrays.toString(str2));


        String str1 = "Shivam";
        System.out.println(str1);


    }
}
