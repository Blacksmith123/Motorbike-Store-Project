package entity;

public class ChiTietHoaDon {
	private String ma, tenLoaiXe;
	private int soLuong, donGia, thanhTien;
	
	public ChiTietHoaDon() {
		super();
	}
	
	public ChiTietHoaDon(String ma) {
		super();
		this.ma = ma;
	}
	
	public ChiTietHoaDon(String ma, String tenLoaiXe, int soLuong, int donGia) {
		super();
		this.ma = ma;
		this.tenLoaiXe = tenLoaiXe;
		this.soLuong = soLuong;
		this.donGia = donGia;
		this.thanhTien = donGia * soLuong;
	}

	public String getMa() {
		return ma;
	}

	public void setMa(String ma) {
		this.ma = ma;
	}

	public String getTenLoaiXe() {
		return tenLoaiXe;
	}

	public void setTenLoaiXe(String tenLoaiXe) {
		this.tenLoaiXe = tenLoaiXe;
	}

	public int getSoLuong() {
		return soLuong;
	}

	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}

	public int getDonGia() {
		return donGia;
	}

	public void setDonGia(int donGia) {
		this.donGia = donGia;
	}

	public int getThanhTien() {
		return thanhTien;
	}

	public void setThanhTien(int thanhTien) {
		this.thanhTien = thanhTien;
	}
	
	
}
