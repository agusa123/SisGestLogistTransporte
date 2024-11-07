package org.yourcompany.yourproject;

public class TransAereoFactory {

    public static TransAereo createTransAereoFactory(Paquete paquete) {
        return new TransAereo(paquete);
    }
};
