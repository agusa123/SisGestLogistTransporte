package org.yourcompany.yourproject;

public class TransAereo implements Transporte {

    private Paquete paquete;

    @Override
    public void enviarPaquete(Paquete paquete) {
        System.out.println("Enviando paquete aéreo a " + paquete.getDestino());
    }

    @Override
    public void mostrarInfoPaquete(Paquete paquete) {
        System.out.println("Información del paquete:");
        System.out.println("Destino: " + paquete.getDestino());
        System.out.println("Peso: " + paquete.getPeso() + " kg");
        System.out.println("Dimensiones: " + paquete.getLargo() + " x " + paquete.getAncho() + " x " + paquete.getAlto() + " cm");
        System.out.println("Estado: " + paquete.getEstado());
        System.out.println("Urgente: " + (paquete.isUrgente() ? "Sí" : "No"));
    }

    @Override
    public void updateEstadoPaquete(Paquete paquete) {
        paquete.setEstado("En tránsito");
        System.out.println("Estado del paquete actualizado a: " + paquete.getEstado());
    }

    public TransAereo(Paquete paqueteParams) {
        this.paquete = paqueteParams;
    }

}
