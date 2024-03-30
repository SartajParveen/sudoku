import board.Board;
import game.Game;
import player.Player;
import triple.Triple;

import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");
        Board bd = new Board(9);
        Player p1 = new Player("sartaj", 13," 8919644845", "sartaj@gmail.com");
        bd.setBoardConfig(0,0,3);
        bd.setBoardConfig(0,2,6);
        bd.setBoardConfig(0,3,5);
        bd.setBoardConfig(0,5,8);
        bd.setBoardConfig(0,6,4);
        ArrayList<Integer> col= new ArrayList<>();
        ArrayList<Integer> val= new ArrayList<>();
        col.add(0);
        col.add(1);
        val.add(5);
        val.add(2);
        bd.setColConfig(1,col, val);
        ArrayList<Triple> lst = new ArrayList<>();
        lst.add(new Triple(2,1,8));
        lst.add(new Triple(2,2,7));
        lst.add(new Triple(2,7,3));
        lst.add(new Triple(2,8,1));
        lst.add(new Triple(3,2,3));
        lst.add(new Triple(3,4,1));
        lst.add(new Triple(3,7,8));
        lst.add(new Triple(4,0,9));
        lst.add(new Triple(4,3,8));
        lst.add(new Triple(4,4,6));
        lst.add(new Triple(4,5,3));
        lst.add(new Triple(4,8,5));
        lst.add(new Triple(5,1,5));
        lst.add(new Triple(5,4,9));
        lst.add(new Triple(5,6,6));
        lst.add(new Triple(6,0,1));
        lst.add(new Triple(6,1,3));
        lst.add(new Triple(6,6,2));
        lst.add(new Triple(6,7,5));
        lst.add(new Triple(7,7,7));
        lst.add(new Triple(7,8,4));
        lst.add(new Triple(8,2,5));
        lst.add(new Triple(8,3,2));
        lst.add(new Triple(8,5,6));
        lst.add(new Triple(8,6,3));
        bd.settriple(lst);
        bd.printBoardConfig();
        Game gm= new Game(bd, p1);
        gm.play();




    }
}
