package com.example.drawer.Entities;

import java.io.Serializable;

public class Reservation implements Serializable {
    private String nom;
    private String type;
    private String nom_cient;
    private String debut_reservation;
    private String fin_reservation;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getNom_cient() {
        return nom_cient;
    }

    public void setNom_cient(String nom_cient) {
        this.nom_cient = nom_cient;
    }

    public String getDebut_reservation() {
        return debut_reservation;
    }

    public void setDebut_reservation(String debut_reservation) {
        this.debut_reservation = debut_reservation;
    }

    public String getFin_reservation() {
        return fin_reservation;
    }

    public void setFin_reservation(String fin_reservation) {
        this.fin_reservation = fin_reservation;
    }
}
