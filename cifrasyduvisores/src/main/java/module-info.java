module com.mycompany.cifrasyduvisores {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.cifrasyduvisores to javafx.fxml;
    exports com.mycompany.cifrasyduvisores;
}
