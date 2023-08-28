package Recursion.Intro;

public class Fact {
    public static void main(String[] args) {
        System.out.println(factorial(5));
        System.out.println(sum(5));
    }

    static int factorial(int n){
        if(n == 1){
            return 1;
        }
        return n*factorial(n-1);
    }

    // sum of n to 1
    static int sum(int n){
        if(n ==1){
            return 1;
        }
        return n + sum(n-1);
    }
}
