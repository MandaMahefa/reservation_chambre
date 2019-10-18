package com.example.drawer.Entities;

import java.io.Serializable;

public class StatistiqueTache implements Serializable {
    
    private  int enCours;
    private  int resolue;
    private  int annulee;
    private  int aTraiter;
    private  int enAttente;
    private  int aTester;
    private  int enBrouillon;
    private  int aGerer;

    public StatistiqueTache(int enCours, int resolue, int annulee, int aTraiter, int enAttente, int aTester, int enBrouillon, int aGerer) {
        this.enCours = enCours;
        this.resolue = resolue;
        this.annulee = annulee;
        this.aTraiter = aTraiter;
        this.enAttente = enAttente;
        this.aTester = aTester;
        this.enBrouillon = enBrouillon;
        this.aGerer = aGerer;
    }

    public void setEnCours(int enCours) {
        this.enCours = enCours;
    }

    public void setResolue(int resolue) {
        this.resolue = resolue;
    }

    public void setAnnulee(int annulee) {
        this.annulee = annulee;
    }

    public void setaTraiter(int aTraiter) {
        this.aTraiter = aTraiter;
    }

    public void setEnAttente(int enAttente) {
        this.enAttente = enAttente;
    }

    public void setaTester(int aTester) {
        this.aTester = aTester;
    }

    public void setEnBrouillon(int enBrouillon) {
        this.enBrouillon = enBrouillon;
    }

    public void setaGerer(int aGerer) {
        this.aGerer = aGerer;
    }

    public int getEnCours() {
        return enCours;
    }

    public int getResolue() {
        return resolue;
    }

    public int getAnnulee() {
        return annulee;
    }

    public int getaTraiter() {
        return aTraiter;
    }

    public int getEnAttente() {
        return enAttente;
    }

    public int getaTester() {
        return aTester;
    }

    public int getEnBrouillon() {
        return enBrouillon;
    }

    public int getaGerer() {
        return aGerer;
    }
}
