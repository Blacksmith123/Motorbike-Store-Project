package entity;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Xe {
	private String ma, soMay, soKhung, maLoaiXe;
	private LocalDate ngayNhap;
	private int maNPP;
	public ArrayList<XeTrongKho> dsKho;
	public Xe(String ma, String soMay, String soKhung, LocalDate ngayNhap, int maNPP, String maLoaiXe) {
		super();
		this.ma = ma;
		this.soMay = soMay;
		this.soKhung = soKhung;
		this.ngayNhap = ngayNhap;
		this.maNPP = maNPP;
		this.maLoaiXe = maLoaiXe;
		dsKho = new ArrayList<XeTrongKho>();
	}
	public String getSoMay() {
		return soMay;
	}
	public void setSoMay(String soMay) {
		this.soMay = soMay;
	}
	public String getSoKhung() {
		return soKhung;
	}
	public void setSoKhung(String soKhung) {
		this.soKhung = soKhung;
	}
	public LocalDate getNgayNhap() {
		return ngayNhap;
	}
	public void setNgayNhap(LocalDate ngayNhap) {
		this.ngayNhap = ngayNhap;
	}
	public String getMa() {
		return ma;
	}
	public String getMaLoaiXe() {
		return maLoaiXe;
	}
	public void setMaLoaiXe(String maLoaiXe) {
		this.maLoaiXe = maLoaiXe;
	}
	public int getMaNPP() {
		return maNPP;
	}
	public void setMaNPP(int maNPP) {
		this.maNPP = maNPP;
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
		Xe other = (Xe) obj;
		return Objects.equals(ma, other.ma);
	}
	
	
}
