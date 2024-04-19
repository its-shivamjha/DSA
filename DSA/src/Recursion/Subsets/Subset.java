package Recursion.Subsets;

import java.util.*;

// FIND ALL THE SUBSET OF "abc"
public class Subset {
    public static void main(String[] args) {
        String s = "abc";
        System.out.println("The subsets of the string: s is ");
        subset("",s);

        ArrayList<String> list = new ArrayList<>();
        list = subseq("", s);
        System.out.println(list.toString());
    }
    // p : processed 
    // up : unprocessed
    static void subset(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        subset(p+up.charAt(0), up.substring(1));
        subset(p, up.substring(1)); 
    }

    static ArrayList<String> subseq(String p,String up){
        if(up.isEmpty()) {
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        // take it 
        ArrayList<String> left = subseq(p+up.charAt(0), up.substring(1));
        // leave it 
        ArrayList<String> right = subseq(p, up.substring(1));

        left.addAll(right);
        return left;
    }

}
