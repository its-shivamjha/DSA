package Recursion.BackTracking;

public class Nqueens {
    public static void main(String[] args) {
        boolean[][] board = new boolean[4][4];
        queens(board, 0,0);
    }

    // checking one row and rest recursion will handle 
    static void queens(boolean board[][], int row, int col){
         if(row == board.length){
            display(board) ;
            System.out.println();
            return;
         }

         // if board[row][col] is safe go to next row
        if(isSafe(board,row,col)){
            board[row][col] = true;
            queens(board,row+1,0);
            board[row][col] = false;
        }

        // if board[row][col] is not safe then go to next column
        if(col < board.length-1) {
            queens(board, row, col + 1);
        }
    }

    // checking if at a position (row, col) a queen can be placd or not
    private static boolean isSafe(boolean[][] board,int row, int col){

        // checking the column is safe or not
        for(int i = 0 ;i< row ;i++){
            if(board[i][col]){
                return false;
            }
        }

        // cheking for left digonal 
        int maxLeft = Math.min(row, col);
        for(int i = 1 ;i<= maxLeft ;i++){
            if(board[row-i][col-i]){
                return false;
            }
        }

        // checking for right digonal
        int maxRight = Math.min(row, board.length -col-1);
        for(int i = 1 ;i<= maxRight ;i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;

        // This will not work coz : after each time checking the if condition row = row + 1 and col = col+1 
        // and this will change these variables , I can use it to check the right digonal coz there is no use of row and column after this in this funciton 
        // int row = 0;
        // int col = 0;
        // int maxRight = 5
        // for(int count = 0 ;count < maxRight ;count++){
        //     if(!board[row++][col++]){
        //         return false;
        //     }
        // }
        // row : 5
        // col : 5 

    }

    private static void display(boolean board[][]){
        for(boolean[] row : board){
            for(boolean ele : row){
                if(ele){
                    System.out.print("Q");
                }else{
                    System.out.print("X");
                }
            }
            System.out.println();
        }
    }
}
