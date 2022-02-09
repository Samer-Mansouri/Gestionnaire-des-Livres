module mvc {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;
    requires gembox.spreadsheet;


    opens mvc to javafx.fxml;
    opens mvc.Controllers to javafx.fxml;
    opens mvc.Models to javafx.base;
    exports mvc;
}