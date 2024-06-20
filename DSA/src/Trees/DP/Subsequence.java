package Trees.DP;
import java.util.*;

public class Subsequence {
    public static void main(String[] args) {
        String text1 = "ABBDCACB";
        String text2 = "hvam";
        int[] arr = {1,2,3,4,2,1};
        HashSet<String> set1 = new HashSet<>();
        HashSet<String> set2 = new HashSet<>();

        subS("",text1,set1);
        subS("",text2,set2);

        System.out.println(set1);
        System.out.println(set2);

        String maxStr = "";
        for(String s : set1){
            if(set2.contains(s)){
                if(s.length() > maxStr.length()){
                    maxStr = s;
                }
            }
        }

        System.out.println(maxStr);
        System.out.println(longestPalindromic(set1));    
    }

    static int longestPalindromic(HashSet<String> set1){
        int max = 0;

        for(String s : set1){
            if(isPalindrome(s)){
                max = Math.max(max, s.length());
            }
        }
        return max;
    }

    static boolean isPalindrome(String s){
        int i = 0;
        int j = s.length() - 1;
        while (i < j) {
            if (s.charAt(i) != s.charAt(j)) {
                return false;
            }
            i++;
            j--;
        }
        return true;
    }

    

    static void subS(String p,String up,HashSet<String> set ){
        if(up.isEmpty()){
            set.add(p);
            return;
        } 
        
        subS(p+up.charAt(0),up.substring(1),set);
        subS(p, up.substring(1), set);
    }

    static void subs(String p,String up,HashSet<String> set){
        if(!up.isEmpty()){
            set.add(p);
            return;
        }
        subs(p+up.charAt(0),up.substring(1),set);
        subs(p, up.substring(1), set);
    }


}
