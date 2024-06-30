package com.example.demo.Entity;

import java.io.Serializable;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="compra")
public class CompraEntity implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	@Id
	@Column(name="Id_co")
	private long id_com;
	@Column(name="Id_pro")
	private long id_proo;
	@Column(name="cantidad_co")
	private long can_com;
	@Column(name="precio_co")
	private long pre_com;
	@Column(name="fecha_ven")
	private String fec_com;
	@Column(name="id_cli")
	private long id_clii;
	
	public long getId_clii() {
		return id_clii;
	}
	public void setId_clii(long id_clii) {
		this.id_clii = id_clii;
	}
	public long getId_com() {
		return id_com;
	}
	public void setId_com(long id_com) {
		this.id_com = id_com;
	}
	public long getId_proo() {
		return id_proo;
	}
	public void setId_proo(long id_proo) {
		this.id_proo = id_proo;
	}
	public long getCan_com() {
		return can_com;
	}
	public void setCan_com(long can_com) {
		this.can_com = can_com;
	}
	public long getPre_com() {
		return pre_com;
	}
	public void setPre_com(long pre_com) {
		this.pre_com = pre_com;
	}
	public String getFec_com() {
		return fec_com;
	}
	public void setFec_com(String fec_com) {
		this.fec_com = fec_com;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	@Override
	public String toString() {
		return "CompraEntity [id_com=" + id_com + ", id_proo=" + id_proo + ", can_com=" + can_com + ", pre_com="
				+ pre_com + ", fec_com=" + fec_com + ", id_clii=" + id_clii + "]";
	}
	
	

}
