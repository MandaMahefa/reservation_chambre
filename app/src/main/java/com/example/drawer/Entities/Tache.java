package com.example.drawer.Entities;

import android.text.Html;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Tache implements Serializable {

    private int id;
    private String sujet;
    private EtatTache etatTache;
    private Degree degree;
    private Date date_creation;
    private String tempsPasse;
    private String description;
    private List<User> userList;
    private User auteur;
    private Projet projet;
    private String temps;

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public Projet getProjet() {
        return this.projet;
    }

    public String getTempsPasse() {
        return this.tempsPasse;
    }

    public void setTempsPasse(String tempsPasse) {
        this.tempsPasse = tempsPasse;
    }
    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public Tache(int id, String sujet, EtatTache etatTache, Date date_creation, List<User> userList) {
        this.id = id;
        this.sujet = sujet;
        this.etatTache = etatTache;
        this.date_creation = date_creation;
        this.userList = userList;
    }
    public Degree getDegree() {
        return this.degree;
    }


    public void setDegree(Degree degree) {
        this.degree = degree;
    }

    public User getAuteur() {
        return auteur;
    }

    public Tache() {
    }

    public void setAuteur(User auteur) {
        this.auteur = auteur;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = Html.fromHtml(description).toString();
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public Tache(int id, String sujet, EtatTache etatTache, Date date_creation) {
        this.id = id;
        this.sujet = sujet;
        this.etatTache = etatTache;
        this.date_creation = date_creation;
    }

    public Date getDate_creation() {
        return this.date_creation;
    }

    public void setDate_creation(Date date_creation) {
        this.date_creation = date_creation;
    }

    public Tache(int id, String sujet, EtatTache etatTache) {
        this.id = id;
        this.sujet = sujet;
        this.etatTache = etatTache;
    }

    public Tache(int id, String sujet) {
        this.id = id;
        this.sujet = sujet;
    }

    public EtatTache getEtatTache() {
        return this.etatTache;
    }

    public void setEtatTache(EtatTache etatTache) {
        this.etatTache = etatTache;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSujet() {
        return this.sujet;
    }

    public void setSujet(String sujet) {
        this.sujet = sujet;
    }
}
