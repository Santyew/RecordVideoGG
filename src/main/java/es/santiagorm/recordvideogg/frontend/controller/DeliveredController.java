package es.santiagorm.recordvideogg.frontend.controller;

import es.santiagorm.recordvideogg.PrincipalApplication;
import es.santiagorm.recordvideogg.frontend.controller.abstracta.AbstractController;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author: santiago
 * @version: 1.0
 */
public class DeliveredController extends AbstractController {

    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize() {
        cambiarIdiomaConfirmado();
    }

    /**
     * Metodo para regresar a la pantalla anterior
     */
    @FXML
    protected void onVolverAtras() {
        try {

            Stage stage = (Stage) VolverAtrasButton.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("check.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Insertar Id");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
