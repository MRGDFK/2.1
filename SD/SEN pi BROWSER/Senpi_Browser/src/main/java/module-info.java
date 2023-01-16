module com.example.senpi_browser {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.senpi_browser to javafx.fxml;
    exports com.example.senpi_browser;
}