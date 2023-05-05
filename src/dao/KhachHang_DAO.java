package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import connect.ConnectDB;
import entity.KhachHang;

public class KhachHang_DAO {
	// them khach hang
	public boolean themKhachHang(KhachHang khachHang) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = null;
		String sql = "insert into KhachHang values (?, ?, ?, ?, ?, ?)";
		ps = con.prepareStatement(sql);
		ps.setString(1, khachHang.getMa());
		ps.setString(2, khachHang.getHo());
		ps.setString(3, khachHang.getTen());
		ps.setString(4, khachHang.getDiaChi());
		ps.setInt(5, khachHang.getSdt());
		ps.setString(6, khachHang.getEmail());
		ps.close();
		return ps.executeUpdate() > 0;
	}
	
	// xoa khach hang
	public boolean xoaKhachHang(String maKH) throws SQLException {
		Connection con = ConnectDB.getConnection();
		String sql = "update KhachHang where maKhachHang = '"+maKH+"'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.close();
		return false;
	}
}
