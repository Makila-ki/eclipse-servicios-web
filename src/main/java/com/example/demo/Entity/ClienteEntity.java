package com.example.demo.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="cliente")
public class ClienteEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="id_cl")
	private long id_cli;
	@Column(name="Nombre_cl")
	private String nom_cli;
	@Column(name="Numero_cl")
	private long num_cli;
	@Column(name="Usuario_cl")
	private String usu_cli;
	@Column(name="Contrasena_cl")
	private String con_cli;
	@Column(name="Domicilio_cl")
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
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ClienteEntity [id_cli=" + id_cli + ", nom_cli=" + nom_cli + ", num_cli=" + num_cli + ", usu_cli="
				+ usu_cli + ", con_cli=" + con_cli + ", dom_cli=" + dom_cli + "]";
	}
	
}
