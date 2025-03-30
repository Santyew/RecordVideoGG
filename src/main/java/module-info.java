module es.santiagorm.recordvideogg{
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens es.santiagorm.recordvideogg to javafx.fxml;
    exports es.santiagorm.recordvideogg;
    exports es.santiagorm.recordvideogg.frontend.controller;
    opens es.santiagorm.recordvideogg.controller to javafx.fxml;
}

