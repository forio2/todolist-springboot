package com.example.todo.controllerfe;


import com.example.todo.configfe.ComponentConfig;
import com.example.todo.modelfe.Item;
import com.example.todo.servicefe.ItemManagement;
import com.example.todo.servicefe.TodoAPIService;
import javafx.application.Platform;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


import java.io.IOException;

public class TaskController {

    @FXML
    private Button addBtn;

    @FXML
    private Button backBtn;

    @FXML
    private Button removeBtn;

    @FXML
    private TableView itemTable;

    @FXML
    private TableColumn<Item, String> col_id;

    @FXML
    private TableColumn<Item, String> col_desc;

    @FXML
    private TableColumn<Item, String> col_status;

    @FXML
    private TableColumn<Item, String> col_order;

    @FXML
    private TableColumn<Item, String> col_item;

    private ObservableList<Item> list;
//    listprivate List<Items> itemsList = new ArrayList<>();

    private String username;
    private TodoAPIService service;
    private ItemManagement itemManagement;

    public void setUsername(String name) { this.username = name;}

    @FXML
    public void initialize() {
        // to be changed / checked when having data
        itemManagement = new ItemManagement();
        ApplicationContext context = new AnnotationConfigApplicationContext(ComponentConfig.class);
        service = context.getBean(TodoAPIService.class);
        itemManagement.setItemMapFromList(service.getAllItems());



        Platform.runLater(new Runnable() {
            @Override
            public void run() {
                // right now should working fine but cant check coz of no mapping items
                col_id.setCellValueFactory(new PropertyValueFactory<>("ID"));
                col_desc.setCellValueFactory(new PropertyValueFactory<>("Description"));
                col_status.setCellValueFactory(new PropertyValueFactory<>("Status"));
                col_order.setCellValueFactory(new PropertyValueFactory<>("Order"));
                col_item.setCellValueFactory(new PropertyValueFactory<>("Item ID"));
                list = (ObservableList<Item>) itemManagement.getItemsList();

                itemTable.setItems(list);

                itemTable.getSelectionModel().selectedItemProperty().addListener(((observable, oldValue, newValue) -> {
                    if (newValue != null) {
                    }
                }
                ));
            }
        });
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
