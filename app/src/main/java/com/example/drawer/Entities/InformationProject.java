package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class InformationProject implements Serializable {
    private List<User> contact;
    private List<String> responsable;
    private List<User> userList;
    private User client;
    private String temps;
    private EtatTache etatProject;

    private String responsableString;
    private String intervenantString;
    private String contactString;
    private String nom;
    private String date_creation;

    public String getDate_creation() {
        return date_creation;
    }

    public void setDate_creation(String date_creation) {
        this.date_creation = date_creation;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getResponsableString() {
        return responsableString;
    }

    public void setResponsableString(String responsableString) {
        this.responsableString = responsableString;
    }

    public String getIntervenantString() {
        return intervenantString;
    }

    public void setIntervenantString(String intervenantString) {
        this.intervenantString = intervenantString;
    }

    public String getContactString() {
        return contactString;
    }

    public void setContactString(String contactString) {
        this.contactString = contactString;
    }

    public InformationProject(List<User> contact, List<String> responsable, List<User> userList, User client, String temps, EtatTache etatProject) {
        this.contact = contact;
        this.responsable = responsable;
        this.userList = userList;
        this.client = client;
        this.temps = temps;
        this.etatProject = etatProject;
    }

    public InformationProject() {
    }

    public List<User> getContact() {
        return contact;
    }

    public void setContact(List<User> contact) {
        this.contact = contact;
    }

    public List<String> getResponsable() {
        return responsable;
    }
    public void setResponsable(List<String> responsable) {
        this.responsable = responsable;
    }

    public List<User> getUserList() {
        return userList;
    }

    public void setUserList(List<User> userList) {
        this.userList = userList;
    }

    public User getClient() {
        return client;
    }

    public void setClient(User client) {
        this.client = client;
    }

    public String getTemps() {
        return temps;
    }

    public void setTemps(String temps) {
        this.temps = temps;
    }

    public EtatTache getEtatProject() {
        return etatProject;
    }

    public void setEtatProject(EtatTache etatProject) {
        this.etatProject = etatProject;
    }
}
