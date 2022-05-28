package tic.tac.toe;

import java.util.ArrayList;

public class Board {

    private final int ROWS = 3;
    private final int COLNS = 3;
    private Squares[][] game = new Squares[ROWS][COLNS];

    public int getROWS(int button) {
        if (button >= 0 && button <= 2) {
            return 1;
        } else if (button >= 3 && button <= 5) {
            return 2;
        } else {
            return 3;
        }
    }

    public int getCOLNS(int button) {
        if (button == 0 || button ==3 || button==6) {
            return 1;
        } else if (button == 1 || button ==4 || button==7) {
            return 2;
        } else {
            return 3;
        }
    }

    public boolean isFree(int row, int coln) {
        try {
            if (game[row - 1][coln -1].getName() == null) {
                return true;
            }
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("ISFREE METHOD");

        } catch (NullPointerException ex) {
            System.err.println(ex.getMessage());
            
        }
        return false;

    }

    public boolean play(String name, int row, int coln) {

        boolean retval = false;
        if (isFree(row, coln)) {
            game[row][coln] = new Squares(name, row, coln);
        }
        return retval;
    }

//    public boolean autoPlay() {
//        boolean retval = false;
//        for (int rows = 0; rows < ROWS; rows++) {
//            for (int colns = 0; colns < COLNS; colns++) {
//                if (isFree(rows, colns)) {
//                    game[rows][colns] = new Squares(rows, colns);
//                    break;
//                }
//            }
//        }
//        return retval;
//    }
    public boolean isSpaceAvaiable() {
        boolean retval = false;
        for (int rows = 0; rows < ROWS; rows++) {
            for (int colns = 0; colns < COLNS; colns++) {
                if (game[rows][colns] == null) {
                    return true;
                }
            }
        }
        return retval;
    }

    public boolean haveWinner() {
        boolean retval = false;
        int count = 0;

        for (int rows = 0; rows < ROWS; rows++) {
            for (int colns = 0, near = 1; colns < COLNS - 1; colns++, near++) {
                try{
                    if (game[rows][colns].getName().equals(game[rows][near].getName())) {
                    count++;
                }}
                catch(NullPointerException ex){
                    System.err.println("Null");
                }
                
            }
            if (count == 2) {
                return true;
            }
            count = 0;
        }

        for (int colns = 0; colns < COLNS; colns++) {
            for (int rows = 0, near = 1; rows < ROWS - 1; rows++, near++) {
                try{
                    if (game[rows][colns].getName().equals(game[near][colns].getName())) {
                    count++;
                }
                }catch(NullPointerException ex){
                    System.err.println("NULL");
                }
                
            }
            if (count == 2) {
                return true;
            }
            count = 0;
        }
//        for (int i = 1; i <= 9; i += 4) {
//
//        }
        return retval;
    }

}
