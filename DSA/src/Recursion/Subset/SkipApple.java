package Recursion.Subset;

public class SkipApple {
    public static void main(String[] args) {
        String s = "appleskjfiojwfhwfnapplejsf";
        System.out.println(skipApple(s));
    }

    // if string starts with "apple" skip 5 character else check substring starting from next
    // when string becomes empty : return ""
    static String skipApple(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("apple")){
            return skipApple(s.substring(5));
        }else{
            return s.charAt(0) + skipApple(s.substring(1));
        }
    }
}
