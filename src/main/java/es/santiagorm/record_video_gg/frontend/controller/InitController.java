package es.santiagorm.recordvideogg.frontend.controller;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;


/**
 *@author: santiago
 *@version: 1.0
 */
public class InitController {


    private final String usuario = "admin";
    private final String password = "admin";

    @FXML Button openInicioSesion;

    @FXML Button openNUsuario;


    @FXML 
    protected void onLoginButton(){

        try {

            Stage stage = (Stage) openInicioSesion.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 820, 640);
        stage.setTitle("PInicio");
        stage.setScene(scene);
        stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }

    @FXML
    protected void onNewUser(){

        try {

            Stage stage = (Stage) openNUsuario.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("pInicio.fxml"));
        Scene scene = new Scene(fxmlLoader.load(), 820, 640);
        stage.setTitle("PInicio");
        stage.setScene(scene);
        stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
        
    }


}
