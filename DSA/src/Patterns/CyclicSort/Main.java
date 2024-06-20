package Patterns.CyclicSort;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        int[] arr = {4,3,2,6,2,1};

        int i = 0;
        while(i < arr.length){
            int correct = arr[i] - 1;

            // if arr[i] is at correct index , let it be, move on
            if(arr[i] != arr[correct]){
                swap(arr, i, correct);
            }else{
                i++;
            }
        }

        System.out.println(Arrays.toString(arr));
    }

    static void swap(int[] arr, int a , int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
