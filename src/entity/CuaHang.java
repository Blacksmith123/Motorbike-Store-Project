package entity;

import java.util.ArrayList;

public class CuaHang {
	private String ma, ten, email, duong, thanhPho, tinhTrang;
	private int sdt, maBuuDien;
	public ArrayList<NhanVien> dsNhanVien;
	public ArrayList<HoaDon> dsHoaDon;
	public ArrayList<XeTrongKho> dsXe;
	public CuaHang(String ma, String ten, String email, String duong, String thanhPho, String tinhTrang, int sdt,
			int maBuuDien, NhanVien nv) {
		super();
		this.ma = ma;
		this.ten = ten;
		this.email = email;
		this.duong = duong;
		this.thanhPho = thanhPho;
		this.tinhTrang = tinhTrang;
		this.sdt = sdt;
		this.maBuuDien = maBuuDien;
		dsNhanVien = new ArrayList<NhanVien>();
		dsNhanVien.add(nv);
		dsHoaDon = new ArrayList<HoaDon>();
		dsXe = new ArrayList<XeTrongKho>();
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
	public ArrayList<NhanVien> getDsNhanVien() {
		return dsNhanVien;
	}
	public void setDsNhanVien(ArrayList<NhanVien> dsNhanVien) {
		this.dsNhanVien = dsNhanVien;
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
