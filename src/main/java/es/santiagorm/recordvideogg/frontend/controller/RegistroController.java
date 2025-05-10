package es.santiagorm.recordvideogg.frontend.controller;

import java.util.List;
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

/**
 * @author: santiago
 * @version: 1.0
 */
public class RegistroController extends AbstractController {

    @FXML
    Text textOk;

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
        Pattern pattern = Pattern.compile("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,}$");

        String usuarioString = TextFieldUsuario.getText();
        String contraseniaString = TextFieldContrasenia.getText();
        String emailString = TextFieldEmail.getText();
        Matcher matcher = pattern.matcher(emailString);
        if (!matcher.matches()) {
            textOk.setText(ConfigManager.ConfigProperties.getProperty("textOkerror1"));
            return;
        }
        UsuarioEntity usuarioNuevo = new UsuarioEntity(contraseniaString, usuarioString, emailString);
        List usuarios = new UsuarioServiceModel().obtenerTodosLosUsuarios();
        if (usuarios.contains(usuarioNuevo)) {
            textOk.setText(ConfigManager.ConfigProperties.getProperty("textOkerror3"));
            return;
        }

        boolean comprobar = new UsuarioServiceModel().agregarUsuario(contraseniaString, usuarioString, emailString);
        if (!comprobar) {
            textOk.setText(ConfigManager.ConfigProperties.getProperty("textOkerror4"));
            return;
        }
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
