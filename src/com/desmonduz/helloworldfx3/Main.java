package com.desmonduz.helloworldfx3;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

public class Main extends Application {

    //init method

    @Override
    public void start(Stage primaryStage) throws Exception{
        Parent root = FXMLLoader.load(getClass().getResource("mainwindow.fxml"));
        primaryStage.setTitle("Hello JavaFX");
        primaryStage.setScene(new Scene(root, 900, 450));
        primaryStage.show();
    }

    //stop method

    public static void main(String[] args) {
        launch(args);
    }
}
