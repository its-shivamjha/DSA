package Recursion;

public class NumbersExample {
    //print numbers 1 to 5

    public static void main(String[] args) {
        print1(1);
        print(1);
    }
    static void print1(int num){
        System.out.println(num);
        print2(2);
    }
    static void print2(int num){
        System.out.println(num);
        print3(3);
    }
    static void print3(int num){
        System.out.println(num);
        print4(4);
    }
    static void print4(int num){
        System.out.println(num);
        print5(5);
    }
    static void print5(int num){
        System.out.println(num);
    }

    // We can't write the same code block for 1000 of times, so we need a solution.
    //so the alternative is :

    static void print(int n){
        if(n>5){
            return; // after this the function will return to where it was called from, i.e print(4) then print(4) will return to print(3) and so on and so forth it'll return to main.
        }
        System.out.println(n);

        // this is last call
        // this is tail recursion
        print(n+1);
    }
    // each recursion call will take separate memory in stack -> no base condition -> stack will be filled again and again -> stack overflow
    //so , A function that call itself is called Recursion.

}
