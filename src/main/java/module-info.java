module org.domain {
    requires javafx.controls;
    requires javafx.fxml;

    opens org.domain to javafx.fxml;
    exports org.domain;
}