package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.NhanVienHanhChinh;
import entity.NhanVienKyThuat;
import entity.TaiKhoan;

public class NhanVienHanhChinh_DAO {
	// get nhan vien hanh chinh
	public List<NhanVienHanhChinh> getAlListNhanVienHanhChinhChinh() {
		List<NhanVienHanhChinh> dsChinh = new ArrayList<NhanVienHanhChinh>();
		ConnectDB.getInstance();
		Connection connection = ConnectDB.getConnection();
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		try {
			String sql = "select * from NhanVienHanhChanh";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(9));
				dsChinh.add(
						new NhanVienHanhChinh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
								resultSet.getString(5), resultSet.getString(6), Integer.valueOf(resultSet.getString(4)),
								resultSet.getString(8), Integer.valueOf(resultSet.getString(7)), tKhoan));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsChinh;
	}

	// them nhan vien
	public boolean themNhanVien(NhanVienHanhChinh nv) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		stmt = con.prepareStatement("insert into NhanVienHanhChanh values (?,?,?,?,?,?,?,?,?)");
		stmt.setString(1, nv.getMa());
		stmt.setString(2, nv.getTen());
		stmt.setString(3, nv.getDiaChi());
		stmt.setString(4, nv.getSdt() + "");
		stmt.setString(5, nv.getChucVu());
		stmt.setString(6, nv.getEmail());
		stmt.setString(7, nv.getNamKinhNghiem() + "");
		stmt.setString(8, nv.getMaCuaHang());
		stmt.setString(9, "123");
		return stmt.executeUpdate() > 0;
	}

	// get danh sách nhân viên theo mã cửa hàng
	public List<NhanVienHanhChinh> getNhanVienHanhChinhTheoMaCh(String ma) throws SQLException {
		ConnectDB.getInstance();
		List<NhanVienHanhChinh> dsNhanVien = new ArrayList<NhanVienHanhChinh>();
		Connection connection = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[NhanVienHanhChanh] where maCuaHang ='" + ma + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		while (resultSet.next()) {
			tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(9));
			dsNhanVien.add(new NhanVienHanhChinh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(5), resultSet.getString(6), Integer.valueOf(resultSet.getString(4)),
					resultSet.getString(8), Integer.valueOf(resultSet.getString(7)), tKhoan));
		}
		return dsNhanVien;
	}

	// get danh sách nhân viên theo nam kinh nghiem
	public List<NhanVienHanhChinh> getNhanVienHanhChinhNamKn(String ma) throws SQLException {
		ConnectDB.getInstance();
		List<NhanVienHanhChinh> dsNhanVien = new ArrayList<NhanVienHanhChinh>();
		Connection connection = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[NhanVienHanhChanh] where soNamKinhNghiem ='" + ma + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		while (resultSet.next()) {
			tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(9));
			dsNhanVien.add(new NhanVienHanhChinh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(5), resultSet.getString(6), Integer.valueOf(resultSet.getString(4)),
					resultSet.getString(8), Integer.valueOf(resultSet.getString(7)), tKhoan));
		}
		return dsNhanVien;
	}

	// get danh sách nhân viên theo chuc vu
	public List<NhanVienHanhChinh> getNhanVienHanhChinhChucVu(String ma) throws SQLException {
		ConnectDB.getInstance();
		List<NhanVienHanhChinh> dsNhanVien = new ArrayList<NhanVienHanhChinh>();
		Connection connection = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[NhanVienHanhChanh] where chucVu ='" + ma + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		while (resultSet.next()) {
			tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(9));
			dsNhanVien.add(new NhanVienHanhChinh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(5), resultSet.getString(6), Integer.valueOf(resultSet.getString(4)),
					resultSet.getString(8), Integer.valueOf(resultSet.getString(7)), tKhoan));
		}
		return dsNhanVien;
	}

	// get nhân viên mã nv
	public NhanVienHanhChinh getNhanVienHanhChinhTheoMa(String ma) throws SQLException {
		ConnectDB.getInstance();
		NhanVienHanhChinh NhanVien = null;
		Connection connection = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[NhanVienHanhChanh] where maNhanVien ='" + ma + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		while (resultSet.next()) {
			tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(10));
			NhanVien = new NhanVienHanhChinh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getString(5), resultSet.getString(6), Integer.valueOf(resultSet.getString(4)),
					resultSet.getString(8), Integer.valueOf(resultSet.getString(7)), tKhoan);
		}
		return NhanVien;
	}
	
	// get nhân viên theo tai khoan
	public NhanVienHanhChinh getNhanVienHanhChinhTheoMaTaiKhoan(String maTaiKhoan) throws SQLException {
		ConnectDB.getInstance();
		NhanVienHanhChinh NhanVien = null;
		Connection connection = ConnectDB.getConnection();
		try {
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery("SELECT * FROM [dbo].[NhanVienHanhChanh] where maNhanVien ='" + maTaiKhoan + "'");
			TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
			TaiKhoan tKhoan;
			while (resultSet.next()) {
				tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(10));
				NhanVien = new NhanVienHanhChinh(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
						resultSet.getString(5), resultSet.getString(6), Integer.valueOf(resultSet.getString(4)),
						resultSet.getString(8), Integer.valueOf(resultSet.getString(7)), tKhoan);
			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
		return NhanVien;
	}
}
