package Strings;
import java.util.*;

public class Abc{
    public static void main(String[] args) {
        String s = "abc";
        StringBuilder st = new StringBuilder(s);
        for(int i = 0;i<s.length();i++){
            st.setCharAt(i,(char)(s.charAt(i)+1));
        }

        System.out.println(st);
    }
}