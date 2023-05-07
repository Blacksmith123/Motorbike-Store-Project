package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import connect.ConnectDB;
import entity.ChiTietHoaDon;
import entity.ThongTinXe;

public class ChiTietHoaDon_DAO {
	// trả về chi tiết hóa đơn
	public List<ChiTietHoaDon> getAllChiTietHoaDon() {
		ConnectDB.getInstance();
		List<ChiTietHoaDon> dsChiTietHoaDon = new ArrayList<ChiTietHoaDon>();
		ThongTinXe_DAO 
		Connection connection = ConnectDB.getConnection();
		try {
			String sqlString ="select * from ChiTietHoaDon";
			Statement statement = connection.createStatement();
			ResultSet rsResultSet = statement.executeQuery(sqlString);
			while (rsResultSet.next()) {
				dsChiTietHoaDon.add(new ChiTietHoaDon(rsResultSet.getString(1), null ,Integer.valueOf(rsResultSet.getString(3)),Integer.valueOf(rsResultSet.getString(4))));
				
			}
		}catch (SQLException e) {
			e.printStackTrace();
		}
		return dsChiTietHoaDon;
	}

	// thêm chi tiết hóa đơn
	public boolean themChiTietHoaDon(ChiTietHoaDon chiTietHoaDon) throws SQLException {
		ConnectDB.getInstance();
		Connection connection = ConnectDB.getConnection();
		PreparedStatement stmPreparedStatement = null;
		stmPreparedStatement = connection.prepareStatement("insert into ChiTietHoaDon values(?,?,?,?,?)");
		stmPreparedStatement.setString(1, chiTietHoaDon.getMa());
		stmPreparedStatement.setString(2, chiTietHoaDon.getTtXE().getMaLoai());
		stmPreparedStatement.setInt(3, chiTietHoaDon.getSoLuong());
		stmPreparedStatement.setInt(4, chiTietHoaDon.getDonGia());
		stmPreparedStatement.setInt(5, chiTietHoaDon.getThanhTien());
		stmPreparedStatement.close();
		return stmPreparedStatement.executeUpdate() > 0;
	}

}
