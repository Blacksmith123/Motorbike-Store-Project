package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

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
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		String sql = "delete from KhachHang where maKhachHang = '"+maKH+"'";
		try {
			PreparedStatement ps = con.prepareStatement(sql);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			e.printStackTrace();
		}
		con.close();
		return false;
	}
	
	// sua thong tin khach hang
	public boolean suaThongTinKhachHang(KhachHang kh) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("update KhachHang set hoKhachHang = ?, tenKhachHang = ?, diaChi = ?, soDienThoai = ?, email = ? where maKhachHang = ?");
			ps.setString(1, kh.getHo());
			ps.setString(2, kh.getTen());
			ps.setString(3, kh.getDiaChi());
			ps.setInt(4, kh.getSdt());
			ps.setString(5, kh.getEmail());
			ps.setString(6, kh.getMa());
		}
		finally {
			ps.close();
		}
		return ps.executeUpdate() > 0;
	}
	
	// get KhachHang theo ma
	public KhachHang getKhachHangTheoMa(String ma) throws SQLException {
		KhachHang kh = new KhachHang();
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from KhachHang where maKhachHang '"+ma+"'");
		while (resultSet.next()) {
			kh.setMa(ma);
			kh.setHo(resultSet.getString(2));
			kh.setTen(resultSet.getString(3));
			kh.setDiaChi(resultSet.getString(4));
			kh.setSdt(resultSet.getInt(5));
			kh.setEmail(resultSet.getString(6));
		}
		return kh;
	}
}
