package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class Contact implements Serializable {
    private int id;
    private User user;
    private User client;
    private List<User> listeClient;
    private List<Projet> listeProjet;

    public List<User> getListeClient() {
        return listeClient;
    }

    public void setListeClient(List<User> listeClient) {
        this.listeClient = listeClient;
    }

    public List<Projet> getListeProjet() {
        return listeProjet;
    }

    public void setListeProjet(List<Projet> listeProjet) {
        this.listeProjet = listeProjet;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User getUser() {
        return this.user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public User getClient() {
        return this.client;
    }

    public void setClient(User client) {
        this.client = client;
    }
}
