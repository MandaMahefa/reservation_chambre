package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class Projet implements Serializable {
    private int id;
    private  String nom;
    private String notifs;
    private User clientInProjet;
    private StatistiqueTache statistiqueTache;
    private List<Tache> listTache;
    private String etat;

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public List<Tache> getListTache() {
        return listTache;
    }

    public void setListTache(List<Tache> listTache) {
        this.listTache = listTache;
    }

    public Projet() {
    }

    public String getNotifs() {
        return notifs;
    }

    public void setNotifs(String notifs) {
        this.notifs = notifs;
    }

    public Projet(int id, User clientInProjet, String nom) {
        super();
        this.id = id;
        this.nom = nom;
        this.clientInProjet = clientInProjet;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return this.nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public User getClientInProjet() {
        return clientInProjet;
    }

    public void setClientInProjet(User clientInProjet) {
        this.clientInProjet = clientInProjet;
    }

    public StatistiqueTache getStatistiqueTache() {
        return statistiqueTache;
    }

    public void setStatistiqueTache(StatistiqueTache statistiqueTache) {
        this.statistiqueTache = statistiqueTache;
    }

    public Projet(int id, String nom, User clientInProjet, StatistiqueTache statistiqueTache) {
        this.id = id;
        this.nom = nom;
        this.clientInProjet = clientInProjet;
        this.statistiqueTache = statistiqueTache;
    }


    public Projet(List<Object> objects) {

    }
}
