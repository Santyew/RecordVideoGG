package es.santiagorm.recordvideogg.frontend.controller;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

import es.santiagorm.recordvideogg.PrincipalApplication;
import es.santiagorm.recordvideogg.config.ConfigManager;
import es.santiagorm.recordvideogg.frontend.controller.abstracta.AbstractController;
import es.santiagorm.recordvideogg.frontend.model.UsuarioEntity;
import es.santiagorm.recordvideogg.frontend.model.UsuarioServiceModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class LoginController extends AbstractController {

    @FXML
    Text textOK;

    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize() {
        cambiarIdiomaLogin();
    }

    @FXML
    protected void onAceptar() {
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        String usuarioString = TextFieldUsuario.getText();
        String contraseniaString = TextFieldContrasenia.getText();
        Matcher matcher = pattern.matcher(usuarioString);
        if (matcher.matches()) {
            UsuarioEntity usuarioLogin = new UsuarioServiceModel().obtenerUsuarioPorEmail(usuarioString,
                    contraseniaString);
            if (usuarioLogin == null) {
                textOK.setText(ConfigManager.ConfigProperties.getProperty("textOkerror1"));
                return;
            }
        } else {
            UsuarioEntity usuarioLogin = new UsuarioServiceModel().obtenerUsuarioPorNombre(usuarioString,
                    contraseniaString);

            if (usuarioLogin == null) {
                textOK.setText(ConfigManager.ConfigProperties.getProperty("textOkerror2"));
                return;
            }
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
