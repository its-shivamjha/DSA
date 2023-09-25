package Recursion.RecLast;

import java.util.*;

// we can use subset method for this 
public class keypad {
    public static void main(String[] args) {
        String s = "12";
        System.out.println(combination("", s));
    }

    static ArrayList<String> combination(String p, String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> finList = new ArrayList<>();

        // conveting '2' to 2
        int digit = up.charAt(0)-'0';
        for(int i = (digit-1)*3;i<digit*3;i++){
            char ch = (char)('a' + i);
            finList.addAll(combination(p+ ch, up.substring(1)));
        }

        return finList;
    }   
}
