package org.yourcompany.yourproject;

public class TransTerrestreFactory {

    public static TransTerrestre createTransTerrestreFactory(Paquete paquete) {
        return new TransTerrestre(paquete);
    }
;
}
