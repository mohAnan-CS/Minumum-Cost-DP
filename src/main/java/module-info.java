module com.example.minimumcost {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.minimumcost to javafx.fxml;
    exports com.example.minimumcost;
}