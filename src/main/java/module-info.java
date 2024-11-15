module com.example.docdirect104.docdirect104 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;

    opens com.example.docdirect104.docdirect104 to javafx.fxml;
    exports com.example.docdirect104.docdirect104;
}