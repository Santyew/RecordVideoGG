package es.santiagorm.recordvideogg.frontend.controller;

import es.santiagorm.recordvideogg.PrincipalApplication;
import es.santiagorm.recordvideogg.backend.Pedidos;
import es.santiagorm.recordvideogg.frontend.controller.abstracta.AbstractController;
import es.santiagorm.recordvideogg.frontend.model.PaqueteModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

/**
 * @author: santiago
 * @version: 1.0
 */
public class CheckController extends AbstractController {

    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize() {
        cambiarIdiomaComprueba();
    }

    /**
     * Funcion que al darle al boton comprueba el id y genera un estado al azar
     */
    @FXML
    protected void onComprobar() {
        if (TextFieldPedido.getText() == null || TextFieldPedido.getText().isBlank()) {
            return;
        }
        Pedidos pedido = new PaqueteModel().obtenerPedidoPorId(TextFieldPedido.getText());
        if (pedido == null) {
            return;
        }
        switch (pedido.getEstado()) {
            case "fallido":
                paginaEnEspera();
                return;
            case "enviado":
                paginaEnviada();
                return;
            case "espera":
                paginaPorProcesar();
                return;
            default:
                break;
        }
    }

    /**
     * Metodo para cambiar a la pagina de pedido por ser revisado
     */
    protected void paginaEnEspera() {

        try {

            Stage stage = (Stage) openComprobar.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("wait.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Pedido por procesar");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo para cambiar la pagina de un pedido por pedido por enviar
     */
    protected void paginaPorProcesar() {

        try {

            Stage stage = (Stage) openComprobar.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("distribution.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Pedido por enviar");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo para cambiar la pagina de un pedido por pedido enviado
     */
    protected void paginaEnviada() {

        try {

            Stage stage = (Stage) openComprobar.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("delivered.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Pedido entregado");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Metodo para regresar a la pantalla anterior
     */
    @FXML
    protected void onVolverAtras() {

        try {

            Stage stage = (Stage) VolverAtrasButton.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("selectype.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Seleccione tipo de mensajeria");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}
