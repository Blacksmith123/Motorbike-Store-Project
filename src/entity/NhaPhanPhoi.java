package entity;

import java.util.ArrayList;
import java.util.Objects;

public class NhaPhanPhoi {
	private int ma, sdt;
	private String ten, diaChi, email;
	public ArrayList<Xe> dsXe;
	public NhaPhanPhoi(int ma, int sdt, String ten, String diaChi, String email) {
		super();
		this.ma = ma;
		this.sdt = sdt;
		this.ten = ten;
		this.diaChi = diaChi;
		this.email = email;
		dsXe = new ArrayList<Xe>();
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) {
		this.ten = ten;
	}
	public String getDiaChi() {
		return diaChi;
	}
	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getMa() {
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
		NhaPhanPhoi other = (NhaPhanPhoi) obj;
		return ma == other.ma;
	}
	
	
}
