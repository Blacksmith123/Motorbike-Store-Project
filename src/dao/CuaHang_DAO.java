package dao;

import java.security.interfaces.RSAKey;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.CuaHang;

public class CuaHang_DAO {
	// get danh sach cua hang
	public List<CuaHang> getAllCuaHang(){
		ConnectDB.getInstance();
		Connection connection = ConnectDB.getConnection();
		List<CuaHang> dsCuaHang = new ArrayList<CuaHang>();
		try {
			String sqString = "select * from CuaHang";
			Statement statement = connection.createStatement();
			ResultSet resultSet = statement.executeQuery(sqString);
			while (resultSet.next()) {
				dsCuaHang.add(new CuaHang(resultSet.getString(1), resultSet.getString(2), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7),Integer.valueOf(resultSet.getString(3)), Integer.valueOf(resultSet.getString(8))));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return dsCuaHang;
	}
}
