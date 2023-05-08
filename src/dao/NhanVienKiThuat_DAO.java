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

public class NhanVienKiThuat_DAO {
	// get nhan vien ki thuat
	public List<NhanVienKyThuat> getAllNhanVienKyThuat() {
		List<NhanVienKyThuat> dsChinh = new ArrayList<NhanVienKyThuat>();
		ConnectDB.getInstance();
		Connection connection = ConnectDB.getConnection();
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		try {
			String sql = "select * from NhanVienKiThuat";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			while (resultSet.next()) {
				tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(10));
				dsChinh.add(new NhanVienKyThuat(resultSet.getString(1), resultSet.getString(2), resultSet.getString(8),
						resultSet.getString(6), resultSet.getString(4), Integer.valueOf(resultSet.getString(3)),
						resultSet.getString(9), Integer.valueOf(resultSet.getString(7)), tKhoan,
						resultSet.getString(5)));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return dsChinh;
	}

	// them nhan vien
	public boolean themNhanVien(NhanVienKyThuat nv) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement stmt = null;
		stmt = con.prepareStatement("insert into NhanVienKiThuat values (?,?,?,?,?,?,?,?,?,?)");
		stmt.setString(1, nv.getMa());
		stmt.setString(2, nv.getTen());
		stmt.setString(3, nv.getSdt() + "");
		stmt.setString(4, nv.getEmail());
		stmt.setString(5, nv.getBacTho());
		stmt.setString(6, nv.getChucVu());
		stmt.setString(7, nv.getNamKinhNghiem() + "");
		stmt.setString(8, nv.getDiaChi());
		stmt.setString(9, nv.getMaCuaHang());
		stmt.setString(10, "121");
		return stmt.executeUpdate() > 0;
	}

	// get danh sách nhân viên theo mã cửa hàng
	public List<NhanVienKyThuat> getNhanVienKyThuatTheoMaCh(String ma) throws SQLException {
		ConnectDB.getInstance();
		List<NhanVienKyThuat> dsNhanVien = new ArrayList<NhanVienKyThuat>();
		Connection connection = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[NhanVienKiThuat] where maCuaHang ='" + ma + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		while (resultSet.next()) {
			tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(10));
			dsNhanVien.add(new NhanVienKyThuat(resultSet.getString(1), resultSet.getString(2), resultSet.getString(8),
					resultSet.getString(6), resultSet.getString(4), Integer.valueOf(resultSet.getString(3)),
					resultSet.getString(9), Integer.valueOf(resultSet.getString(7)), tKhoan, resultSet.getString(5)));
		}
		return dsNhanVien;
	}
	// get danh sách nhân viên theo nam kinh nghiem
		public List<NhanVienKyThuat> getNhanVienKyThuatNamKn(String ma) throws SQLException {
			ConnectDB.getInstance();
			List<NhanVienKyThuat> dsNhanVien = new ArrayList<NhanVienKyThuat>();
			Connection connection = ConnectDB.getConnection();
			String sql = "SELECT * FROM [dbo].[NhanVienKiThuat] where soNamKinhNghiem ='" + ma + "'";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sql);
			TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
			TaiKhoan tKhoan;
			while (resultSet.next()) {
				tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(10));
				dsNhanVien.add(new NhanVienKyThuat(resultSet.getString(1), resultSet.getString(2), resultSet.getString(8),
						resultSet.getString(6), resultSet.getString(4), Integer.valueOf(resultSet.getString(3)),
						resultSet.getString(9), Integer.valueOf(resultSet.getString(7)), tKhoan, resultSet.getString(5)));
			}
			return dsNhanVien;
		}
	// get danh sách nhân viên theo bac tho
	public List<NhanVienKyThuat> getNhanVienKyThuatBacTho(String ma) throws SQLException {
		ConnectDB.getInstance();
		List<NhanVienKyThuat> dsNhanVien = new ArrayList<NhanVienKyThuat>();
		Connection connection = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[NhanVienKiThuat] where bacTho ='" + ma + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		while (resultSet.next()) {
			tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(10));
			dsNhanVien.add(new NhanVienKyThuat(resultSet.getString(1), resultSet.getString(2), resultSet.getString(8),
					resultSet.getString(6), resultSet.getString(4), Integer.valueOf(resultSet.getString(3)),
					resultSet.getString(9), Integer.valueOf(resultSet.getString(7)), tKhoan, resultSet.getString(5)));
		}
		return dsNhanVien;
	}

	// get nhân viên mã nv
	public NhanVienKyThuat getNhanVienKyThuatTheoMa(String ma) throws SQLException {
		ConnectDB.getInstance();
		NhanVienKyThuat NhanVien = null;
		Connection connection = ConnectDB.getConnection();
		String sql = "SELECT * FROM [dbo].[NhanVienKiThuat] where maNhanVien ='" + ma + "'";
		Statement statement = connection.createStatement();
		ResultSet resultSet = statement.executeQuery(sql);
		TaiKhoan_DAO tKhoan_DAO = new TaiKhoan_DAO();
		TaiKhoan tKhoan;
		while (resultSet.next()) {
			tKhoan = tKhoan_DAO.getTaiKhoanTheoMa(resultSet.getString(10));
			NhanVien = new NhanVienKyThuat(resultSet.getString(1), resultSet.getString(2), resultSet.getString(8),
					resultSet.getString(6), resultSet.getString(4), Integer.valueOf(resultSet.getString(3)),
					resultSet.getString(9), Integer.valueOf(resultSet.getString(7)), tKhoan, resultSet.getString(5));
		}
		return NhanVien;
	}
}
