package com.example.drawer.Entities;

import java.io.Serializable;
import java.util.List;

public class TacheDetail implements Serializable {
	private Tache tache;
	private User client;
	private Projet projet;
	private Degree degree;
	private Folder folder;
	private List<User> listUser;
	private List<Message> message_interne;
	private List<Message> message;
	public TacheDetail(Tache tache, User client, Projet projet, List<User> listUser, List<Message> message_interne,
			List<Message> message) {
		super();
		this.tache = tache;
		this.client = client;
		this.projet = projet;
		this.listUser = listUser;
		this.message_interne = message_interne;
		this.message = message;
	}

	public Folder getFolder() {
		return this.folder;
	}



	public void setFolder(Folder folder) {
		this.folder = folder;
	}

	public Degree getDegree() {
		return this.degree;
	}

	public void setDegree(Degree degree) {
		this.degree = degree;
	}

	public Tache getTache() {
		return this.tache;
	}
	public void setTache(Tache tache) {
		this.tache = tache;
	}
	public User getClient() {
		return client;
	}
	public void setClient(User client) {
		this.client = client;
	}
	public Projet getProjet() {
		return projet;
	}
	public void setProjet(Projet projet) {
		this.projet = projet;
	}
	public List<User> getListUser() {
		return listUser;
	}
	public void setListUser(List<User> listUser) {
		this.listUser = listUser;
	}
	public List<Message> getMessage_interne() {
		return message_interne;
	}
	public void setMessage_interne(List<Message> message_interne) {
		this.message_interne = message_interne;
	}
	public List<Message> getMessage() {
		return message;
	}
	public void setMessage(List<Message> message) {
		this.message = message;
	}
	public TacheDetail() {
		super();
		// TODO Auto-generated constructor stub
	}

}
