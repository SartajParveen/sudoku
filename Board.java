package board;
import java.util.*;
import triple.Triple;
public class Board {
    public int size;
    public int mat[][];
    public Board(int size){
        this.size=size;
        mat=new int[size][size];
    }
public void printBoardConfig(){
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(mat[i][j]+" ");
            }
            System.out.println();
        }
    }
public void setBoardConfig(int row,int col,int val){
        mat[row][col]=val;
    }
public void setColConfig(int row,ArrayList<Integer> col,ArrayList<Integer> val){
        for(int i=0;i<col.size();i++){
            
            mat[row][col.get(i)]=val.get(i);
        }
    }
   public void settriple(ArrayList<Triple> t){
        for(int i=0;i<t.size();i++){
            mat[t.get(i).row][t.get(i).col]=t.get(i).val; 
        }
    }

}
