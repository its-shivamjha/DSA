package Recursion.Lec9;

public class skipApp {
    // only skip the app when it is not equal to apple
    public static void main(String[] args) {
        String s = "asjfkfappskfksappledjfkfkdapp";
        System.out.println(app(s));

    }
    static String app(String s){
        if(s.isEmpty()){
            return "";
        }
        if(s.startsWith("app") && !s.startsWith("apple")){
            return app(s.substring(3));
        }else{
            return s.charAt(0) + app(s.substring(1));
        }
    }
    
}
