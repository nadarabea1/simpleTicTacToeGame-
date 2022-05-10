package tic.tac.toe;

public class Player {
    private final String NAME;
    
    public Player(String name){
        this.NAME=name;
    }
    public String getName(){
        return this.NAME;
    }
}
