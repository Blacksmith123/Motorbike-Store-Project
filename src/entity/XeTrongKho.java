package entity;

public class XeTrongKho {
	private String maCuaHang, maXe;
	private int soLuong;
	public XeTrongKho(String maCuaHang, String maXe, int soLuong) {
		super();
		this.maCuaHang = maCuaHang;
		this.maXe = maXe;
		this.soLuong = soLuong;
	}
	public String getMaCuaHang() {
		return maCuaHang;
	}
	public void setMaCuaHang(String maCuaHang) {
		this.maCuaHang = maCuaHang;
	}
	public String getMaXe() {
		return maXe;
	}
	public void setMaXe(String maXe) {
		this.maXe = maXe;
	}
	public int getSoLuong() {
		return soLuong;
	}
	public void setSoLuong(int soLuong) {
		this.soLuong = soLuong;
	}
	
}
