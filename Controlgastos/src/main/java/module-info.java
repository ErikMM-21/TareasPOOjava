module com.mycompany.controlgastos {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.controlgastos to javafx.fxml;
    exports com.mycompany.controlgastos;
}
