package es.santiagorm.recordvideogg.frontend.controller.abstracta;

import java.util.Random;

import es.santiagorm.recordvideogg.config.ConfigManager;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

/**
 * @author: santiago
 * @version: 1.0
 */
public class AbstractController {

    private final String pathFichero = "src/main/resources/";
    private final String ficheroStr = "idioma-";
    private static String idiomaActual = "es";

    public String id = "";

    /**
     * Funcion para asignar una id
     * 
     * @param data el id asignado
     */
    public void generarId(String data) {
        id = generarCodigoAleatorio();
    }

    /**
     * Funcion para generar una id alfanumerica
     * 
     * @return una id aleatoria
     */
    public String generarCodigoAleatorio() {
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789";
        Random random = new Random();
        StringBuilder codigo = new StringBuilder(4);

        for (int i = 0; i < 4; i++) {
            codigo.append(caracteres.charAt(random.nextInt(caracteres.length())));
        }

        return codigo.toString();
    }

    /**
     * Funcion para generar un estado de envio
     * 
     * @return diferentes estados de envio
     */
    public String generarEnvio() {
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                return "fallido";
            case 1:
                return "enviado";
            case 2:
                return "espera";
            default:
                throw new AssertionError();
        }

    }

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
    public Button openComprobar;

    @FXML
    public Text EmailText;

    @FXML
    public TextField TextFieldUser;

    @FXML
    public Text TextFieldPassword;

    @FXML
    public TextField TextFieldPedido;

    @FXML
    public Text openConsulta;

    @FXML
    public Text TextProcesa;

    @FXML
    public Text TextPedidoC;

    @FXML
    public Text TextPedidoE;

    @FXML
    public ComboBox<String> SelectMail;

    @FXML
    public Button CopyButton;

    @FXML
    public Text textID;

    @FXML
    public TextField IDTextField;

    private static String tipoSeleccionado;
    private static String idGenerado;

    public static String getTipoSeleccionado() {
        return tipoSeleccionado;
    }

    public static void setTipoSeleccionado(String tipo) {
        tipoSeleccionado = tipo;
    }

    public static String getIdGenerado() {
        return idGenerado;
    }

    public static void setIdGenerado(String id) {
        idGenerado = id;
    }

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
        TextFieldUsuario.setPromptText(ConfigManager.ConfigProperties.getProperty("TextFieldUsuario"));
        TextFieldContrasenia.setPromptText(ConfigManager.ConfigProperties.getProperty("TextFieldContrasenia"));
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
        openAceptar.setText(ConfigManager.ConfigProperties.getProperty("openAceptar"));

    }

    /**
     * Funcion para cambiar el idioma del registro
     */
    public void cambiarIdiomaRegistro() {
        textUsuario.setText(ConfigManager.ConfigProperties.getProperty("textUsuario"));
        textContra.setText(ConfigManager.ConfigProperties.getProperty("textContra"));
        EmailText.setText(ConfigManager.ConfigProperties.getProperty("EmailText"));
        TextFieldUsuario.setPromptText(ConfigManager.ConfigProperties.getProperty("TextFieldUsuario"));
        TextFieldContrasenia.setPromptText(ConfigManager.ConfigProperties.getProperty("TextFieldContrasenia"));
        TextFieldEmail.setPromptText(ConfigManager.ConfigProperties.getProperty("TextFieldEmail"));
        openAceptar.setText(ConfigManager.ConfigProperties.getProperty("openAceptar"));
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));

    }

    /**
     * Funcion para cambiar el idioma de la seleccion de mensajeria
     */
    public void cambiarIdiomaSeleccion() {
        SelectMail.setPromptText(ConfigManager.ConfigProperties.getProperty("SelectMail"));
        openAceptar.setText(ConfigManager.ConfigProperties.getProperty("openAceptar"));
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));

    }

    /**
     * Funcion para cambiar el idioma del generar ID
     */
    public void cambiarIdiomaGeneraID() {
        textID.setText(ConfigManager.ConfigProperties.getProperty("textID"));
        CopyButton.setText(ConfigManager.ConfigProperties.getProperty("CopyButton"));
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
        IDTextField.setText(ConfigManager.ConfigProperties.getProperty("IDTextField"));

    }

    /**
     * Funcion para cambiar el idioma de comprobar pedido
     */
    public void cambiarIdiomaComprueba() {
        openConsulta.setText(ConfigManager.ConfigProperties.getProperty("openConsulta"));
        TextFieldPedido.setText(ConfigManager.ConfigProperties.getProperty("TextFieldPedido"));
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
        openComprobar.setText(ConfigManager.ConfigProperties.getProperty("openComprobar"));
    }

    /**
     * Funcion para cambiar el idioma de pantalla de espera
     */
    public void cambiarIdiomaEspera() {
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
        TextProcesa.setText(ConfigManager.ConfigProperties.getProperty("TextProcesa"));
    }

    /**
     * Funcion para cambiar el idioma de pantalla de procesando
     */
    public void cambiarIdiomaProceso() {
        TextPedidoC.setText(ConfigManager.ConfigProperties.getProperty("TextPedidoC"));
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
    }

    /**
     * Funcion para cambiar el idioma de pantalla de confirmado
     */
    public void cambiarIdiomaConfirmado() {
        TextPedidoE.setText(ConfigManager.ConfigProperties.getProperty("TextPedidoE"));
        VolverAtrasButton.setText(ConfigManager.ConfigProperties.getProperty("VolverAtrasButton"));
    }
}
