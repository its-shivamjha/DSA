package Recursion.BackTracking;

import java.util.*;

public class MazeRestriction {
    public static void main(String[] args) {

        // we can pass from only the true column : give all the possible paths
        boolean[][] arr ={
            {true,true,true},
            {true,false,true},
            {true,true,true}
        };

        System.out.println(printPathRest("", arr, 0, 0));
    }

    static ArrayList<String> printPathRest(String p, boolean[][] arr,int i ,int j){
        int row = arr.length-1;
        int col = arr[0].length-1;
        if(i == row && j == col){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        
        ArrayList<String> ans = new ArrayList<>();
        if(arr[i][j]){
            if(i<row){
                ans.addAll(printPathRest(p+'D', arr, i+1, j));
            }
            if(j<col){
                ans.addAll(printPathRest(p+'R', arr, i, j+1));
            }
        }

        return ans;
    }


}
