package es.santiagorm.recordvideogg.frontend.controller;

import java.util.Collections;
import java.util.List;

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
public class GeneraIdController extends AbstractController {

    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize() {
        cambiarIdiomaGeneraID();
        List<Pedidos> pedidos = new PaqueteModel().obtenerTodosLosPedidos();
        if (!pedidos.isEmpty()) {
            Collections.reverse(pedidos);
            String id = pedidos.get(0).getId();
            String tipo = getTipoSeleccionado();

            IDTextField.setText(id);
        }
    }

    /***
     * Metodo que genera una id por tipo de pedido
     * 
     * @param tipo del id
     * @return idGnerado
     */
    private String generarIdPorTipo(String tipo) {
        String idGenerado = generarCodigoAleatorio();
        return idGenerado;
    }

    /**
     * Funcion que copia el ID al darle al botón Copiar y avanza a la pantalla de
     * consulta
     */
    @FXML
    protected void onCopy() {
        try {

            Stage stage = (Stage) CopyButton.getScene().getWindow();
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("check.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Insertar Id");
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

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("selectype.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("Selecciona tipo de mensajeria");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Funcion que carga un id aleatorio
     */
    public void cargarDatos() {
        IDTextField.setText(id);
    }

}
