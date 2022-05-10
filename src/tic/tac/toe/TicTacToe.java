
package tic.tac.toe;

public class TicTacToe {

    public static void main(String[] args) {
        Player play1=new Player("Nada");      
        Player play2=new Player("Fares");
        
        Board board= new Board(3, 3);
        
        board.print();

    }
    
}
