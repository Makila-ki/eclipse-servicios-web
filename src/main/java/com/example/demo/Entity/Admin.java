package com.example.demo.Entity;

public class Admin {
	
	private long id_ad;
	private String nom_ad;
	private String usu_ad;
	private String con_ad;
	public long getId_ad() {
		return id_ad;
	}
	public void setId_ad(long id_ad) {
		this.id_ad = id_ad;
	}
	public String getNom_ad() {
		return nom_ad;
	}
	public void setNom_ad(String nom_ad) {
		this.nom_ad = nom_ad;
	}
	public String getUsu_ad() {
		return usu_ad;
	}
	public void setUsu_ad(String usu_ad) {
		this.usu_ad = usu_ad;
	}
	public String getCon_ad() {
		return con_ad;
	}
	public void setCon_ad(String con_ad) {
		this.con_ad = con_ad;
	}
	@Override
	public String toString() {
		return "Admin [id_ad=" + id_ad + ", nom_ad=" + nom_ad + ", usu_ad=" + usu_ad + ", con_ad=" + con_ad + "]";
	}
	
	

}
