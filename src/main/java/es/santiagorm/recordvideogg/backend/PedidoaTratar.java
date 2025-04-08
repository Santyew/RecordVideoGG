package es.santiagorm.recordvideogg.backend;

public class PedidoaTratar {
    public static void main(String[] args) {
        
        Producto carta = new Producto("Carta", "Empresa de Mensajería XYZ");
        Producto paquete = new Producto("Paquete", "Logística Equipo de rescate Azul");
        Producto postal = new Producto("Postal", "Postales Aperture Science");

        
        carta.mostrarInformacion();
        System.out.println();
        paquete.mostrarInformacion();
        System.out.println();
        postal.mostrarInformacion();
    }
}
