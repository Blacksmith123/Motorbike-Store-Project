package entity;

import java.util.ArrayList;

public class NhanVienKyThuat extends NhanVien{
	public ArrayList<PhieuNhanXet> dsPhieuNhanXet;
	public NhanVienKyThuat(String ma, String ten, String diaChi, String chucVu, String email, int sdt, String maCuaHang,
			int namKinhNghiem) {
		super(ma, ten, diaChi, chucVu, email, sdt, maCuaHang, namKinhNghiem);
		dsPhieuNhanXet = new ArrayList<PhieuNhanXet>();
	}
	
}
