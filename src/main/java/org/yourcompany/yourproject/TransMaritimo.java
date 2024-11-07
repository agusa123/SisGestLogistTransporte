package org.yourcompany.yourproject;

public class TransMaritimo implements Transporte {

    private Paquete paquete;

    @Override
    public void enviarPaquete() {
        System.out.println("Enviando paquete por transporte maritimo con destino " + paquete.getDestino());
    }

    @Override
    public void mostrarInfoPaquete() {
        System.out.println("Información del paquete:");
        System.out.println("Destino: " + paquete.getDestino());
        System.out.println("Peso: " + paquete.getPeso() + " kg");
        System.out.println("Dimensiones: " + paquete.getLargo() + " x " + paquete.getAncho() + " x " + paquete.getAlto() + " cm");
        System.out.println("Estado: " + paquete.getEstado());
        System.out.println("Urgente: " + (paquete.isUrgente() ? "Sí" : "No"));
    }

    @Override
    public void updateEstadoPaquete(String estado) {
        paquete.setEstado(estado);
        System.out.println("Estado del paquete actualizado a: " + paquete.getEstado());
    }

    public TransMaritimo(Paquete paqueteParams) {
        this.paquete = paqueteParams;
    }
}
