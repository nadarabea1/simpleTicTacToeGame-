package tic.tac.toe;

import java.awt.Button;
import java.util.Scanner;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TicTacToe extends Application implements EventHandler<ActionEvent> {

    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;

    public static void main(String[] args) {
        launch(args);
//        Scanner sc = new Scanner(System.in);
//        char palyer1 = 'X';
//        char player2 = 'O';
//        Board board = new Board(3, 3);
//        
//        board.print();
//        System.out.println(board.haveWinner());
////        char turn = palyer1;
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

    @Override
    public void start(Stage primaryStage) throws Exception {
        Label label1 = new Label("Player1: ");
        label1.setMinWidth(150);
        label1.setMinHeight(20);
        Label label2 = new Label(":::::::");
        label2.setMinWidth(150);
        label2.setMinHeight(20);
        Label label3 = new Label("Player2: ");
        label3.setMinWidth(150);
        label3.setMinHeight(20);
        Label label4 = new Label(":");
        label4.setMinWidth(150);
        label4.setMinHeight(20);

        button1 = new javafx.scene.control.Button();
        button1.setText("");
        button1.setPrefWidth(100);
        button1.setPrefHeight(100);
        button1.setStyle("-fx-font-size:35");
        button1.setOnAction(this);

        button2 = new javafx.scene.control.Button();
        button2.setText("");
        button2.setPrefWidth(100);
        button2.setPrefHeight(100);
        button2.setStyle("-fx-font-size:35");
        button2.setOnAction(this);

        button3 = new javafx.scene.control.Button();
        button3.setText("");
        button3.setPrefWidth(100);
        button3.setPrefHeight(100);
        button3.setStyle("-fx-font-size:35");
        button3.setOnAction(this);

        button4 = new javafx.scene.control.Button();
        button4.setText("");
        button4.setPrefWidth(100);
        button4.setPrefHeight(100);
        button4.setStyle("-fx-font-size:35");
        button4.setOnAction(this);

        button5 = new javafx.scene.control.Button();
        button5.setText("");
        button5.setPrefWidth(100);
        button5.setPrefHeight(100);
        button5.setStyle("-fx-font-size:35");
        button5.setOnAction(this);

        button6 = new javafx.scene.control.Button();
        button6.setText("");
        button6.setPrefWidth(100);
        button6.setPrefHeight(100);
        button6.setStyle("-fx-font-size:35");
        button6.setOnAction(this);

        button7 = new javafx.scene.control.Button();
        button7.setText("");
        button7.setPrefWidth(100);
        button7.setPrefHeight(100);
        button7.setStyle("-fx-font-size:35");
        button7.setOnAction(this);

        button8 = new javafx.scene.control.Button();
        button8.setText("");
        button8.setPrefWidth(100);
        button8.setPrefHeight(100);
        button8.setStyle("-fx-font-size:35");
        button8.setOnAction(this);

        button9 = new javafx.scene.control.Button();
        button9.setText("");
        button9.setPrefWidth(100);
        button9.setPrefHeight(100);
        button9.setStyle("-fx-font-size:35");
        button9.setOnAction(this);

        GridPane layout1 = new GridPane();
        layout1.setPadding(new Insets(10, 10, 10, 10));
        layout1.add(label1, 0, 0, 1, 1);
        layout1.add(label2, 0, 1, 1, 2);
        layout1.add(label3, 1, 0, 1, 1);
        layout1.add(label4, 1, 1, 1, 2);

        GridPane layout2 = new GridPane();
        layout2.setPadding(new Insets(10, 10, 10, 10));

        layout2.add(button1, 0, 0);
        layout2.add(button2, 0, 1);
        layout2.add(button3, 0, 2);
        layout2.add(button4, 1, 0);
        layout2.add(button5, 1, 1);
        layout2.add(button6, 1, 2);
        layout2.add(button7, 2, 0);
        layout2.add(button8, 2, 1);
        layout2.add(button9, 2, 2);

        VBox vbox = new VBox(layout1, layout2);

        Scene scene = new Scene(vbox, 300, 400);
        primaryStage.setTitle("Tic Tac Toe Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    @Override
    public void handle(ActionEvent event) {
        if (event.getSource() == button1) {
            button1.setText("X");
        } else if (event.getSource() == button2) {
            button2.setText("X");
        } else if (event.getSource() == button3) {
            button3.setText("X");
        } else if (event.getSource() == button4) {
            button4.setText("X");
        } else if (event.getSource() == button5) {
            button5.setText("X");
        } else if (event.getSource() == button6) {
            button6.setText("X");
        } else if (event.getSource() == button7) {
            button7.setText("X");
        } else if (event.getSource() == button8) {
            button8.setText("X");
        } else if (event.getSource() == button9) {
            button9.setText("X");
        }
    }
}
