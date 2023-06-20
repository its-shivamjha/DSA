package Recursion;

public class Message {
    //Print message 5 times without using the function five times or
    // without printing 5 statements in 1 function.

    public static void main(String[] args){
        message();
    }
    static void message(){
        System.out.println("Hello world");
        message2();
    }
    static void message2(){
        System.out.println("Hello world");
        message3();
    }
    static void message3(){
        System.out.println("Hello world");
        message4();
    }
    static void message4(){
        System.out.println("Hello world");
        message5();
    }
    static void message5(){
        System.out.println("Hello world");
    }
}
