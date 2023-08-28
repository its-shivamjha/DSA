package Recursion.Lec2;

public class FibonacciNum {
    public static void main(String[] args) {
        //if you can break a problem into smaller version of it you can use Recursion
        System.out.println(fibo(7));

        for(int i = 0;i<10;i++){
        System.out.println(fiboFormula(i));
    }
   }
    static int fibo(int n){
        // base condition is represented by the answers we already have
        if(n<2){
            return(n);
        }
        return fibo(n-1) + fibo(n-2);
    }

    static long fiboFormula(int n) {
        return (long) (Math.pow(((1 + Math.sqrt(5)) / 2), n) / Math.sqrt(5));
    }


    // Print fibonacci sequence


}
