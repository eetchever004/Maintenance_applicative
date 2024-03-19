package org.example;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Comptabilite implements Observer {
    private String comptabilite;

    public Comptabilite(String pComptabilite) {
        this.comptabilite = pComptabilite;
    }
    public void traite(String pContenu) { System.out.println("comptabilité:" + pContenu.toString().toLowerCase()); }

    public void update(Observable pSujetObservation, Object pObj) {
        if (pSujetObservation instanceof Panier.DeclenchementCommande) {
            traite((String) pObj);
        }
    }
}
