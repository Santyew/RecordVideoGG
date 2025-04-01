module es.santiagorm.recordvideogg{
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires javafx.graphics;

    opens es.santiagorm.recordvideogg to javafx.fxml;
    exports es.santiagorm.recordvideogg;
    opens es.santiagorm.recordvideogg.frontend.controller to javafx.fxml;
    exports es.santiagorm.recordvideogg.frontend.controller;
    opens es.santiagorm.recordvideogg.servicio to javafx.fxml;
    exports es.santiagorm.recordvideogg.servicio;
    opens es.santiagorm.recordvideogg.frontend.model to javafx.fxml;    
    exports es.santiagorm.recordvideogg.frontend.model;
 
}

