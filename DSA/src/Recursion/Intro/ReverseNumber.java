package Recursion.Intro;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println(revNum(1654322));
    }
    static int revNum(int n){
        if(n < 10){
            return n;
        }
        int numDigits = (int)Math.log10(n); // (int)Math.log10(n) -1;
        return (n%10) * (int)Math.pow(10,numDigits) + revNum(n/10);
    }
}
