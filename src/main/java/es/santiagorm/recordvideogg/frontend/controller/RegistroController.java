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
public class RegistroController extends AbstractController {

    /**
     * Funcion que carga el idioma en la pantalla registro
     */
    @FXML
    void initialize() {
        cambiarIdiomaRegistro();
    }

    /**
     * Funcion que cambia de escenario al aceptar boton
     */
    @FXML
    protected void onAceptar() {
        try {

            Stage stage = (Stage) openAceptar.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("app-init.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Pantalla Principal");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Funcion que cambia de escenario al volver Atrás boton
     */
    @FXML
    protected void onVolverAtras() {
        try {

            Stage stage = (Stage) VolverAtrasButton.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("app-init.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Pantalla Principal");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
