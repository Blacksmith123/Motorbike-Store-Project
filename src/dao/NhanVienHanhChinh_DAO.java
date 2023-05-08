package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.NhanVienHanhChinh;
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
	//
}
