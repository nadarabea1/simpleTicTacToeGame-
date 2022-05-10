
package tic.tac.toe;

public class Shapes extends Player{
    private int row;
    private int coln;
    
    public Shapes(String name, int row, int coln){
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
    
    @Override
    public String toString(){
        return "Player: "+ getName()+ " ["+getRow()+"] "+ "["+getColn()+"]";
    }
}
