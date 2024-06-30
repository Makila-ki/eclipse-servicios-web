package com.example.demo.Entity;

public class Cliente {

	private long id_cli;
	private String nom_cli;
	private long num_cli;
	private String usu_cli;
	private String con_cli;
	private String dom_cli;
	public long getId_cli() {
		return id_cli;
	}
	public void setId_cli(long id_cli) {
		this.id_cli = id_cli;
	}
	public String getNom_cli() {
		return nom_cli;
	}
	public void setNom_cli(String nom_cli) {
		this.nom_cli = nom_cli;
	}
	public long getNum_cli() {
		return num_cli;
	}
	public void setNum_cli(long num_cli) {
		this.num_cli = num_cli;
	}
	public String getUsu_cli() {
		return usu_cli;
	}
	public void setUsu_cli(String usu_cli) {
		this.usu_cli = usu_cli;
	}
	public String getCon_cli() {
		return con_cli;
	}
	public void setCon_cli(String con_cli) {
		this.con_cli = con_cli;
	}
	public String getDom_cli() {
		return dom_cli;
	}
	public void setDom_cli(String dom_cli) {
		this.dom_cli = dom_cli;
	}
	@Override
	public String toString() {
		return "Cliente [id_cli=" + id_cli + ", nom_cli=" + nom_cli + ", num_cli=" + num_cli + ", usu_cli=" + usu_cli
				+ ", con_cli=" + con_cli + ", dom_cli=" + dom_cli + "]";
	}
	
	
}
