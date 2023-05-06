package entity;

import java.sql.Date;
import java.util.Objects;

public class HoaDon {
	private String ma, maXe, maKH, maNV, maCH, thoiGianBH;
	private int donGia, soLuong;
	private Date ngayLap;
	
	public HoaDon() {
		super();
	}
	
	public HoaDon(String ma) {
		super();
		this.ma = ma;
	}
	
	public HoaDon(String ma, String maXe, String maKH, String maNV, String maCH, String thoiGianBH, int donGia,
			int soLuong, Date ngayLap) {
		super();
		this.ma = ma;
		this.maXe = maXe;
		this.maKH = maKH;
		this.maNV = maNV;
		this.maCH = maCH;
		this.thoiGianBH = thoiGianBH;
		this.donGia = donGia;
		this.soLuong = soLuong;
		this.ngayLap = ngayLap;
	}
	
	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getMaXe() {
		return maXe;
	}
	public void setMaXe(String maXe) {
		this.maXe = maXe;
	}
	public String getMaKH() {
		return maKH;
	}
	public void setMaKH(String maKH) {
		this.maKH = maKH;
	}
	public String getMaNV() {
		return maNV;
	}
	public void setMaNV(String maNV) {
		this.maNV = maNV;
	}
	public String getMaCH() {
		return maCH;
	}
	public void setMaCH(String maCH) {
		this.maCH = maCH;
	}
	public String getThoiGianBH() {
		return thoiGianBH;
	}
	public void setThoiGianBH(String thoiGianBH) {
		this.thoiGianBH = thoiGianBH;
	}
	public int getDonGia() {
		return donGia;
	}
	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	public Date getNgayLap() {
		return ngayLap;
	}
	public void setNgayLap(Date ngayLap) {
		this.ngayLap = ngayLap;
	}
	public String getMa() {
		return ma;
	}
	@Override
	public int hashCode() {
		return Objects.hash(ma);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		HoaDon other = (HoaDon) obj;
		return Objects.equals(ma, other.ma);
	}
	
	
}
