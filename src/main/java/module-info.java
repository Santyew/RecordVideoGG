module es.santiagorm.recordvideogg {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.controlsfx.controls;
    requires javafx.graphics;
    requires java.sql;

    opens es.santiagorm.recordvideogg to javafx.fxml;
    opens es.santiagorm.recordvideogg.frontend.controller to javafx.fxml;
    opens es.santiagorm.recordvideogg.frontend.model to javafx.fxml;

    exports es.santiagorm.recordvideogg.frontend.model;
    exports es.santiagorm.recordvideogg.frontend.model.abstractas;
    exports es.santiagorm.recordvideogg.frontend.controller;
    exports es.santiagorm.recordvideogg.frontend.controller.abstracta;
    exports es.santiagorm.recordvideogg;

}
