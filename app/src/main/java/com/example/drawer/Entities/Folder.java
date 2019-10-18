package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class Folder implements Serializable {
    private int id;
    private String nom;
    private List<Chronos> listTache;
    private int temps;
    private int nombreTache;
    private String nameProjet;

    public int getNombreTache() {
        return nombreTache;
    }

    public void setNombreTache(int nombreTache) {
        this.nombreTache = nombreTache;
    }

    public String getNameProjet() {
        return nameProjet;
    }

    public void setNameProjet(String nameProjet) {
        this.nameProjet = nameProjet;
    }

    public int getTemps() {
        int count = 0;
        for (int i = 0; i < listTache.size(); i++) {
            count = count + listTache.get(i).getTemps();
        }
        return count;
    }

    public void setTemps(int temps) {
        this.temps = temps;
    }

    public List<Chronos> getListTache() {
        return listTache;
    }

    public void setListTache(List<Chronos> listTache) {
        this.listTache = listTache;
    }

    public Folder(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public Folder() {
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
}
