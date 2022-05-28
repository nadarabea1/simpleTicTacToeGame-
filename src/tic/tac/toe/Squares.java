
package tic.tac.toe;

public class Squares extends Player{
    private int row;
    private int coln;
    
    public Squares(String name, int row, int coln){
        super(name);
        this.row=row;
        this.coln=coln;
    }

    public int getRow() {
        return row;
    }

    public int getColn() {
        return coln;
    }

    
    
    
}
