module com.example._1404 {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires java.sql;

    opens com.example._1404 to javafx.fxml;
    exports com.example._1404;
    exports com.example._1404.Model;
    opens com.example._1404.Model to javafx.fxml;
    exports com.example._1404.Controller;
    opens com.example._1404.Controller to javafx.fxml;
}