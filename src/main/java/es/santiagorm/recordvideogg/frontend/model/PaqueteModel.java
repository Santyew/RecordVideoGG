package es.santiagorm.recordvideogg.frontend.model;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import es.santiagorm.recordvideogg.backend.Pedidos;
import es.santiagorm.recordvideogg.frontend.model.abstractas.Conexion;

public class PaqueteModel extends Conexion {
    /**
     * @author santiago
     * @version 1.0.0
     */

    /**
     * Constructor vacio
     */
    public PaqueteModel() {
        super();

    }

    /**
     * Funcion que obtiene una lista de pedidos de la base de datos
     * usando una sentencia sql
     * 
     * @param sql Sentencia sql a utilizar
     * @return lista de Pedidos
     */
    public ArrayList<Pedidos> obtenerListaPedidos(String sql) {
        ArrayList<Pedidos> pedidos = new ArrayList<Pedidos>();
        try {
            PreparedStatement sentencia = getconnection().prepareStatement(sql);
            ResultSet resultado = sentencia.executeQuery();

            while (resultado.next()) {
                String idStr = resultado.getString("id");
                String tipoDePaqueteStr = resultado.getString("tipoPaquete");
                String estadoStr = resultado.getString("estado");
                Pedidos pedido = new Pedidos(idStr, estadoStr,tipoDePaqueteStr);
                pedidos.add(pedido);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            cerrar();
        }
        return pedidos;
    }

    public ArrayList<Pedidos> obtenerTodosLosPedidos() {
        String sql = "Select * from paquete ";
        return obtenerListaPedidos(sql);
    }

    /**
     * Funcion que devuelve el usuario por el nombre de usuario y contraseña
     * 
     * @param id a buscar
     * @return pedido buscado
     */
    public Pedidos obtenerPedidoPorId(String id) {
        String sql = "Select * from paquete " + "where id ='" + id + "'";

        ArrayList<Pedidos> pedido = obtenerListaPedidos(sql);
        if (pedido.isEmpty()) {
            return null;
        }
        return pedido.get(0);
    }

    /**
     * Funcion que agrega un pedoido a la base de datos
     */
    public void agregarPedido(Pedidos pedido) {
        agregarPedido(pedido.getId(), pedido.getTipo(), pedido.getEstado());
    }

    /**
     * Funcion que agrega un usuario sabiendo sus propiedades a la base de datos
     * 
     * @param id a agregar
     * @param tipodepaquete a agregar
     * @param estado a agregar
     */
    public boolean agregarPedido(String id, String tipodepaquete, String estado) {
        try {
            PreparedStatement sentencia = getconnection()
                    .prepareStatement("INSERT INTO paquete (id, tipoPaquete, estado) VALUES (?,?,?)");
            sentencia.setString(1, id);
            sentencia.setString(2, tipodepaquete);
            sentencia.setString(3, estado);
            sentencia.execute();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        } finally {
            cerrar();
        }
    }

}
