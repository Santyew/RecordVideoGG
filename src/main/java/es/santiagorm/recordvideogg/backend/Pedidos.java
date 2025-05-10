package es.santiagorm.recordvideogg.backend;

import java.util.Objects;

/**
 * @author santiago
 * @version 1.0
 */
public class Pedidos {

    private String id;
    private String nombreCliente;
    private String estado;
    private String tipo;

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
    public Pedidos(String id, String nombreCliente, String estado, String tipo) {
        this.id = id;
        this.nombreCliente = nombreCliente;
        this.estado = estado;
        this.tipo = tipo;
    }

    /**
     * Se crea el constructor con las propiedades necesarias
     * @param id
     * @param estado
     * @param tipo
     */
    public Pedidos(String id, String estado, String tipo) {
        this.id = id;
        this.estado = estado;
        this.tipo = tipo;
    }

    // Getters y Setters
    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Pedidos tipo(String tipo) {
        setTipo(tipo);
        return this;
    }

    public String getId() {
        return this.id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombreCliente() {
        return this.nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public Pedidos id(String id) {
        setId(id);
        return this;
    }

    public Pedidos nombreCliente(String nombreCliente) {
        setNombreCliente(nombreCliente);
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
        return id == pedidos.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "{" +
                " id='" + getId() + "'" +
                ", nombreCliente='" + getNombreCliente() + "'" +
                ", estado='" + getEstado() + "'" +
                "}";
    }
}
