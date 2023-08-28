package Recursion.Intro;

public class Nums {
    public static void main(String[] args) {
        System.out.println("Printing 5 to 1: ");
        printNums(5);
        System.out.println("\nPrinting 1 to 5: ");
        printNums2(5);
        System.out.println("\nprinting them together: ");
        printBoth(5);

    }

    // print numbers opposite from n to 1
    static void printNums(int n){
        if(n == 0){
            return;
        }
        System.out.print(n +" ");
        printNums(n-1);
    }

    // print numbers opposite from n to 1
    static void printNums2(int n){
        if(n == 0){
            return;
        }
        printNums2(n-1);
        System.out.print(n +" ");
    }

    static void printBoth(int n){
        if(n == 0){
            return;
        }
        System.out.print(n+" ");
        printBoth(n-1);
        System.out.print(n+" ");
    }


}
