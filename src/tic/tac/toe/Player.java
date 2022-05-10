package tic.tac.toe;

public class Player {
    private final char NAME;
    
    public Player(char name){
        this.NAME=name;
    }
    public char getName(){
        return this.NAME;
    }
}
