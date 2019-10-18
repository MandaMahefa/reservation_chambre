package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class VisualisationClient implements Serializable {
    private List<Tache> listeTache;
    private List<InformationProject> listeProjet;
    private List<Contact> contactList;
    private List<Contact> isCheck;

    public VisualisationClient() {
    }

    public List<Tache> getListeTache() {
        return this.listeTache;
    }

    public void setListeTache(List<Tache> listeTache) {
        this.listeTache = listeTache;
    }

    public List<InformationProject> getListeProjet() {
        return this.listeProjet;
    }

    public void setListeProjet(List<InformationProject> listeProjet) {
        this.listeProjet = listeProjet;
    }

    public List<Contact> getContactList() {
        return this.contactList;
    }

    public void setContactList(List<Contact> contactList) {
        this.contactList = contactList;
    }

    public List<Contact> getIsCheck() {
        return this.isCheck;
    }

    public void setIsCheck(List<Contact> isCheck) {
        this.isCheck = isCheck;
    }
}
