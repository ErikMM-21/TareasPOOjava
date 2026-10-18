module com.mycompany.tablas {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.tablas to javafx.fxml;
    exports com.mycompany.tablas;
}
