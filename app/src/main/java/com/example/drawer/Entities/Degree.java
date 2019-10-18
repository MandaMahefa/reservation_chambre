package com.example.drawer.Entities;

import java.io.Serializable;

public class Degree implements Serializable {
    private int id;
    private String nomm;
    private String couleur;
    public Degree(int id, String nomm, String couleur) {
        super();
        this.id = id;
        this.nomm = nomm;
        this.couleur = couleur;
    }
    public Degree() {

    }
    public int getId() {
        return this.id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNomm() {
        return this.nomm;
    }
    public void setNomm(String nomm) {
        this.nomm = nomm;
    }
    public String getCouleur() {
        return this.couleur;
    }
    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

}
