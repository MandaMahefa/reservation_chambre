package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.Date;

public class Chronos implements Serializable {
    private int id_chrono;
    private User user;
    private Date date;
    private int temps;
    private Folder folder;
    private Tache tache;
    private Projet projet;

    public Projet getProjet() {
        return projet;
    }
    public void setProjet(Projet projet) {
        this.projet = projet;
    }
    public int getId_chrono() {
        return id_chrono;
    }
    public void setId_chrono(int id_chrono) {
        this.id_chrono = id_chrono;
    }
    public User getUser() {
        return user;
    }
    public void setUser(User user) {
        this.user = user;
    }
    public Date getDate() {
        return date;
    }
    public void setDate(Date date) {
        this.date = date;
    }
    public int getTemps() {
        return temps;
    }
    public void setTemps(int temps) {
        this.temps = temps;
    }
    public Folder getFolder() {
        return folder;
    }
    public void setFolder(Folder folder) {
        this.folder = folder;
    }
    public Tache getTache() {
        return tache;
    }
    public void setTache(Tache tache) {
        this.tache = tache;
    }
    public Chronos(int id_chrono, User user, Date date, int temps, Folder folder, Tache tache) {
        super();
        this.id_chrono = id_chrono;
        this.user = user;
        this.date = date;
        this.temps = temps;
        this.folder = folder;
        this.tache = tache;
    }
    public Chronos() {
        super();
        // TODO Auto-generated constructor stub
    }



}