package Recursion.BackTracking;
import java.util.*;
public class Backtracking {
    public static void main(String[] args) {
        boolean[][] arr = {
                {true, true, false, true, true, false, true},
                {false, true, false, false, true, true, true},
                {true, true, true, true, false, true, false},
                {false, true, false, true, true, true, true},
                {false, true, false, false, true, false, true},
                {false, true, true, true, true, false, true},
                {false, false, false, false, true, true, true}
        };
        int[][] arr2 = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1}
        };



        allDirections("", arr, 0, 0);
        System.out.println(Arrays.deepToString(arr));        // no changes in the actual array

        matrix("", arr, 0, 0, new int[arr.length][arr[0].length], 1);
        System.out.println((path(arr2,"",0,0)));
    }

    // print all the possible paths
    static void allDirections(String p , boolean[][] arr, int i , int j){
        int row = arr.length-1;
        int col = arr[0].length-1;

        if(i == row && j == col){
            System.out.println(p);
            return;
        }
        
        // if arr[i][j] is false return
        if(!arr[i][j]){
            return;
        }

        // if visited mark it false
        arr[i][j] = false;

        // Down
        if(i<col){
            allDirections(p+'D', arr, i+1, j);
        }
        // Right
        if(j<row){
            allDirections(p+'R', arr, i, j+1);
        }
        // UP
        if(i>0){
            allDirections(p+'U', arr, i-1, j);
        }
        // Left
        if(j>0){
            allDirections(p+'L', arr, i, j-1);
        }

        // when coming out of the code mark it true again
        arr[i][j] = true;
    }

    // print the matrix for each path
    static void matrix(String p , boolean[][] arr, int i , int j,int[][] path ,int step){
        int row = arr.length-1;
        int col = arr[0].length-1;
        
        if(i == row && j == col){
            path[i][j] = step;
            System.out.println(p);
            for(int[] a : path){
                System.out.println(Arrays.toString(a));
            }
            System.out.println();
            return;
        }

        
        // if arr[i][j] is false return
        if(!arr[i][j]){
            return;
        }

        // if visited mark it false
        arr[i][j] = false;
        path[i][j] = step;

        // Down
        if(i<col){
            matrix(p+'D', arr, i+1, j,path,step+1);
        }
        // Right
        if(j<row){
            matrix(p+'R', arr, i, j+1,path,step+1);
        }
        // UP
        if(i>0){
            matrix(p+'U', arr, i-1, j,path,step+1);
        }
        // Left
        if(j>0){
            matrix(p+'L', arr, i, j-1,path,step+1);
        }

        // when coming out of the code mark it true again
        arr[i][j] = true;
        path[i][j] = 0;
    }

    // using Arraylist and printing the paths in sorted array ( just define the condition in alphabetical way)
    static ArrayList < String > path(int[][] arr, String p, int row, int col){
        int n= arr.length;
        if(row == n-1 && col == n-1){
            ArrayList < String > list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList < String > ans = new ArrayList<>();
        if(arr[row][col] == 1){
            if(row<n-1){
                arr[row][col] = 0;
                ans.addAll(path(arr, p+'D', row+1, col));
                arr[row][col] = 1;
            }
            if(col<n-1){
                arr[row][col] = 0;
                ans.addAll(path(arr, p+'R', row, col+1));
                arr[row][col] = 1;
            }
            if(row>0){
                arr[row][col] = 0;
                ans.addAll(path(arr, p+'U', row-1, col));
                arr[row][col] = 1;
            }
            if(col>0){
                arr[row][col] = 0;
                ans.addAll(path(arr, p+'L', row, col-1));
                arr[row][col] = 1;
            }

        }

        return ans;
    }
}
