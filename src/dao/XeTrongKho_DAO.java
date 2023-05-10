package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.XeTrongKho;

public class XeTrongKho_DAO {

	public List<XeTrongKho> getXeTrongKhoTheoMaCuaHang(String maCuaHang) throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		Connection con = ConnectDB.getConnection();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from XeTrongKho where maCuaHang = '" + maCuaHang + "'");
		List<XeTrongKho> dsXeTrongKho = new ArrayList<XeTrongKho>();
		while (resultSet.next()) {
			dsXeTrongKho.add(new XeTrongKho(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3)));
		}
		return dsXeTrongKho;
	}
	
		// get xe trong kho theo ma cua hang va ma xe
		public XeTrongKho getXeTrongKhoTheoMaCuaHangVaMaXe(String maCuaHang, String maXe) throws SQLException {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from XeTrongKho where maCuaHang = '" + maCuaHang + "' and maXe = '" + maXe + "'");
			XeTrongKho xeTrongKho = new XeTrongKho();
			while (resultSet.next()) {
				xeTrongKho.setMaCuaHang(maCuaHang);
				xeTrongKho.setMaXe(maXe);
				xeTrongKho.setSoLuong(resultSet.getInt(3));
			}
			return xeTrongKho;
		}

		// get danh sach xe trong kho, get tat ca xe trong kho
		public List<XeTrongKho> getAllXeTrongKho() throws SQLException {
			ConnectDB.getInstance();
			Connection con = ConnectDB.getConnection();
			Statement statement = con.createStatement();
			ResultSet resultSet = statement.executeQuery("select * from XeTrongKho");
			List<XeTrongKho> dsXe = new ArrayList<XeTrongKho>();
			while (resultSet.next()) {
				dsXe.add(new XeTrongKho(resultSet.getString(1), resultSet.getString(2), resultSet.getInt(3)));

			}

			return dsXe;
		}
}
