package gui.view;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import javax.swing.*;

public class MenuView extends Application {

    Button restart = new Button("Restart");
    Button hint = new Button("Hint");
    Button randomSolve = new Button("Random");
    Label scoreLabel = new Label();
    Label mode = new Label("Mode : ");
    Label gameNameLabel = new Label();
    Label gameOver = new Label();

    //private GameView gv;

    @Override
    public void start(Stage primaryStage) {

        // bouton restart
        restart.setOnAction(event ->
        {

        });
        restart.setStyle("-fx-background-color: blue; -fx-text-fill: white;");
        restart.setPrefWidth(100);
        restart.setPrefHeight(50);

        // bouton hint
        hint.setOnAction(event ->
        {

        });
        hint.setStyle("-fx-background-color: grey; -fx-text-fill: white;");
        hint.setPrefWidth(100);
        hint.setPrefHeight(50);

        // bouton random
        randomSolve.setOnAction(event ->
        {

        });
        randomSolve.setStyle("-fx-background-color: grey; -fx-text-fill: white;");
        randomSolve.setPrefWidth(100);
        randomSolve.setPrefHeight(50);

        // label score
        //scoreLabel.setText("Score : " + this.gv.getGrid().getPossiblePoint().size());
        // label mode
        if (gui.Home.mode) {
            mode.setText("Mode de jeu : 5D");
        } else {
            mode.setText("Mode de jeu : 5T");
        }

        VBox buttonBox = new VBox(10, restart, hint, randomSolve, mode);
        StackPane scorePane = new StackPane(scoreLabel);
        StackPane gameNamePane = new StackPane(gameNameLabel);
        StackPane gameOverPane = new StackPane(gameOver);

        buttonBox.setAlignment(Pos.CENTER);
        scorePane.setAlignment(Pos.CENTER);
        gameNamePane.setAlignment(Pos.CENTER);
        gameOverPane.setAlignment(Pos.CENTER);

        VBox layout = new VBox(20, scorePane, buttonBox, gameNamePane, gameOverPane);
        layout.setAlignment(Pos.CENTER);
        layout.setStyle("-fx-background-color: lightgreen;");

        Scene scene = new Scene(layout, 400, 400); // Set width and height as per your requirement
        primaryStage.setTitle("Menu Example");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public void setGv(JPanel game) {
        //this.gv = (GameView) game;
    }
}
