package LinearSearch;

import java.util.Arrays;

public class SearchInString {
    public static void main(String[] args) {
        String str = "Shivam Jha";
        System.out.println(check(str,'h'));
    }

    static boolean check(String str ,char a){
        for(char c : str.toCharArray()){
            if( c == a){
                return true;

            }
        }
        return false;

    }
}
