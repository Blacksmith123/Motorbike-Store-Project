package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.CuaHang;

public class CuaHang_DAO {
	
	// them cua hang
	public boolean themCuaHang(CuaHang cuaHang) throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into CuaHang values (?, ?, ?, ?, ?, ?, ?, ?)");
		ps.setString(1, cuaHang.getMa());
		ps.setString(2, cuaHang.getTen());
		ps.setInt(3, cuaHang.getSdt());
		ps.setString(4, cuaHang.getEmail());
		ps.setString(5, cuaHang.getDuong());
		ps.setString(6, cuaHang.getThanhPho());
		ps.setString(7, cuaHang.getTinhTrang());
		ps.setInt(8, cuaHang.getMaBuuDien());
		ps.close();
		return ps.executeUpdate() > 0;
	}
	
	// xoa cua hang theo ma
	public boolean xoaCuaHangTheoMa(String ma) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from CuaHang where maCuaHang = '" + ma + "'");
		ps.close();
		return ps.executeUpdate() > 0;
	}

	// sua thong tin cua hang
	public boolean suaThongTinCuaHang(CuaHang cuaHang) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement(
				"update CuaHang set tenCuaHang = ?, soDienThoai = ?, email = ?, duong = ?, thanhPho = ?, tinhTrang = ?, maBuuDien = ? where maCuuHang = ?");
		ps.setString(1, cuaHang.getTen());
		ps.setInt(2, cuaHang.getSdt());
		ps.setString(3, cuaHang.getEmail());
		ps.setString(4, cuaHang.getDuong());
		ps.setString(5, cuaHang.getThanhPho());
		ps.setString(6, cuaHang.getTinhTrang());
		ps.setInt(7, cuaHang.getMaBuuDien());
		ps.setString(8, cuaHang.getMa());
		ps.close();

		return ps.executeUpdate() > 0;
	}

	// get cua hang theo ma
	public CuaHang getCuaHangTheoMa(String ma) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from CuaHang where maCuaHang = '" + ma + "'");
		CuaHang cuaHang = new CuaHang();
		while (resultSet.next()) {
			cuaHang.setMa(ma);
			cuaHang.setTen(resultSet.getString(2));
			cuaHang.setSdt(resultSet.getInt(3));
			cuaHang.setEmail(resultSet.getString(4));
			cuaHang.setDuong(resultSet.getString(5));
			cuaHang.setThanhPho(resultSet.getString(6));
			cuaHang.setTinhTrang(resultSet.getString(7));
			cuaHang.setMaBuuDien(resultSet.getInt(8));
		}
		return cuaHang;
	}
	
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
				dsCuaHang.add(new CuaHang(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3), resultSet.getString(4), resultSet.getString(5), resultSet.getString(6), resultSet.getString(7), resultSet.getInt(8)));
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return dsCuaHang;
	}
}
