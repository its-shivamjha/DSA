package Recursion.BackTracking;

import java.util.*;

public class Maze {
    public static void main(String[] args) {
        // calculate the no of ways of reaching from (0,0) to (n,n)
        System.out.println(count(3, 3));
        printPaths("", 3, 3);
        System.out.println(printPaths2("", 3, 3));
    }
    
    static int count(int row, int col){
        if(row == 1 || col == 1){
            return 1;
        }
        int left = count(row, col-1);
        int right = count(row-1, col);
        return left+right;
    }


    // printing all possible path using R and D
    static void printPaths(String p ,int row, int col){
        
        if(row == 1 && col == 1){
            System.out.println(p);
            return;
        }

        // if false : the only choice we've is to go along column
        if(row > 1){
            printPaths(p+'R',row-1, col);
        }
        // in case it's last col it'll not go in here
        if(col > 1){
            printPaths(p+'D',row, col-1);
        }
    }


    // same thing returning as ArrayList + adding diagonal also 
    static ArrayList<String> printPaths2(String p ,int row, int col){
        if(row == 1 && col == 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        ArrayList<String> ans = new ArrayList<>();
        // for adding diagonal also 
        if(row>1 && col>1){
            ans.addAll(printPaths2(p+'d', row-1, col-1));
        }
        if(row > 1){
            ans.addAll(printPaths2(p+'R',row-1, col));
        }
        if(col > 1){
            ans.addAll(printPaths2(p+'D',row, col-1));
        }
        return ans;
    }
}
