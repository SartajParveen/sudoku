package game;
import board.Board;
import player.Player;
public class Game {
    Board bd;
    Player pl;
    public Game(Board bd,Player pl){
        this.bd=bd;
        this.pl=pl;
    }
    public void play(){
        solveSudoku(0,0);
    }
    public void solveSudoku(int row,int col){
        if(row==bd.size){
            System.out.println("Sudoku solved!! by "+pl.getName());
            bd.printBoardConfig();
            return;
        }
        int nrow=0;
        int ncol=0;
        if(col==bd.size){
            nrow=row+1;
            col=0;
        }
        else{
            nrow=row;
            ncol=col+1;

        }
        if(this.bd.mat[row][col]!=0){
            solveSudoku(nrow,ncol);
        }
        else{
        for(int i=1;i<=9;i++){
            if(validPos(bd.mat,row,col,i)){
                bd.mat[row][col]=i;
                solveSudoku(nrow,ncol);
                bd.mat[row][col]=0;
            }
        }
    }

    }
    public boolean validPos(int mat[][],int row,int col,int num){
        for(int i=0;i<bd.size;i++){
            if(mat[row][i]==num){
                return false;
            }
        }
        for(int i=0;i<bd.size;i++){
            if(mat[i][col]==num){
                return false;
            }
        }
        int r=(row/3)*3;
        int c=(col/3)*3;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(mat[r+i][c+j]==num){
                    return false;
                }
            }
        }
        return true;
    }

}
