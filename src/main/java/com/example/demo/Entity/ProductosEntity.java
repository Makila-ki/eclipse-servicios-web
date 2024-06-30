package com.example.demo.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="productos")
public class ProductosEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Id_pr")
	private long id_pro;
	@Column(name="Nombre_pr")
	private String nom_pro;
	@Column(name="Cantidad_pr")
	private long can_pro;
	@Column(name="Precio_pr")
	private long pre_pro;
	@Column(name="Tipo_pr")
	private String tip_pro;
	@Column(name="Marca_pr")
	private String mar_pro;
	public long getId_pro() {
		return id_pro;
	}
	public void setId_pro(long id_pro) {
		this.id_pro = id_pro;
	}
	public String getNom_pro() {
		return nom_pro;
	}
	public void setNom_pro(String nom_pro) {
		this.nom_pro = nom_pro;
	}
	public long getCan_pro() {
		return can_pro;
	}
	public void setCan_pro(long can_pro) {
		this.can_pro = can_pro;
	}
	public long getPre_pro() {
		return pre_pro;
	}
	public void setPre_pro(long pre_pro) {
		this.pre_pro = pre_pro;
	}
	public String getTip_pro() {
		return tip_pro;
	}
	public void setTip_pro(String tip_pro) {
		this.tip_pro = tip_pro;
	}
	public String getMar_pro() {
		return mar_pro;
	}
	public void setMar_pro(String mar_pro) {
		this.mar_pro = mar_pro;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "ProductosEntity [id_pro=" + id_pro + ", nom_pro=" + nom_pro + ", can_pro=" + can_pro + ", pre_pro="
				+ pre_pro + ", tip_pro=" + tip_pro + ", mar_pro=" + mar_pro + "]";
	}

}
