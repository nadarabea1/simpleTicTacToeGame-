package tic.tac.toe;

import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
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

    Board board = new Board();

    int count = 0;

    public static void main(String[] args) {
        launch(args);
        
//        TimeThread thread= new TimeThread(args);
//        thread.start();
    }
    public String Turn(int count){
        if(count%2==0)return "O";
        else return "X";
    }

    @Override
    public void start(Stage primaryStage) throws Exception { 
        Label label1 = new Label("Player1 'X' ");
        label1.setMinWidth(150);
        label1.setMinHeight(20);
        label1.setStyle("-fx-font-size:25");

        Label label2 = new Label("Player2 'O' ");
        label2.setMinWidth(150);
        label2.setMinHeight(20);
        label2.setStyle("-fx-font-size:25");

        
        button1 = new Button();
        button1.setText("");
        button1.setPrefWidth(100);
        button1.setPrefHeight(100);
        button1.setStyle("-fx-font-size:35");
        button1.setOnAction(this);

        button2 = new Button();
        button2.setText("");
        button2.setPrefWidth(100);
        button2.setPrefHeight(100);
        button2.setStyle("-fx-font-size:35");
        button2.setOnAction(this);

        button3 = new Button();
        button3.setText("");
        button3.setPrefWidth(100);
        button3.setPrefHeight(100);
        button3.setStyle("-fx-font-size:35");
        button3.setOnAction(this);

        button4 = new Button();
        button4.setText("");
        button4.setPrefWidth(100);
        button4.setPrefHeight(100);
        button4.setStyle("-fx-font-size:35");
        button4.setOnAction(this);

        button5 = new Button();
        button5.setText("");
        button5.setPrefWidth(100);
        button5.setPrefHeight(100);
        button5.setStyle("-fx-font-size:35");
        button5.setOnAction(this);

        button6 = new Button();
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

        button9 = new Button();
        button9.setText("");
        button9.setPrefWidth(100);
        button9.setPrefHeight(100);
        button9.setStyle("-fx-font-size:35");
        button9.setOnAction(this);

        GridPane layout1 = new GridPane();
        layout1.setPadding(new Insets(10, 10, 10, 10));
        layout1.add(label1, 0, 0, 1, 10);
        layout1.add(label2, 1, 0, 1, 10);

        GridPane layout2 = new GridPane();
//        layout2.setPadding(new Insets(10, 10, 10, 10));

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

        Scene scene = new Scene(vbox, 300, 350);
        primaryStage.setTitle("Tic-Tac-Toe Game");
        primaryStage.setScene(scene);
        primaryStage.show();
    }
    
    @Override
    public void handle(ActionEvent event) {
        count++;
        int row = board.getROWS(count);
        int col = board.getCOLNS(count);
        String turn =Turn(count);
       if(!board.haveWinner()){
           if (event.getSource()== button1) {
                    button1.setText(turn);
                    board.play(turn, row, col);
                } 
                else if (event.getSource()== button2) {
                    button2.setText(turn);
                    board.play(turn, row, col);
                }else if (event.getSource()== button3) {
                    button3.setText(turn);
                    board.play(turn, row, col);
                }else if (event.getSource()== button4) {
                    button4.setText(turn);
                    board.play(turn, row, col);
                }else if (event.getSource()== button5) {
                    button5.setText(turn);
                    board.play(turn, row, col);
                }else if (event.getSource()== button6) {
                    button6.setText(turn);
                    board.play(turn, row, col);
                }else if (event.getSource()== button7) {
                    button7.setText(turn);
                    board.play(turn, row, col);
                }else if (event.getSource()== button8) {
                    button8.setText(turn);
                    board.play(turn, row, col);
                }else if (event.getSource()== button9) {
                    button9.setText(turn);
                    board.play(turn, row, col);
                }
                 
        if(board.haveWinner()){
            Thread thread =new Thread();
            WinnerThread winner= new WinnerThread(turn);
            winner.start();
        }
       }
        
    }
}

