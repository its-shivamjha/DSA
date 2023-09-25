package Strings;

import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String enter= in.nextLine();
        System.out.println(check(enter));
        in.close();
    }



    static boolean check(String str){
        str = str.toLowerCase();
        int n = str.length();
        for(int i =0;i<n/2;i++) {
            if (str.charAt(i) != str.charAt(n-i-1)){
                return false;
            }
        }
        return true;
    }
}
