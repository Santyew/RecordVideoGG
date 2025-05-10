package es.santiagorm.recordvideogg.frontend.controller;

import java.util.ArrayList;
import java.util.List;

import es.santiagorm.recordvideogg.PrincipalApplication;
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
public class SeleccionController extends AbstractController {

    /**
     * Funcion que se inicializa nada mas arrancar la app
     */
    @FXML
    void initialize() {
        cambiarIdiomaSeleccion();
        List<String> listaDatos = new ArrayList<>();
        listaDatos.add("Carta");
        listaDatos.add("Postal");
        listaDatos.add("Paquete");
        SelectMail.getItems().addAll(listaDatos);
    }

    /**
     * Funcion que cambia de escenario al darle al botón Aceptar
     */
    @FXML
    protected void onAceptar() {
        try {
            String tipo = SelectMail.getValue();
            if (tipo == null || tipo.isEmpty()) {
                return;
            }

            setTipoSeleccionado(tipo);
            setIdGenerado(generarCodigoAleatorio());
            String enviando = generarEnvio();

            new PaqueteModel().agregarPedido(id, tipo, enviando);
            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("generate.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);

            Stage stage = (Stage) openAceptar.getScene().getWindow();
            stage.setTitle("Pantalla genera ID");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * Funcion que cambia de escenario al darle al botón Volver Atrás
     */
    @FXML
    protected void onVolverAtras() {
        try {

            Stage stage = (Stage) openAceptar.getScene().getWindow();

            FXMLLoader fxmlLoader = new FXMLLoader(PrincipalApplication.class.getResource("login.fxml"));
            Scene scene = new Scene(fxmlLoader.load(), 417, 557);
            stage.setTitle("PLogin");
            stage.setScene(scene);
            stage.show();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    /**
     * Funcion que te genera uan id al seleccionar el tipo de mensajeria
     */
    @FXML
    protected void onSelectMail() {
        String opcion = SelectMail.getValue().toString();
        generarId(opcion);
    }

}
