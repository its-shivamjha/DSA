package LinearSearch;

import java.util.Arrays;

public class SearchIn2DArrays {
    public static void main(String[] args) {
        int[][] arr = {
                {21,44,21},
                {88,22,99,11},
                {12,23,34,45,56}
        };

        System.out.println(Arrays.toString(search(arr,22)));


    }
    static int[] search(int[][] arr,int target){
        for(int i = 0;i<arr.length;i++){
            for(int j = 0;j<arr[i].length;j++){
                if(arr[i][j] == target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
