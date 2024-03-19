package org.example;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Panier {
    //private GestionDeStock stock;
    //private Comptabilite compta;
    private String contenu;
    private DeclenchementCommande sujetObservation = new Panier.DeclenchementCommande();

    public Panier (GestionDeStock pStock, Comptabilite pCompta) {
        //this.stock = pStock;
        //this.compta = pCompta;

        this.getSujetObservation().addObserver(pCompta);
        this.getSujetObservation().addObserver(pStock);

        this.contenu = new String ("Contenu du panier");
    }

    public String getContenu() {
        return this.contenu;
    };

    // sujet d'obervation -> créer classe et la faire hériter de la classe observable
    public void declencherCommande() {
        this.sujetObservation.notifyObservers(getContenu());
        /*
        this.stock.traite(this.contenu);
        this.compta.traite(this.contenu);
         */
    }

    public Panier getSujetObservation() {
        return this.sujetObservation;
    }

    public class DeclenchementCommande extends Observable {
        public void notifyObservers() {
            super.setChanged();
            super.notifyObservers();
        }

        public void notifyObservers(Object arg) {
            super.setChanged();
            super.notifyObservers(arg);
        }

        public boolean haschanged() { return super.hasChanged(); }
    }

}
