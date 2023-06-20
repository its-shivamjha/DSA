package Strings;

public class Operators {
    public static void main(String[] args) {
        System.out.println('a' + 'b');      //adding the asci value
        System.out.println("a"+"b");        //concatenation
        System.out.println('a'+3);          // 100
        System.out.println((char)('a'+3));  // will return d
        System.out.println("a"+1);      //here integer will call Integer.tostring hence it is -- "a" + "1"

    }
}
