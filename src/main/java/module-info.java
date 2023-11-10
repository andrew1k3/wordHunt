module com.example.wordhunt {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens com.example.wordhunt to javafx.fxml;
    exports com.example.wordhunt;
}