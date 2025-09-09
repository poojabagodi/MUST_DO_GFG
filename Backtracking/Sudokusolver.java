package Backtracking;

public class Sudokusolver {
    public static boolean issafe(int board[][],int row,int col,int digit){
          //col
          for(int i=0;i<board.length;i++){
            if(board[i][col]==digit){
                return false;
            }
          }
          //row
            for(int j=0;j<board.length;j++){
                if(board[row][j]==digit){
                    return false;
                }
            }
            //3*3 grid
            int sr=(row/3)*3;
            int sc=(col/3)*3;
            for(int i=sr;i<sr+3;i++){
                for(int j=sc;j<sc+3;j++){
                    if(board[i][j]==digit){
                        return false;
                    }
                }
            }
            return true;
    }

    public static boolean sudokusolver(int board[][],int row,int col){
        //base case
        if(row==board.length){
            return true;
        }
        //recursion
        int nextrow=row,nextcol=0;
        if(col==board.length-1){
            nextrow=row+1;
            nextcol=0;
        }else{
            nextrow=row;
            nextcol=col+1;
        }
        if(board[row][col]!=0){
            return sudokusolver(board, nextrow, nextcol);
        }
        for(int digit=1;digit<=9;digit++){
            if(issafe(board, row, col, digit)){
                board[row][col]=digit;
                if(sudokusolver(board, nextrow, nextcol)){
                    return true;
                }
                board[row][col]=0; //backtracking
            }
        }
        return false;
    }

    public static void printboard(int board[][]){
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board.length;j++){
                System.out.print(board[i][j]+" ");
            }
            System.out.println();
        }
    }
}
