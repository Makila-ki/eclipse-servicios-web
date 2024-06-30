package com.example.demo.Entity;

public class Productos {

	private long id_pro;
	private String nom_pro;
	private long can_pro;
	private long pre_pro;
	private String tip_pro;
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
	@Override
	public String toString() {
		return "Productos [id_pro=" + id_pro + ", nom_pro=" + nom_pro + ", can_pro=" + can_pro + ", pre_pro=" + pre_pro
				+ ", tip_pro=" + tip_pro + ", mar_pro=" + mar_pro + "]";
	}
	
}
