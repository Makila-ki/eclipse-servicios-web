package com.example.demo.Entity;

public class Tarjeta {
	
	private long id_tar;
	private long id_clii;
	private String ban_tar;
	private long num_tar;
	private String fec_tar;
	private long cvv_tar;
	private String tip_tar;
	public long getId_tar() {
		return id_tar;
	}
	public void setId_tar(long id_tar) {
		this.id_tar = id_tar;
	}
	public long getId_clii() {
		return id_clii;
	}
	public void setId_clii(long id_clii) {
		this.id_clii = id_clii;
	}
	public String getBan_tar() {
		return ban_tar;
	}
	public void setBan_tar(String ban_tar) {
		this.ban_tar = ban_tar;
	}
	public long getNum_tar() {
		return num_tar;
	}
	public void setNum_tar(long num_tar) {
		this.num_tar = num_tar;
	}
	public String getFec_tar() {
		return fec_tar;
	}
	public void setFec_tar(String fec_tar) {
		this.fec_tar = fec_tar;
	}
	public long getCvv_tar() {
		return cvv_tar;
	}
	public void setCvv_tar(long cvv_tar) {
		this.cvv_tar = cvv_tar;
	}
	public String getTip_tar() {
		return tip_tar;
	}
	public void setTip_tar(String tip_tar) {
		this.tip_tar = tip_tar;
	}
	@Override
	public String toString() {
		return "Tarjeta [id_tar=" + id_tar + ", id_clii=" + id_clii + ", ban_tar=" + ban_tar + ", num_tar=" + num_tar
				+ ", fec_tar=" + fec_tar + ", cvv_tar=" + cvv_tar + ", tip_tar=" + tip_tar + "]";
	}
	
	

}
