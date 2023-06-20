package Strings;

public class string {
    public static void main(String[] args) {
        String str = "Shivam Jha";          //every thing which starts with a capital letter is a Class in Java

        //datatype ref. variable name = object
        System.out.println(str);

        String a = "Shiv";
        String b = "Shiv";              //both points to same object in pool (inside heap memory)

        b = "Shivam";                   // b is assigned to new object , but the old object is same and 'a' points to it .
        System.out.println(a);
        System.out.println(b);


    }
}
