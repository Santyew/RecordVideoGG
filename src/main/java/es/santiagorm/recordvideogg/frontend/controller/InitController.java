package es.santiagorm.recordvideogg.frontend.controller;

import java.util.ArrayList;
import java.util.List;

import es.santiagorm.recordvideogg.PrincipalApplication;
import es.santiagorm.recordvideogg.frontend.controller.abstracta.AbstractController;
import es.santiagorm.recordvideogg.frontend.model.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author: santiago
 * @version: 1.0
 */
public class InitController extends AbstractController{

   

   /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize(){

        UsuarioServiceModel usuarioServiceModel = new UsuarioServiceModel();
        List <String> listaIdiomas = new ArrayList<>();
        listaIdiomas.add("es");
        listaIdiomas.add("en");
        listaIdiomas.add("pt");
        openIdiomas.getItems().addAll(listaIdiomas);
        cargarIdiomaActual();
        cambiarIdiomaInit();
        
        

        
    }

    /**
     * Funcion para seleccionar el idioma
     */
    @FXML
    protected void seleccionarIdiomaClick() {
        String idioma = openIdiomas.getValue().toString();
        setIdioma(idioma);
        cargarIdiomaActual();
        cambiarIdiomaInit();
        
        
    }


    @FXML
    protected void onLoginButton() {

        try {

            Stage stage = (Stage) openInicioSesion.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("PLogin");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void onNewUser() {

        try {

            Stage stage = (Stage) openNUsuario.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("registro.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Pantalla registro");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    @FXML
    protected void onSelectIdioma() {
        
        try {
            String selectedLanguage = (String) openIdiomas.getValue();
            
            System.out.println("Selecciona idioma " + selectedLanguage);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
