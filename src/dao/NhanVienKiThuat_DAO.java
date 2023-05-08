package dao;

import java.sql.Connection;
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
					dsChinh.add(
							new NhanVienKyThuat(resultSet.getString(1),resultSet.getString(2), resultSet.getString(8), resultSet.getString(6),
									resultSet.getString(4), Integer.valueOf(resultSet.getString(3)), resultSet.getString(9),
									Integer.valueOf(resultSet.getString(7)), tKhoan, resultSet.getString(5)));
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return dsChinh;
		}
	//
}
