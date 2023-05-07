package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.ThongTinXe;

public class ThongTinXe_DAO {

	// them thong tin xe
	public boolean themThongTinXe(ThongTinXe thongTinXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into ThongTinXe values (?, ?, ?, ?, ?, ?)");
		
		ps.setString(1, thongTinXe.getMaLoaiXe());
		ps.setString(2, thongTinXe.getTenLoaiXe());
		ps.setInt(3, thongTinXe.getGiaNiemYet());
		ps.setInt(4, thongTinXe.getGiaGiam());
		ps.setString(5, thongTinXe.getMoTaXe());
		ps.setString(6, thongTinXe.getPhienBan());
		
		ps.close();
		
		return ps.executeUpdate() > 0;
	}
	
	// xoa thong tin xe theo ma
	public boolean xoaThongTinXeTheoMa(String maLoaiXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from ThongTinXe where maLoaiXe = '"+ maLoaiXe +"'");
		ps.close();
		return ps.executeUpdate() > 0;
	}
	
	// sua thong tin xe 
	public boolean suaThongTinXe(ThongTinXe thongTinXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement("update ThongTinXe set tenLoaiXe = ?, giaNiemYet = ?, giaGiam = ?, moTaXe = ?, phienBan = ? where maLoaiXe = ?");
		ps.setString(1, thongTinXe.getTenLoaiXe());
		ps.setInt(2, thongTinXe.getGiaNiemYet());
		ps.setInt(3, thongTinXe.getGiaGiam());
		ps.setString(4, thongTinXe.getMoTaXe());
		ps.setString(5, thongTinXe.getPhienBan());
		ps.close();
		return ps.executeUpdate() > 0;
	}
	
	// get thong tin xe theo ma
	public ThongTinXe getThongTinXeTheoMa(String maLoaiXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from ThongTinXe where maLoaiXe = '"+ maLoaiXe +"'");
		ThongTinXe thongTinXe = new ThongTinXe();
		while (resultSet.next()) {
			
			thongTinXe.setMaLoaiXe(maLoaiXe);
			thongTinXe.setTenLoaiXe(resultSet.getString(2));
			thongTinXe.setGiaNiemYet(resultSet.getInt(3));
			thongTinXe.setGiaGiam(resultSet.getInt(4));
			thongTinXe.setMoTaXe(resultSet.getString(5));
			thongTinXe.setPhienBan(resultSet.getString(6));
			
		}
		
		return thongTinXe;
	}
	
	// get danh sach thong tin xe
	public List<ThongTinXe> getAllThongTinXe() throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		List<ThongTinXe> dsThongTinXe = new ArrayList<ThongTinXe>();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from ThongTinXe");
		while (resultSet.next()) {
			dsThongTinXe.add(new ThongTinXe(resultSet.getString(1),resultSet.getString(2),resultSet.getInt(3),resultSet.getInt(4), resultSet.getString(5), resultSet.getString(6)));
		}
		return dsThongTinXe;
	}
	
	
	
}
