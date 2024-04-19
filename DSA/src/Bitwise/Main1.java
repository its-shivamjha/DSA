package Bitwise;

public class Main1 {
    public static void main(String[] args) {
        int n = 10;
        System.out.println(noOfBase(n));

        System.out.println(isPowerOfTwo(2));

        System.out.println(setBits(9));
    }

    // count the no. of bits
    static int noOfBase(int num){
        int count = 0;
        // while(num != 0){
        //     num = num >> 1;
        //     count++;
        // }
        // return count;

        // OR 
        int b = 2;
        count = (int)(Math.log(num)/Math.log(b) + 1);
        return count;
    }

    // power of 2
    static boolean isPowerOfTwo(int num){
        return (num & (num -1)) == 0;
    }

    // No of set bits in a number
    // find the rightmost bit ( n & -n ) and remove it by subtracting it 
    static int setBits(int num){
        int count = 0;
        while (num > 0) {
            num = num - (num & (-num));
            count ++;
        }
        return count;
    }
}
