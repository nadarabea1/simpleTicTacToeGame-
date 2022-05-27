package tic.tac.toe;

import java.util.ArrayList;

public class Board extends Player {

    private final int ROWS=3;
    private final int COLNS=3;
    private Squares [][] game;

    public Board() {
        super();
    }
    
    

    
    public int getROWS(int button) {
        if(button>=1 && button <=3)
        return 1;
        else if(button>=4 && button <=6)
        return 2;
        else
        return 3;
    }

    public int getCOLNS(int button) {
        return button%3;
    }

    public boolean isFree(int row, int coln) {
        try {
            if (game[row-1][coln-1].equals(null) ) {
                return true;
            }
        } catch (IndexOutOfBoundsException ex) {
            System.err.println("ISFREE METHOD");

        }
        catch(NullPointerException ex){
            System.out.println(ex.getMessage());
        }
        return false;

    }

    public boolean play(String name, int row, int coln) {
       
        boolean retval = false;
        if (isFree(row, coln)) {
            game[row][coln]=new Squares(row, coln);
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
        for(int i=1; i<=9; i+=4){
            
        }
        return retval;
    }

    

    
}
