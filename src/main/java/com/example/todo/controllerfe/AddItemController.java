package com.example.todo.controllerfe;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class AddItemController {

    @FXML
    private Button addBtn;

    @FXML
    private Button backBtn;

    @FXML
    private TextField taskTextField;

    @FXML
    private TextField descriptionTextField;

    private String username;

    public void setUsername(String name) { this.username = name;}

    private void showError (String title, String context) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle(title);
        error.setContentText(context);
        error.setHeaderText(null);
        error.showAndWait();
    }

    public boolean checkNull (String a) {
        return a.equals("");
    }

    @FXML
    public void handleAddBtn(ActionEvent event) throws IOException {
        if (checkNull(taskTextField.getText())) {
            showError("Error", "Please fill in the task.");
        } else {
            Button a = (Button) event.getSource();
            Stage stage = (Stage) a.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/todo-page.fxml"));
            stage.setScene(new Scene(loader.load(), 600, 400));
            stage.show();
        }
    }

    @FXML
    public void handleBack(ActionEvent event) throws IOException {
        Button a = (Button) event.getSource();
        Stage stage = (Stage) a.getScene().getWindow();
        FXMLLoader loader = new FXMLLoader(getClass().getResource("/task.fxml"));
        stage.setScene(new Scene(loader.load(), 600, 400));
        TaskController task = loader.getController();
        task.setUsername(username);
        stage.show();
    }



}
