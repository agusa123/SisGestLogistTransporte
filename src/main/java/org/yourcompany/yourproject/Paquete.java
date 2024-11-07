package org.yourcompany.yourproject;

public class Paquete {

    private int id;
    private String destino, estado;
    private double peso, largo, ancho, alto;
    private boolean esUrgente;

    public Paquete(int id, String destino, double peso, boolean esUrgente, double largo, double ancho, double alto, String estado) {
        this.id = id;
        this.destino = destino;
        this.peso = peso;
        this.esUrgente = esUrgente;
        this.largo = largo;
        this.ancho = ancho;
        this.alto = alto;
        this.estado = estado;
    }

    ;

    public int getId() {
        return id;
    }

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
