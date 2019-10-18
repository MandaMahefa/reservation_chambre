package com.example.drawer.Entities;

import java.io.Serializable;

public class UITacheDashboard implements Serializable {
    private String client;
    private String projet;
    private String tache;

    public UITacheDashboard(String client, String projet, String tache) {
        this.client = client;
        this.projet = projet;
        this.tache = tache;
    }

    public UITacheDashboard() {
    }

    public String getClient() {
        return client;
    }

    public void setClient(String client) {
        this.client = client;
    }

    public String getProjet() {
        return projet;
    }

    public void setProjet(String projet) {
        this.projet = projet;
    }

    public String getTache() {
        return tache;
    }

    public void setTache(String tache) {
        this.tache = tache;
    }
}
