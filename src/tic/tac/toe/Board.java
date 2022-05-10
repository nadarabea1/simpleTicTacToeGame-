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
        return retval;
    }

    public void print() {
        for (int rows = 0; rows < ROWS; rows++) {
            for (int colns = 0; colns < COLNS; colns++) {
                if (game[rows][colns] == null) {
                    System.out.print("NO ");
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

}
