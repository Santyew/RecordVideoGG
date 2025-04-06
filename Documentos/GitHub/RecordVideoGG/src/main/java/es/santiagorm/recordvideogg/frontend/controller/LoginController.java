package es.santiagorm.recordvideogg.frontend.controller;

import es.santiagorm.recordvideogg.PrincipalApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

/**
 * @author: santiago
 * @version: 1.0
 */
public class LoginController {

    private final String usuario = "admin";
    private final String password = "admin";

    @FXML
    Button openAceptar;

    @FXML
    TextField TextFieldUsuario;

    @FXML
    TextField TextFieldContrasenia;

    @FXML
    protected void onAceptarButton() {
        try {
            String inputUsuario = TextFieldUsuario.getText();
            String inputPassword = TextFieldContrasenia.getText();

            // Simple authentication check
            if (inputUsuario.equals(usuario) && inputPassword.equals(password)) {
                // Login successful, navigate to main screen
                Stage stage = (Stage) openAceptar.getScene().getWindow();

                FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("pinicio.fxml"));
                Scene scene = new Scene(fxmlLoader.load(), 820, 640);
                stage.setTitle("PInicio");
                stage.setScene(scene);
                stage.show();
            } else {
                // Authentication failed, could show error message here
                System.out.println("Login failed: Invalid credentials");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

