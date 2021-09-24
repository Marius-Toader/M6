import java.sql.*;

public class Connexio {
	static final String DB_URL = "jdbc:mysql://localhost:3306/alumnes";
	static final String USER = "root";
	static final String PASS = "";
	
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
			System.out.println("Connexió amb DriverManager");
			conn.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}