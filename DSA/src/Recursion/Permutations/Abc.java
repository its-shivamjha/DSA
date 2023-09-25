package Recursion.Permutations;
import java.util.*;

public class Abc {
    public static void main(String[] args) {
        String s = "abc";
        permutations("", s);

        System.out.println(permutations2("", s));
        System.out.println(count("", s));
    }

    static void permutations(String p,String up){
        if(up.isEmpty()){
            System.out.println(p);
            return;
        }
        char ch = up.charAt(0);
        // let's say p is a and now its modified as "ab" for first iteration when it comes out of recursion
        // and its time for 2nd iteration p is already modified
        for(int i =0;i<=p.length();i++){
            String newp = p.substring(0,i) + ch + p.substring(i,p.length());
            permutations(newp,up.substring(1));
        }
    } 

    // Returning an ArrayList
    static ArrayList<String> permutations2(String p,String up){
        if(up.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }

        ArrayList<String> ans = new ArrayList<>();
        char ch = up.charAt(0);
        for(int i =0;i<=p.length();i++){
            String newp = p.substring(0,i) + ch + p.substring(i,p.length());
            ans.addAll(permutations2(newp,up.substring(1)));
        }
        return ans;
    } 


    // return count : no of permutations
    static int count(String p,String up){
        if(up.isEmpty()){
            return 1;
        }

        int count = 0;
        char ch = up.charAt(0);
        for(int i =0;i<=p.length();i++){
            String newp = p.substring(0,i) + ch + p.substring(i,p.length());
            count +=  count(newp,up.substring(1));
        }

        return count;
    } 
}
