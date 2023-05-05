package entity;

import java.util.ArrayList;

public class NhanVienHanhChinh extends NhanVien{
	public ArrayList<HoaDon> dsHoaDon;
	public NhanVienHanhChinh(String ma, String ten, String diaChi, String chucVu, String email, int sdt, 
		String maCuaHang, int namKinhNghiem) {
		super(ma, ten, diaChi, chucVu, email, sdt, maCuaHang, namKinhNghiem);
		dsHoaDon = new ArrayList<HoaDon>();
	}
}
