package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class User implements Serializable {
    private int id;
    private String role;
    private String nom;
    private String prenom;
    private String email;
    private String image;
    private String url_image;
    private int status;
    private Date last_login;
    private int nb_contact;
    private int nb_projet;
    private List<Contact> listContact;


    public List<Contact> getListContact() {
        return listContact;
    }

    public void setListContact(List<Contact> listContact) {
        this.listContact = listContact;
    }
    public int getNb_contact() {
        return nb_contact;
    }

    public void setNb_contact(int nb_contact) {
        this.nb_contact = nb_contact;
    }

    public int getNb_projet() {
        return nb_projet;
    }

    public void setNb_projet(int nb_projet) {
        this.nb_projet = nb_projet;
    }

    public Date getLast_login() {
        return this.last_login;
    }

    public void setLast_login(Date last_login) {
        this.last_login = last_login;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public User(int id, String role, String nom, String prenom) {
        this.id = id;
        this.role = role;
        this.nom = nom;
        this.prenom = prenom;
    }

    public User(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public User(String nom) {
        this.nom = nom;
    }

    public User() {
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getUrl_image() {
        return url_image;
    }

    public void setUrl_image(String url_image) {
        this.url_image = url_image;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    @Override
    public String toString() {
        return "id: "+this.id+ " nom"+ this.nom;
    }
}
