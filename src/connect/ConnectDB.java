package connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	
	public static Connection con = null;
	public static ConnectDB instance = new ConnectDB();
	
	public static ConnectDB getInstance() {
		return instance;
	}
	
	public static void connect() throws SQLException {
		String url = "jdbc:sqlserver://localhost:1433;databaseName=BikeStores";
		String user = "sa";
		String pwd = "sapassword";
		con = DriverManager.getConnection(url, user, pwd);
	}
	
	public static void disconnect() throws SQLException {
		if(con != null) {
			con.close();
		}
	}
	
	public static Connection getConnection() {
		return con;
	}
}
