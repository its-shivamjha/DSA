package Recursion.Lec3;

public class SortedArray {
    public static void main(String[] args) {
        // CHECK WHETHER AN ARRAY IS SORTED OR NOT
        int[] arr = {1,2,3,4,3,5};
        System.out.println(check(arr,0));

    }
    static boolean check(int[] arr , int i){
        if(arr[i] == arr[arr.length-1]){
            return true;
        }
        return arr[i]<arr[i+1] && check(arr,i+1);
    }

}
