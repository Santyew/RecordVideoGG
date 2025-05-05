package es.santiagorm.recordvideogg.backend;

import java.util.List;
import java.util.Objects;

/**
 * @author santiago
 * @version 1.0
 */
public class Pedidos {

    private int id;
    private String nombreCliente;
    private List<String> productos;
    private String estado;

    /**
     * Genera el constructor vacio
     */
    public Pedidos() {
    }

    /**
     * Se crea el constructor con las propiedades a declarar
     * 
     * @param id
     * @param nombreCliente
     * @param productos
     * @param estado
     */
    public Pedidos(int id, String nombreCliente, List<String> productos, String estado) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.productos = productos;
        this.estado = estado;
    }

    // Getters y Setters
    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public List<String> getProductos() {
        return this.productos;
    }

    public void setProductos(List<String> productos) {
        this.productos = productos;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pedidos id(int id) {
        setId(id);
        return this;
    }

    public Pedidos nombreCliente(String nombreCliente) {
        setNombreCliente(nombreCliente);
        return this;
    }

    public Pedidos productos(List<String> productos) {
        setProductos(productos);
        return this;
    }

    public Pedidos estado(String estado) {
        setEstado(estado);
        return this;
    }

    @Override
    public boolean equals(Object o) {
        if (o == this)
            return true;
        if (!(o instanceof Pedidos)) {
            return false;
        }
        Pedidos pedidos = (Pedidos) o;
        return id == pedidos.id && Objects.equals(nombreCliente, pedidos.nombreCliente)
                && Objects.equals(productos, pedidos.productos) && Objects.equals(estado, pedidos.estado);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, nombreCliente, productos, estado);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombreCliente='" + getNombreCliente() + "'" +
                ", productos='" + getProductos() + "'" +
                ", estado='" + getEstado() + "'" +
                "}";
    }
}
