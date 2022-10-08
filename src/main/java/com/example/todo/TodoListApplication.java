package com.example.todo;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;

public class TodoListApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        //FXMLLoader fxmlLoader = new FXMLLoader(TodoListApplication.class.getResource("/home.fxml"));
        //Scene scene = new Scene(fxmlLoader.load(), 600, 400);
        //stage.setTitle("todo");
        //stage.setScene(scene);
        //stage.show();

        Parent root = FXMLLoader.load(getClass().getResource("/home.fxml"));
        stage.setTitle("Todo Application");
        stage.setScene(new Scene(root));
        stage.setResizable(false);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}