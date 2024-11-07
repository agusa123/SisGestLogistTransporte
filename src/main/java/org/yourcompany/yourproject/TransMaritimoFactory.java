package org.yourcompany.yourproject;

public class TransMaritimoFactory {

    public static TransMaritimo createTransMaritimoFactory(Paquete paquete) {

        return new TransMaritimo(paquete);

    }
;
}
