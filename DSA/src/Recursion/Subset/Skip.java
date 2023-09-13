package Recursion.Subset;


// LOGIC : For each recursive call the string goes in with leaving the first character (substring)


public class Skip {
    public static void main(String[] args) {
        
        // Given a string "ababbba" return a string skipping the character 'a'
        String s = "abbsfjskfsbaabbsa";
        System.out.println(newstr(s));

        // recursive way 1
        System.out.println(newstr2(s, 0));

        // recursive way 2
        System.out.println(newstr3(s, 0,new StringBuilder()));

        // skip
        System.out.println(skip(s));
        // skip2 
        skip2(s,new String());



    }


    // Iterative solution
    static String newstr(String str){

        StringBuilder sb = new StringBuilder();
        for(int i = 0;i<str.length();i++){
            if(str.charAt(i) != 'a' ){
                sb.append(str.charAt(i));
            }
        }

        return sb.toString();
    }


    // recursive solution 1
    // instead of stringBuilder we can also use an empty string "" and keep on adding the character to it
    static StringBuilder sb = new StringBuilder();
    static String newstr2(String str,int index){
        if(index >= str.length()){
            return sb.toString();
        }
        if(str.charAt(index) == 'a'){
            return newstr2(str, index+1);
        }else{
            sb.append(str.charAt(index));
            return newstr2(str, index+1);
        }
    }

    // recursive solution 2 
    // Approach : since StringBuilder is an object and in future function calls the same obj will be passed just like arrays
    
    static String newstr3(String str,int index,StringBuilder sb){
        if(index >= str.length()){
            return sb.toString();
        }

        if(str.charAt(index) != 'a'){
            sb.append(str.charAt(index));
        }

        return newstr3(str, index+1,sb);
    }

    // recursive solution 3
    // putting the string in the string body

    static String skip(String str){
        if(str.isEmpty()){
            return "";
        }

        char s = str.charAt(0);
        if(s == 'a'){
            return skip(str.substring(1));
        }else{
            return s + skip(str.substring(1));
        }
    }

    // printing the output 
    static void skip2(String str, String ans){
        if(str.isEmpty()){
            System.out.println(ans);
            return;
        }

        if(str.charAt(0) == 'a'){
            skip2(str.substring(1),ans);
        }else{
            skip2(str.substring(1), ans+str.charAt(0));
        }
    }
    
}
