package dao;

import java.sql.Connection;
import java.util.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import connect.ConnectDB;
import entity.HoaDon;

public class HoaDon_DAO {
	private Calendar ngayBatDauCalendar;
	private Calendar ngayKetThucCalendar;

	// get danh sach hoa don, get tat ca hoa don
	public List<HoaDon> getAllHoaDon() {
		ConnectDB.getInstance();
		List<HoaDon> dsHoaDon = new ArrayList<HoaDon>();
		Connection con = ConnectDB.getConnection();
		try {
			String sql = "select * from HoaDon";
			Statement statement = con.createStatement();
			ResultSet rs = statement.executeQuery(sql);
			while (rs.next()) {
				dsHoaDon.add(new HoaDon(rs.getString(1), rs.getDate(2), rs.getString(3), rs.getString(4),
						rs.getString(5), rs.getString(6)));
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
		stmt = con.prepareStatement("insert into HoaDon values (?,?,?,?,?,?)");
		stmt.setString(1, hd.getMa());
		stmt.setDate(2, hd.getNgayLap());
		stmt.setString(3, hd.getThoiGianBH());
		stmt.setString(4, hd.getMaKH());
		stmt.setString(5, hd.getMaCH());
		stmt.setString(6, hd.getMaNV());
		stmt.close();
		return stmt.executeUpdate() > 0;
	}

	// get hoa don theo ngay
	public List<HoaDon> getHDTheoNgay(Date ngayBatDau, Date ngayKetThuc) throws SQLException {

		ConnectDB.getInstance();
		ngayBatDauCalendar = null;
		ngayBatDauCalendar.setTime(ngayBatDau);
		ngayKetThucCalendar = null;
		ngayKetThucCalendar.setTime(ngayKetThuc);
		List<HoaDon> lsHD = new ArrayList<HoaDon>();
		String ngayBD = (ngayBatDauCalendar.get(Calendar.YEAR) + 1900) + "/"
				+ (ngayBatDauCalendar.get(Calendar.MONTH) + 1) + "/" + ngayBatDauCalendar.get(Calendar.DATE);
		String ngayKT = (ngayKetThucCalendar.get(Calendar.YEAR) + 1900) + "/"
				+ (ngayKetThucCalendar.get(Calendar.MONTH) + 1) + "/" + ngayKetThucCalendar.get(Calendar.DATE);

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
		ConnectDB.getInstance();
		HoaDon hd = new HoaDon();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[HoaDon] where maHoaDon ='" + ma + "'";

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
	public List<HoaDon> getHDTheoTenKH(String tenKH) throws SQLException {
		ConnectDB.getInstance();
		List<HoaDon> lsHD = new ArrayList<HoaDon>();
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

	// get hoa don theo mã cửa hàng
	public List<HoaDon> getHDTheoMaCH(String mach) throws SQLException {
		ConnectDB.getInstance();
		List<HoaDon> lsHD = new ArrayList<HoaDon>();
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[HoaDon] where maCuaHang ='" + mach + "'";
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
	public List<HoaDon> getHDTheoMaNV(String maNV) throws SQLException {
		ConnectDB.getInstance();
		List<HoaDon> lsHD = new ArrayList<HoaDon>();
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
	public List<HoaDon> getHDtheoNgay(Date d) throws SQLException {
		ConnectDB.getInstance();
		List<HoaDon> lsHD = new ArrayList<HoaDon>();
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd");
		String formattedDate = formatter.format(d);
		Connection con = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[HoaDon] where ngayLap = '" + formattedDate + "'";

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
	public Integer demSoKH(Date ngayBatDau, Date ngayKetThuc) throws SQLException {
		ConnectDB.getInstance();
		ngayBatDauCalendar = null;
		ngayBatDauCalendar.setTime(ngayBatDau);
		ngayKetThucCalendar = null;
		ngayKetThucCalendar.setTime(ngayKetThuc);

		// ArrayList<HoaDon> lsHD = new ArrayList<HoaDon>();
		String ngayBD = (ngayBatDauCalendar.get(Calendar.YEAR) + 1900) + "/"
				+ (ngayBatDauCalendar.get(Calendar.MONTH) + 1) + "/" + ngayBatDauCalendar.get(Calendar.DATE);
		String ngayKT = (ngayKetThucCalendar.get(Calendar.YEAR) + 1900) + "/"
				+ (ngayKetThucCalendar.get(Calendar.MONTH) + 1) + "/" + ngayKetThucCalendar.get(Calendar.DATE);

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
