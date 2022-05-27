package tic.tac.toe;

import java.util.logging.Level;
import java.util.logging.Logger;

public class WinnerThread extends Thread{

    public String Winner;
    public WinnerThread(String turn) {
        if(turn=="X")
        this.Winner="O";
        else Winner="X";
    }

    @Override
    public void run() {
        for(int i=0; i<20; i++){
            System.out.println("WINNER IS: " + Winner);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException ex) {
                Logger.getLogger(WinnerThread.class.getName()).log(Level.SEVERE, null, ex);
            }

        }
    }
    
    
}
