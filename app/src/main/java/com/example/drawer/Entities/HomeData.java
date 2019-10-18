package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class HomeData implements Serializable {
    private StatistiqueTache statistiqueTache;
    private List<Projet> projetList;
    private Boolean granted;
    private User user;

    public HomeData(StatistiqueTache statistiqueTache, List<Projet> projetList, Boolean granted, User user) {
        this.statistiqueTache = statistiqueTache;
        this.projetList = projetList;
        this.granted = granted;
        this.user = user;
    }

    public HomeData() {
    }

    public StatistiqueTache getStatistiqueTache() {
        return statistiqueTache;
    }

    public void setStatistiqueTache(StatistiqueTache statistiqueTache) {
        this.statistiqueTache = statistiqueTache;
    }

    public List<Projet> getProjetList() {
        return projetList;
    }

    public void setProjetList(List<Projet> projetList) {
        this.projetList = projetList;
    }

    public Boolean getGranted() {
        return granted;
    }

    public void setGranted(Boolean granted) {
        this.granted = granted;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
