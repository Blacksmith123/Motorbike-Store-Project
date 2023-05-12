package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import connect.ConnectDB;
import entity.ThongTinXe;

public class ThongTinXe_DAO {

	// them thong tin xe
	public boolean themThongTinXe(ThongTinXe thongTinXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
<<<<<<< HEAD
		PreparedStatement ps = con.prepareStatement("insert into ThongTinXe values (?, ?, ?, ?, ?, ?)");

		ps.setString(1, thongTinXe.getMaLoaiXe());
		ps.setString(2, thongTinXe.getTenLoaiXe());
		ps.setInt(3, thongTinXe.getGiaNiemYet());
		ps.setInt(4, thongTinXe.getGiaGiam());
		ps.setString(5, thongTinXe.getMoTaXe());
		ps.setString(6, thongTinXe.getPhienBan());

		ps.close();

		return ps.executeUpdate() > 0;
=======
		try {

			PreparedStatement ps = con.prepareStatement("insert into ThongTinXe values (?, ?, ?, ?, ?, ?)");
			ps.setString(1, thongTinXe.getMaLoaiXe());
			ps.setString(2, thongTinXe.getTenLoaiXe());
			ps.setInt(3, thongTinXe.getGiaNiemYet());
			ps.setInt(4, thongTinXe.getGiaGiam());
			ps.setString(5, thongTinXe.getMoTaXe());
			ps.setString(6, thongTinXe.getPhienBan());

			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		con.close();
		return false;
>>>>>>> f4eead33721ed4294a5b1046937665d4ba3bde3a
	}

	// xoa thong tin xe theo ma
	public boolean xoaThongTinXeTheoMaLoaiXe(String maLoaiXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = null;
		try {
			ps = con.prepareStatement("delete from ThongTinXe where maLoaiXe = '" + maLoaiXe + "'");
<<<<<<< HEAD
			ps.close();
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			JOptionPane.showMessageDialog(null, "Phải xóa Xe và Xe Trong Kho có mã loại '" + maLoaiXe + "'");
=======
			return ps.executeUpdate() > 0;
		} catch (SQLException e) {
			// TODO Auto-generated catch block
>>>>>>> f4eead33721ed4294a5b1046937665d4ba3bde3a
			e.printStackTrace();
		}
		ps.close();
		return false;

	}

	// sua thong tin xe
<<<<<<< HEAD
	public boolean suaThongTinXe(ThongTinXe thongTinXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement(
				"update ThongTinXe set tenLoaiXe = ?, giaNiemYet = ?, giaGiam = ?, moTaXe = ?, phienBan = ? where maLoaiXe = ?");
		ps.setString(1, thongTinXe.getTenLoaiXe());
		ps.setInt(2, thongTinXe.getGiaNiemYet());
		ps.setInt(3, thongTinXe.getGiaGiam());
		ps.setString(4, thongTinXe.getMoTaXe());
		ps.setString(5, thongTinXe.getPhienBan());
		ps.close();
		return ps.executeUpdate() > 0;
=======
	public boolean suaThongTinXe(ThongTinXe thongTinXe, String maLoaiXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		try {
			PreparedStatement ps = con.prepareStatement(
					"update ThongTinXe set tenLoaiXe = ?, giaNiemYet = ?, giaGiam = ?, moTaXe = ?, phienBan = ? where maLoaiXe = ?");
			ps.setString(1, thongTinXe.getTenLoaiXe());
			ps.setInt(2, thongTinXe.getGiaNiemYet());
			ps.setInt(3, thongTinXe.getGiaGiam());
			ps.setString(4, thongTinXe.getMoTaXe());
			ps.setString(5, thongTinXe.getPhienBan());
			ps.setString(6, maLoaiXe);
			return ps.executeUpdate() > 0;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		con.close();
		return false;

>>>>>>> f4eead33721ed4294a5b1046937665d4ba3bde3a
	}

	// get thong tin xe theo ma
	public ThongTinXe getThongTinXeTheoMa(String maLoaiXe) throws SQLException {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
<<<<<<< HEAD
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from ThongTinXe where maLoaiXe = '" + maLoaiXe + "'");
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

=======
		ThongTinXe thongTinXe = new ThongTinXe();
		try {
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from ThongTinXe where maLoaiXe = '" + maLoaiXe + "'");
			
			while (resultSet.next()) {

				thongTinXe.setMaLoaiXe(maLoaiXe);
				thongTinXe.setTenLoaiXe(resultSet.getString(2));
				thongTinXe.setGiaNiemYet(resultSet.getInt(3));
				thongTinXe.setGiaGiam(resultSet.getInt(4));
				thongTinXe.setMoTaXe(resultSet.getString(5));
				thongTinXe.setPhienBan(resultSet.getString(6));

			}
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return thongTinXe;
	}

	// get thong tin xe theo ten
		public ThongTinXe getThongTinXeTheoTen(String tenLoaiXe) throws SQLException {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			ThongTinXe thongTinXe = new ThongTinXe();
			try {
				Statement statement = con.createStatement();
				ResultSet resultSet = statement.executeQuery("select * from ThongTinXe where tenLoaiXe = '" + tenLoaiXe + "'");
				
				while (resultSet.next()) {

					thongTinXe.setMaLoaiXe(resultSet.getString(1));
					thongTinXe.setTenLoaiXe(resultSet.getString(2));
					thongTinXe.setGiaNiemYet(resultSet.getInt(3));
					thongTinXe.setGiaGiam(resultSet.getInt(4));
					thongTinXe.setMoTaXe(resultSet.getString(5));
					thongTinXe.setPhienBan(resultSet.getString(6));

				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
			return thongTinXe;
		}
	
>>>>>>> f4eead33721ed4294a5b1046937665d4ba3bde3a
	// get danh sach thong tin xe
	public List<ThongTinXe> getAllThongTinXe() {
		ConnectDB.getInstance();
		Connection con = ConnectDB.getConnection();
		List<ThongTinXe> dsThongTinXe = new ArrayList<ThongTinXe>();
<<<<<<< HEAD
		Statement statement;
		try {
			statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from ThongTinXe");
=======
		try {
			PreparedStatement ps = con.prepareStatement("select * from ThongTinXe");
			ResultSet resultSet = ps.executeQuery();
>>>>>>> f4eead33721ed4294a5b1046937665d4ba3bde3a
			while (resultSet.next()) {
				dsThongTinXe.add(new ThongTinXe(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3),
						resultSet.getInt(4), resultSet.getString(5), resultSet.getString(6)));
			}
<<<<<<< HEAD
			return dsThongTinXe;
		} catch (SQLException e) {
			System.out.println("123");
//			e.printStackTrace();
=======
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
>>>>>>> f4eead33721ed4294a5b1046937665d4ba3bde3a
		}

		return dsThongTinXe;
	}

}
