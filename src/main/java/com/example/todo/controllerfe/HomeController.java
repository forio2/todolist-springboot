package com.example.todo.controllerfe;

import com.example.todo.configfe.ComponentConfig;
import com.example.todo.modelfe.User;
import com.example.todo.servicefe.AccountManagement;
import com.example.todo.servicefe.TodoAPIService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class HomeController {

    @FXML
    private Button enterBtn;

    @FXML
    private TextField usernameTextField;

    private TodoAPIService service;
    private AccountManagement accountManagement;

    private void showError (String title, String context) {
        Alert error = new Alert(Alert.AlertType.ERROR);
        error.setTitle(title);
        error.setContentText(context);
        error.setHeaderText(null);
        error.showAndWait();
    }

    @FXML
    public void initialize(){
        accountManagement = new AccountManagement();
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        service = context.getBean(TodoAPIService.class);
    }

    public boolean checkNull (String a) {
        return a.equals("");
    }


    @FXML
    public void handleEnterBtn(ActionEvent event) throws IOException {
        if (checkNull(usernameTextField.getText())) {
            showError("Error", "Please fill in the username.");
        } else {
            User newUser = new User(usernameTextField.getText());
            service.addUser(newUser);


            Button a = (Button) event.getSource();
            Stage stage = (Stage) a.getScene().getWindow();
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/task.fxml"));
            stage.setScene(new Scene(loader.load(), 600, 400));
            TaskController taskController = loader.getController();
            taskController.setUsername(usernameTextField.getText());
            stage.show();
        }
    }

}