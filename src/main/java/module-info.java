module com.example.ergasia6 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.ergasia6 to javafx.fxml;
    exports com.example.ergasia6;
}