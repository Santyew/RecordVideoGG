package es.santiagorm.recordvideogg.frontend.controller.abstracta;

import es.santiagorm.recordvideogg.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class AbstractController {

    private final String pathFichero = "src/main/resources/";
    private final String ficheroStr = "idioma-";
    private static String idiomaActual = "es";

    @FXML
    public Button openInicioSesion;

    @FXML
    public Button openNUsuario;

    @FXML
    public ComboBox openIdiomas;

    @FXML
    public Text textUsuario;

    @FXML
    public Text textContra;

    @FXML
    public Button openAceptar;

    @FXML
    public TextField TextFieldUsuario;

    @FXML
    public TextField TextFieldContrasenia;

    @FXML
    public Button VolverAtrasButton;

    @FXML
    public TextField TextFieldEmail;

    @FXML
    public Text NombreUserText;

    @FXML
    public Text PasswordText;

    @FXML
    public Text EmailText;

    @FXML
    public TextField TextFieldUser;

    @FXML
    public Text TextFieldPassword;

    @FXML
    public Button openAccept;

    @FXML
    public Button BackButton;



    /**
     * Funcion para cargar el idioma
     * 
     * @param idioma a cargar
     */
    protected void cargarIdiomaActual() {
        if (idiomaActual == null || idiomaActual.isEmpty()) {
            idiomaActual = "es";
        }

        String path = pathFichero + ficheroStr + idiomaActual + ".properties";
        ConfigManager.ConfigProperties.setPath(path);
    }

     /**
     * Método para obtener el idioma actual.
     */
    public static String getIdioma() {
        return idiomaActual;
    }

    /**
     * Método para cambiar el idioma.
     */
    public static void setIdioma(String idioma) {
        idiomaActual = idioma;
    }



    /**
     * Funcion para cambiar el idioma del init
     */
    public void cambiarIdiomaInit() {
        openInicioSesion.setText(ConfigManager.ConfigProperties.getProperty("openInicioSesion"));
        openNUsuario.setText(ConfigManager.ConfigProperties.getProperty("openNUsuario"));
            
    }

     /**
     * Funcion para cambiar el idioma del login
     */
    public void cambiarIdiomaLogin() {
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContra.setText(ConfigManager.ConfigProperties.getProperty("textContra"));
        TextFieldUsuario.setText(ConfigManager.ConfigProperties.getProperty("TextFieldUsuario"));  
        TextFieldContrasenia.setText(ConfigManager.ConfigProperties.getProperty("TextFieldContrasenia"));    
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
    }


      /**
     * Funcion para cambiar el idioma del registro
     */
    public void cambiarIdiomaRegistro() {
        NombreUserText.setText(ConfigManager.ConfigProperties.getProperty("NombreUserText"));
        PasswordText.setText(ConfigManager.ConfigProperties.getProperty("PasswordText"));
        EmailText.setText(ConfigManager.ConfigProperties.getProperty("TextFieldUsuario"));  
        TextFieldUser.setText(ConfigManager.ConfigProperties.getProperty("TextFieldUser"));    
        TextFieldPassword.setText(ConfigManager.ConfigProperties.getProperty("TextFieldPassword"));
        TextFieldEmail.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
        openAccept.setText(ConfigManager.ConfigProperties.getProperty("openAccept"));
        BackButton.setText(ConfigManager.ConfigProperties.getProperty("BackButton"));

    }
    
}
