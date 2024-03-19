package org.example;

import java.util.ArrayList;
import java.util.Observer;

public class GestionDeStock implements Observer {
    private String gestionStock;

    public GestionDeStock(String pGestionStock) {
        this.gestionStock = pGestionStock;
    }
    public void traite(String contenu) {

        System.out.println("G.DES.STOCKS:" + contenu.toString().toUpperCase());
    }

    public void update()
}
