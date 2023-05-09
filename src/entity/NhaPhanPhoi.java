package entity;

import java.util.ArrayList;
import java.util.Objects;

public class NhaPhanPhoi {
	private int sdt;
	private String tenNhaPhanPhoi, diaChi, email, ma;
	public ArrayList<Xe> dsXe;
	
	public NhaPhanPhoi() {
		super();
	}
	
	public NhaPhanPhoi(String ma) {
		super();
		this.ma = ma;
	}
	
	public NhaPhanPhoi(String ma, String tenNhaPhanPhoi, String diaChi, int sdt, String email) {
		super();
		this.sdt = sdt;
		this.tenNhaPhanPhoi = tenNhaPhanPhoi;
		this.diaChi = diaChi;
		this.email = email;
		this.ma = ma;
		this.dsXe = new ArrayList<Xe>();
	}
	public int getSdt() {
		return sdt;
	}
	public void setSdt(int sdt) {
		this.sdt = sdt;
	}
	public String getTenNhaPhanPhoi() {
		return tenNhaPhanPhoi;
	}
	public void setTenNhaPhanPhoi(String tenNhaPhanPhoi) {
		this.tenNhaPhanPhoi = tenNhaPhanPhoi;
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
	
	public void setMa(String ma) {
		this.ma = ma;
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
		NhaPhanPhoi other = (NhaPhanPhoi) obj;
		return ma == other.ma;
	}
	
	
}
