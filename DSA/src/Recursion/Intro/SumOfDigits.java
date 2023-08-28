package Recursion.Intro;

public class SumOfDigits {
    public static void main(String[] args) {
        System.out.println(sumOfDigits(1342));

    }
    static int sumOfDigits(int N){
        if(N < 10){
            return N;
        }
//        or
//        if(N == 0){
//            return 0;
//        }
        return N%10 + sumOfDigits(N/10);
    }
}
