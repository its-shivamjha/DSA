package Bitwise;

public class Main {
    public static void main(String[] args) {

        // Operators
        // System.out.println("XOR of a number with 0 (2 ^ 0) is Num:  "+(2 ^0));
        // System.out.println("XOR of same numbers (2^2) is 0 :"+(2 ^ 2));
        // System.out.println("Left Shift 2 << 4 is : " + (2 << 4));         // 2 * (2)^4
        // System.out.println("Right Shift 32 >> 4 is : " + (32 >> 4));        // 2 / (2)^4

        String binary = "101";
        System.out.println(binaryToDecimal(binary));
        System.out.println(Integer.parseInt(binary,2));     // Direct Way

        int decimal = 5;
        System.out.println(decimalToBinary(decimal));
        System.out.println(Integer.toBinaryString(decimal));      // Direct 

        isEvenOrOdd(3);

        int[] arr = {1,1,2,2,3,4,4,5,6,5,6};
        System.out.println("The number with only one occurence is : " +findUnique(arr));

        System.out.println(magicNumber(6));
    }

    // Convert Binary String to Decimal 
    static int binaryToDecimal(String binary){
        int decimal = 0;
        int multiplier = 1;
        for(int i = binary.length()-1;i>=0;i--){
            if(binary.charAt(i) == '1'){
                decimal += multiplier;
            }
            multiplier = multiplier << 1;   // 2 * multiplier
        }
        return decimal;
    }

    // Convert Decimal To Binary
    static String decimalToBinary(int decimal){
        StringBuilder sb = new StringBuilder();

        while(decimal != 0){
            sb.append(decimal % 2);
            decimal /= 2;
        }

        return sb.reverse().toString();
    }

    static void isEvenOrOdd(int num){
        if((num & 1) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    // In an array each element has 2 occurance except one find that one
    static int findUnique(int[] arr){
        int num = 0;
        for(int i = 0;i<arr.length;i++){
            num = num ^ arr[i];
        }

        return num;
    }

    // swap using xor
    static void swap(int a , int b){
        // a = a ^ b;
        // b = a ^ b;      // got a 
        // a = a ^ b;      // got b

        System.out.println(a);
        System.out.println(b);
    }

    // Magic Number for a given 
    static int magicNumber(int n){
        int ans = 0;
        int base = 5;

        while(n>0){
            int digit = n & 1;      // get the lsb
            n = n >> 1;             // remove the lsb by right shifting
            ans += digit * base;
            base = base * 5;
        }
        return ans;
    }

    // 



}
