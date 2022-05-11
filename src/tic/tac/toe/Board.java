package tic.tac.toe;

public class Board {

    private final int ROWS;
    private final int COLNS;
    private Squares[][] game;

    public Board(int rows, int colns) {
        this.ROWS = rows;
        this.COLNS = colns;
        game = new Squares[rows][colns];
    }

    public int getROWS() {
        return ROWS;
    }

    public int getCOLNS() {
        return COLNS;
    }

    public boolean isFree(int row, int coln) {
        boolean retavl = false;
        try {
            if (game[row][coln] != null) {
                retavl = true;
            }
        } catch (ArrayIndexOutOfBoundsException ex) {

        }
        return retavl;

    }

    public boolean play(char name, int row, int coln) {
        boolean retval = false;
        if (isFree(row, coln)) {
            game[row][coln] = new Squares(name, row, coln);
        }
        print();
        return retval;
    }

    public boolean autoPlay(char name) {
        boolean retval = false;
        for (int rows = 0; rows < ROWS; rows++) {
            for (int colns = 0; colns < COLNS; colns++) {
                if (isFree(rows, colns)) {
                    game[rows][colns] = new Squares(name, rows, colns);
                    break;
                }
            }
        }
        print();
        return retval;
    }

    public void print() {
        for (int rows = 0; rows < ROWS; rows++) {
            for (int colns = 0; colns < COLNS; colns++) {
                if (game[rows][colns] == null) {
                    System.out.print(" ");
                } else {
                    System.out.print(game[rows][colns].getName());

                }
            }
            System.out.println();

        }
    }
    
    public boolean isSpaceAvaiable(){
        boolean retval =false;
        for(int rows=0; rows<ROWS; rows++){
            for(int colns=0; colns<COLNS; colns++){
                if(game[rows][colns]==null)return true;
            }
        }
        return retval;
    }
    public boolean haveWinner(){
        boolean retval=false;
        int count=0;
        for(int rows=0; rows<ROWS; rows++){
            for(int colns=0 , near=1; colns<COLNS-1; colns++, near++){
                if(game[rows][colns].getName()==game[rows][near].getName())count++;
            }
            if(count==2)return true;
            count=0;
        }
        
        for(int colns=0; colns<COLNS; colns++){
            for(int rows=0 , near=1; rows<ROWS-1; rows++, near++){
                if(game[rows][colns].getName()==game[near][colns].getName())count++;
            }
            if(count==2)return true;
            count=0;
        }
        return retval;
    }

}
