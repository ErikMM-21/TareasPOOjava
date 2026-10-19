module com.mycompany.conteoclick {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.conteoclick to javafx.fxml;
    exports com.mycompany.conteoclick;
}
