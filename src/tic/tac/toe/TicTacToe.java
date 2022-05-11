package tic.tac.toe;

import java.util.Scanner;

public class TicTacToe {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char palyer1 = 'X';
        char player2 = 'O';
        Board board = new Board(3, 3);

        board.print();
        System.out.println(board.haveWinner());
//        char turn = palyer1;
//        boolean stop = false;
//        while (!stop) {
//            boolean vaildPlay=true;
//            if (turn == palyer1) {
//                do{
//                System.out.print("Rows - Colmns: ");
//                int row = sc.nextInt();
//                int coln = sc.nextInt();
//                if (board.isFree(row, coln)) {
//                    board.play(turn, row, coln);
//                }
//                else vaildPlay=false;
//                }
//                while(!vaildPlay);
//
//            }
//        }


    }

}
