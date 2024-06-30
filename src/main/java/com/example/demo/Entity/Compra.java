package com.example.demo.Entity;

public class Compra {
	
	private long id_com;
	private long id_proo;
	private long id_clii;
	private long can_com;
	private long pre_com;
	private String fec_com;
	
	
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
	@Override
	public String toString() {
		return "Compra [id_com=" + id_com + ", id_proo=" + id_proo + ", id_clii=" + id_clii + ", can_com=" + can_com
				+ ", pre_com=" + pre_com + ", fec_com=" + fec_com + "]";
	}
	
	
	

}
