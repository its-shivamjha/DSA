package Strings;

import java.util.Arrays;

public class StringMethods {
    public static void main(String[] args) {

        //Arrays.toString converts the array into a string with brackets which looks readable
        String name = "Shivam jha";
        System.out.println(Arrays.toString(name.toCharArray()));        //makes new obj | strings are immutable
        System.out.println(name);
        System.out.println(name.length());
        String a = name.toLowerCase();
        System.out.println(a);
        System.out.println(name.toUpperCase());
        System.out.println(name.substring(1,7));
        System.out.println(name.replace("jha","Jha"));

        String two = " shiv Jha";
        System.out.println(two.trim());







    }
}
