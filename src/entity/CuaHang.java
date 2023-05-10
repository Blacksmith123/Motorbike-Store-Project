package entity;

import java.util.ArrayList;

public class CuaHang {
	private String ma, ten, email, duong, thanhPho, tinhTrang;
	private int sdt, maBuuDien;
	public ArrayList<NhanVienHanhChinh> dsNhanVienHc;
	public ArrayList<NhanVienKyThuat> dsNhanVienKt;
	public ArrayList<HoaDon> dsHoaDon;
	public ArrayList<XeTrongKho> dsXe;
	public CuaHang() {
		super();
	}
	public CuaHang(String ma) {
		super();
		this.ma = ma;
	}
	public CuaHang(String ma, String ten, int sdt, String email, String duong, String thanhPho, String tinhTrang, int maBuuDien) {
		this.ma = ma;
		this.ten = ten;
		this.email = email;
		this.duong = duong;
		this.thanhPho = thanhPho;
		this.tinhTrang = tinhTrang;
		this.sdt = sdt;
		this.maBuuDien = maBuuDien;
		dsNhanVienHc = new ArrayList<NhanVienHanhChinh>();
		dsNhanVienKt = new ArrayList<NhanVienKyThuat>();
		dsHoaDon = new ArrayList<HoaDon>();
		dsXe = new ArrayList<XeTrongKho>();
	}
	
	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getDuong() {
		return duong;
	}
	public void setDuong(String duong) {
		this.duong = duong;
	}
	public String getThanhPho() {
		return thanhPho;
	}
	public void setThanhPho(String thanhPho) {
		this.thanhPho = thanhPho;
	}
	public String getTinhTrang() {
		return tinhTrang;
	}
	public void setTinhTrang(String tinhTrang) {
		this.tinhTrang = tinhTrang;
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public int getMaBuuDien() {
		return maBuuDien;
	}
	public void setMaBuuDien(int maBuuDien) {
		this.maBuuDien = maBuuDien;
	}
	public ArrayList<NhanVienHanhChinh> getDsNhanVienHc() {
		return dsNhanVienHc;
	}
	public void setDsNhanVienHc(ArrayList<NhanVienHanhChinh> dsNhanVienHc) {
		this.dsNhanVienHc = dsNhanVienHc;
	}
	public ArrayList<NhanVienKyThuat> getDsNhanVienKt() {
		return dsNhanVienKt;
	}
	public void setDsNhanVienKt(ArrayList<NhanVienKyThuat> dsNhanVienKt) {
		this.dsNhanVienKt = dsNhanVienKt;
	}
	public ArrayList<XeTrongKho> getDsXe() {
		return dsXe;
	}
	public void setDsXe(ArrayList<XeTrongKho> dsXe) {
		this.dsXe = dsXe;
	}
	public ArrayList<HoaDon> getDsHoaDon() {
		return dsHoaDon;
	}
	public void setDsHoaDon(ArrayList<HoaDon> dsHoaDon) {
		this.dsHoaDon = dsHoaDon;
	}
	public String getMa() {
		return ma;
	}
	
	
}
