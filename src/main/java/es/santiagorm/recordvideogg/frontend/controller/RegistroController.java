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

    @FXML
    protected void onOpenAccept() {
         try {

            Stage stage = (Stage) openAccept.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("app-init.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Pantalla Principal");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void onBackButton() {
         try {

            Stage stage = (Stage) BackButton.getScene().getWindow();

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
