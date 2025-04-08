package es.santiagorm.recordvideogg.backend;

/**
 * @author santiago
 * @version 1.0
 */
public class Producto {
    private String tipo;
    private String empresa;

    /**
     * Metodo para elegir el tipo de mensajeria 
     * @param tipo
     * @param empresa
     */
    public Producto(String tipo, String empresa) {
        if (!tipo.equals("Carta") && !tipo.equals("Paquete") && !tipo.equals("Postal")) {
            throw new IllegalArgumentException("Tipo de producto no válido. Debe ser 'Carta', 'Paquete' o 'Postal'.");
        }
        this.tipo = tipo;
        this.empresa = empresa;
    }
    /**
     * Metodo para mostrar la informacion de tipo y empresa
     */
    public void mostrarInformacion() {
        System.out.println("Tipo: " + tipo);
        System.out.println("Empresa: " + empresa);
    }

    //Getters
    public String getTipo() {
        return tipo;
    }

    public String getEmpresa() {
        return empresa;
    }
}
