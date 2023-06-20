package Strings;

import java.util.Arrays;

public class Comparison {
    public static void main(String[] args) {

        /*
           1. a == b method : Returns true if a and b are pointing towards the same object.
           2. a.equals(b) : Returns true if both just have the same "value"
        */

        String a = new String("Shiv");
        String b = new String("Shiv"); // this way we're making two objects outside the pool and the a and b both pointing towards them respectively

        System.out.println(a==b);              //return false coz both are different obj. outside the pool
        System.out.println(a.equals(b));      // return true coz just comparing the value

        String c = "shiv";
        String d = "shiv";                  // this way we're making 1 object inside the pool and both c and d pointing to it

        System.out.println(c == d);
        System.out.println(c.equals(d));        //both are same objects as well as same in value which is "shiv

        //INDEXING
        System.out.println(c.charAt(0));

        int[] arr = new int[5];
        System.out.println(Arrays.toString(arr));



    }
}
