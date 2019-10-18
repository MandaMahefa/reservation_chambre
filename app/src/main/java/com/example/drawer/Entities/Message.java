package com.example.drawer.Entities;

import java.io.File;
import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
	private User user;
	private String contenu;
	private Date date;
	private boolean is_email;
	private File pj;
	public Message() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Message(User user, String contenu, Date date, boolean is_email, File pj) {
		super();
		this.user = user;
		this.contenu = contenu;
		this.date = date;
		this.is_email = is_email;
		this.pj = pj;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public String getContenu() {
		return contenu;
	}
	public void setContenu(String contenu) {
		this.contenu = contenu;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public boolean isIs_email() {
		return is_email;
	}
	public void setIs_email(boolean is_email) {
		this.is_email = is_email;
	}
	public File getPj() {
		return pj;
	}
	public void setPj(File pj) {
		this.pj = pj;
	}
	
}
