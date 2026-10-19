module com.mycompany.liebreytortuga {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.mycompany.liebreytortuga to javafx.fxml;
    exports com.mycompany.liebreytortuga;
}
