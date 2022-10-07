module com.example.todo {
    requires javafx.controls;
    requires javafx.fxml;
    requires spring.web;
    requires spring.boot;
    requires spring.context;
    requires org.slf4j;


    opens com.example.todo to javafx.fxml;
    exports com.example.todo;
    exports com.example.todo.controllerfe;
    opens com.example.todo.controllerfe to javafx.fxml;
}