package dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.HoaDon;

public class HoaDon_DAO {
	public List<HoaDon> getAllHoaDon() {
		List<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "select * from HoaDon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				dsHoaDon.add(new HoaDon(rs.getString("maHoaDon"), /* rs.getString("ngayLap") */null,
						rs.getString("thoiGianBaoHanh"), rs.getString("maKhachHang"), rs.getString("maCuaHang"),
						rs.getString("maNhanVien")));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsHoaDon;
	}

	public boolean themHoaDon(HoaDon hd) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		try {
			stmt = con.prepareStatement("insert into HoaDon values (?,?,?,?,?,?,?,?,?)");
			stmt.setString(1, hd.getMa());
			stmt.setDate(2, hd.getNgayLap());
			stmt.setString(3, hd.getThoiGianBH());
			stmt.setString(4, hd.getMaKH());
			stmt.setString(5, hd.getMaCH());
			stmt.setString(6, hd.getMaNV());
		} finally {
			stmt.close();
		}
		return stmt.executeUpdate() > 0;
	}

	// get hoa don theo ngay
	@SuppressWarnings("deprecation")
	public ArrayList<HoaDon> getHDTheoNgay(Date ngayBatDau, Date ngayKetThuc) throws SQLException {

		ArrayList<HoaDon> lsHD = new ArrayList<HoaDon>();
		String ngayBD = (ngayBatDau.getYear() + 1900) + "/" + (ngayBatDau.getMonth() + 1) + "/" + ngayBatDau.getDate();
		String ngayKT = (ngayKetThuc.getYear() + 1900) + "/" + (ngayKetThuc.getMonth() + 1) + "/"
				+ ngayKetThuc.getDate();

		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(
				"SELECT * FROM [dbo].[HoaDon] where ngayLap between '" + ngayBD + "' and '" + ngayKT + "'");
		while (rs.next()) {
			HoaDon hd = new HoaDon();

			hd.setMa(rs.getString(1));
			hd.setNgayLap(rs.getDate(2));
			hd.setThoiGianBH(rs.getString(3));
			hd.setMaKH(rs.getString(4));
			hd.setMaCH(rs.getString(5));
			hd.setMaNV(rs.getString(6));

			lsHD.add(hd);
		}
		return lsHD;
	}

	// get hoa don theo ma
	public HoaDon getHDTheoMa(String ma) throws SQLException {

		HoaDon hd = new HoaDon();

		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[HoaDon] where maHD ='" + ma + "'";

		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {

			hd.setMa(rs.getString(1));
			hd.setNgayLap(rs.getDate(2));
			hd.setThoiGianBH(rs.getString(3));
			hd.setMaKH(rs.getString(4));
			hd.setMaCH(rs.getString(5));
			hd.setMaNV(rs.getString(6));

		}

		return hd;

	}

	// get hoa don theo ten khach hang
	public ArrayList<HoaDon> getHDTheoTenKH(String tenKH) throws SQLException {

		ArrayList<HoaDon> lsHD = new ArrayList<HoaDon>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT HoaDon.* FROM  HoaDon INNER JOIN KhachHang ON HoaDon.maKhachHang = KhachHang.maKhachHang where KhachHang.tenKhachHang like N'%"
				+ tenKH + "%'";

		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			HoaDon hd = new HoaDon();

			hd.setMa(rs.getString(1));
			hd.setNgayLap(rs.getDate(2));
			hd.setThoiGianBH(rs.getString(3));
			hd.setMaKH(rs.getString(4));
			hd.setMaCH(rs.getString(5));
			hd.setMaNV(rs.getString(6));

			lsHD.add(hd);
		}

		return lsHD;

	}

	// get hoa don theo ma nhan vien
	public ArrayList<HoaDon> getHDTheoMaNV(String maNV) throws SQLException {

		ArrayList<HoaDon> lsHD = new ArrayList<HoaDon>();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[HoaDon] where maNhanVien = '" + maNV + "'";

		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			HoaDon hd = new HoaDon();

			hd.setMa(rs.getString(1));
			hd.setNgayLap(rs.getDate(2));
			hd.setThoiGianBH(rs.getString(3));
			hd.setMaKH(rs.getString(4));
			hd.setMaCH(rs.getString(5));
			hd.setMaNV(rs.getString(6));

			lsHD.add(hd);
		}

		return lsHD;

	}

	// get hoa don theo ngay
	public ArrayList<HoaDon> getHDtheoNgay(Date d) throws SQLException {

		ArrayList<HoaDon> lsHD = new ArrayList<HoaDon>();
		@SuppressWarnings("deprecation")
		String ngay = (d.getYear() + 1900) + "/" + (d.getMonth() + 1) + "/" + d.getDate();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[HoaDon] where ngayLap = '" + ngay + "'";

		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			HoaDon hd = new HoaDon();

			hd.setMa(rs.getString(1));
			hd.setNgayLap(rs.getDate(2));
			hd.setThoiGianBH(rs.getString(3));
			hd.setMaKH(rs.getString(4));
			hd.setMaCH(rs.getString(5));
			hd.setMaNV(rs.getString(6));

			lsHD.add(hd);
		}

		return lsHD;

	}

	/*
	 * THONG KE
	 */

	// get so luong khach hang trong ngay
	public Integer getSoLuongKhachHangTrongNgay(Date d) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "select COUNT(*) from KhachHang kh inner join HoaDon hd on kh.maKhachHang = hd.maKhachHang  where ngayLap = '"
				+ d + "' ";
		int dem = 0;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				dem = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dem;

	}

	// get so luong khach hang trong thang
	public Integer getSoLuongKhachHangTrongThang(String nam, String thang) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "select COUNT(*) from KhachHang kh inner join HoaDon hd on kh.maKhachHang = hd.maKhachHang  where YEAR(ngayLap) = '"
				+ nam + "' and MONTH(ngayLap) = '" + thang + "' ";
		int dem = 0;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				dem = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dem;

	}

	// get so luong khach hang trong nam
	public Integer getSoLuongKhachHangTrongNam(String nam) {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "select COUNT(*) from KhachHang kh inner join HoaDon hd on kh.maKhachHang = hd.maKhachHang  where YEAR(ngayLap) = '"
				+ nam + "' ";
		int dem = 0;
		try {
			Statement stm = con.createStatement();
			ResultSet rs = stm.executeQuery(sql);
			while (rs.next()) {
				dem = rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}

		return dem;

	}

	// get so luong khach hang
	@SuppressWarnings("deprecation")
	public Integer demSoKH(Date ngayBatDau, Date ngayKetThuc) throws SQLException {

		// ArrayList<HoaDon> lsHD = new ArrayList<HoaDon>();
		String ngayBD = (ngayBatDau.getYear() + 1900) + "/" + (ngayBatDau.getMonth() + 1) + "/" + ngayBatDau.getDate();
		String ngayKT = (ngayKetThuc.getYear() + 1900) + "/" + (ngayKetThuc.getMonth() + 1) + "/"
				+ ngayKetThuc.getDate();

		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "select COUNT (DISTINCT maKhachHang ) from  KhachHang kh inner join HoaDon hd on kh.maKhachHang = hd.maKhachHang where ngayLap between '"
				+ ngayBD + "' and '" + ngayKT + "'";
		int count = 0;
		Statement stm = con.createStatement();
		ResultSet rs = stm.executeQuery(sql);
		while (rs.next()) {
			count = rs.getInt(1);
		}

		return count;

	}

	// get so luong xe

}
