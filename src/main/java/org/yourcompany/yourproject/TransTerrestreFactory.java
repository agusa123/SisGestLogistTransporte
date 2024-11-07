package org.yourcompany.yourproject;

public class TransTerrestreFactory {

    public static TransTerrestre createTransAereoFactory(Paquete paquete) {
        return new TransTerrestre(paquete);
    }
;
}
