package org.yourcompany.yourproject;

public class Paquete {

    private String destino, estado;
    private double peso, largo, ancho, alto;
    private boolean esUrgente;

    public Paquete(String destino, double peso, boolean esUrgente, double largo, double ancho, double alto, String estado) {
        this.destino = destino;
        this.peso = peso;
        this.esUrgente = esUrgente;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.estado = estado;
    }

    ;

    public String getDestino() {
        return destino;
    }

    public double getPeso() {
        return peso;
    }

    ;

    public double getAncho() {
        return ancho;
    }

    ;

    public double getLargo() {
        return largo;
    }

    ;

    public double getAlto() {
        return alto;
    }

    ;

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    ;

    public boolean isUrgente() {
        return esUrgente;
    }
;

}
