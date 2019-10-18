package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

public class Notification implements Serializable {
    private User userAjout;
    private Tache tache;
    private Date date_ajout;
    private String message;
    private Date date_visualisation;
    private List<String> cause;
    private List<String> icon;
    private int id;
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Notification(User userAjout, Tache tache, Date date_ajout, String message, Date date_visualisation, List<String> cause, List<String> icon) {
        this.userAjout = userAjout;
        this.tache = tache;
        this.date_ajout = date_ajout;
        this.message = message;
        this.date_visualisation = date_visualisation;
        this.cause = cause;
        this.icon = icon;
    }

    public Notification() {
    }

    public User getUserAjout() {
        return userAjout;
    }

    public void setUserAjout(User userAjout) {
        this.userAjout = userAjout;
    }

    public Tache getTache() {
        return tache;
    }

    public void setTache(Tache tache) {
        this.tache = tache;
    }

    public Date getDate_ajout() {
        return date_ajout;
    }

    public void setDate_ajout(Date date_ajout) {
        this.date_ajout = date_ajout;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Date getDate_visualisation() {
        return date_visualisation;
    }

    public void setDate_visualisation(Date date_visualisation) {
        this.date_visualisation = date_visualisation;
    }

    public List<String> getCause() {
        return cause;
    }

    public void setCause(List<String> cause) {
        this.cause = cause;
    }

    public List<String> getIcon() {
        return icon;
    }

    public void setIcon(List<String> icon) {
        this.icon = icon;
    }
}
