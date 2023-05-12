package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.NhaPhanPhoi;

public class NhaPhanPhoi_DAO {

	// them nha phan phoi
	public boolean themNhaPhanPhoi(NhaPhanPhoi nhaPhanPhoi) throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement("insert into NhaPhanPhoi values (?, ?, ?, ?, ?)");
		ps.setString(0, nhaPhanPhoi.getMa());
		ps.setString(1, nhaPhanPhoi.getTenNhaPhanPhoi());
		ps.setString(2, nhaPhanPhoi.getDiaChi());
		ps.setInt(3, nhaPhanPhoi.getSdt());
		ps.setString(4, nhaPhanPhoi.getEmail());
		ps.close();
		return ps.executeUpdate() > 0;
	}

	// xoa nha phan phoi theo ma
	public boolean xoaNhaPhanPhoiTheoMa(String ma) throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement("delete from NhaPhanPhoi where maNhaPhanPhoi = '" + ma + "'");
		ps.close();
		return ps.executeUpdate() > 0;
	}

	// sua nha phan phoi theo ma
	public boolean suaNhaPhanPhoi(NhaPhanPhoi nhaPhanPhoi) throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		Connection con = ConnectDB.getConnection();
		PreparedStatement ps = con.prepareStatement(
				"update NhaPhanPhoi set tenNhaPhanPhoi = ?, diaChi = ?, soDienThoai = ?, email = ? where maNhaPhanPhoi = ?");
		ps.setString(1, nhaPhanPhoi.getTenNhaPhanPhoi());
		ps.setString(2, nhaPhanPhoi.getDiaChi());
		ps.setInt(3, nhaPhanPhoi.getSdt());
		ps.setString(4, nhaPhanPhoi.getEmail());
		ps.setString(5, nhaPhanPhoi.getMa());
		ps.close();
		return ps.executeUpdate() > 0;
	}

	// get NhaPhanPhoi theo ma
	public NhaPhanPhoi getNhaPhanPhoiTheoMa(String ma) throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		Connection con = ConnectDB.getConnection();
		NhaPhanPhoi nhaPhanPhoi = new NhaPhanPhoi();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from NhaPhanPhoi where maNhaPhanPhoi = '" + ma + "'");
		while (resultSet.next()) {
			nhaPhanPhoi.setMa(ma);
			nhaPhanPhoi.setTenNhaPhanPhoi(resultSet.getString(2));
			nhaPhanPhoi.setDiaChi(resultSet.getString(3));
			nhaPhanPhoi.setSdt(resultSet.getInt(4));
			nhaPhanPhoi.setEmail(resultSet.getString(5));
		}
		return nhaPhanPhoi;
	}

	// get all NhaPhanPhoi
	public List<NhaPhanPhoi> getAllNhaPhanPhoi() throws SQLException {
		ConnectDB.getInstance();
		ConnectDB.connect();
		Connection con = ConnectDB.getConnection();
		Statement statement = con.createStatement();
		ResultSet resultSet = statement.executeQuery("select * from NhaPhanPhoi");
		List<NhaPhanPhoi> dsNhaPhanPhois = new ArrayList<NhaPhanPhoi>();
		while (resultSet.next()) {
			dsNhaPhanPhois.add(new NhaPhanPhoi(resultSet.getString(1), resultSet.getString(2), resultSet.getString(3),
					resultSet.getInt(4), resultSet.getString(5)));

		}
		return dsNhaPhanPhois;
	}
}
