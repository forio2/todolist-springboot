package com.example.todo.controllerfe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.stage.Stage;

import java.io.IOException;

public class TaskController {

    @FXML
    private Button addBtn;

    @FXML
    private Button backBtn;

    @FXML
    private Button removeBtn;

    @FXML
    private ListView<?> listOfTask;

    private String username;

    public void setUsername(String name) { this.username = name;}

    @FXML
    public void initialize() {

    }

    @FXML
    public void handleAddBtn(ActionEvent event) throws IOException {
            Button a = (Button) event.getSource();
            Stage stage = (Stage) a.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/todo-page.fxml"));
            stage.setScene(new Scene(loader.load(), 600, 400));
            AddItemController addItemController = loader.getController();
            addItemController.setUsername(username);
            stage.show();
    }

    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        Button a = (Button) event.getSource();
        Stage stage = (Stage) a.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/home.fxml"));
        stage.setScene(new Scene(loader.load(), 600, 400));
        stage.show();
    }
}
