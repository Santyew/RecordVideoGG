package es.santiagorm.recordvideogg.frontend.controller;

import es.santiagorm.recordvideogg.PrincipalApplication;
import es.santiagorm.recordvideogg.frontend.controller.abstracta.AbstractController;
import es.santiagorm.recordvideogg.frontend.model.UsuarioEntity;
import es.santiagorm.recordvideogg.frontend.model.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController extends AbstractController{

  
     /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize(){
        cambiarIdiomaLogin();
    }

    @FXML
    protected void onAceptar() {

    
    String usuarioString = TextFieldUsuario.getText();
    String contraseniaString = TextFieldContrasenia.getText();
    UsuarioEntity usuarioLogin = new UsuarioServiceModel().obtenerUsuarioPorNombre(usuarioString, contraseniaString);
        if(usuarioLogin == null){
            return;
        }
         try {

            Stage stage = (Stage) openAceptar.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("selectype.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Selecciona tipo de mensaje");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

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

