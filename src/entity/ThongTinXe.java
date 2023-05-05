package entity;

import java.util.ArrayList;

public class ThongTinXe {
	private String maLoai, tenLoai, moTa, phienBan;
	private int giaNiemYet, giaGiam;
	public ArrayList<Xe> dsXe;
	public ThongTinXe(String maLoai, String tenLoai, String moTa, String phienBan, int giaNiemYet, int giaGiam) {
		super();
		this.maLoai = maLoai;
		this.tenLoai = tenLoai;
		this.moTa = moTa;
		this.phienBan = phienBan;
		this.giaNiemYet = giaNiemYet;
		this.giaGiam = giaGiam;
		dsXe = new ArrayList<Xe>();
	}
	public String getTenLoai() {
		return tenLoai;
	}
	public void setTenLoai(String tenLoai) {
		this.tenLoai = tenLoai;
	}
	public String getMoTa() {
		return moTa;
	}
	public void setMoTa(String moTa) {
		this.moTa = moTa;
	}
	public String getPhienBan() {
		return phienBan;
	}
	public void setPhienBan(String phienBan) {
		this.phienBan = phienBan;
	}
	public int getGiaNiemYet() {
		return giaNiemYet;
	}
	public void setGiaNiemYet(int giaNiemYet) {
		this.giaNiemYet = giaNiemYet;
	}
	public int getGiaGiam() {
		return giaGiam;
	}
	public void setGiaGiam(int giaGiam) {
		this.giaGiam = giaGiam;
	}
	public String getMaLoai() {
		return maLoai;
	}
	
	
}
