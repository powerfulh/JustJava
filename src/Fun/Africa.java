package Fun;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Africa {
	static class Sql {
		static String getBj = "select * from myBj";
	}
	public static void main(String[] args) {
//		String driver = "oracle.jdbc.driver.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:powerfulh";
		String id = "scott";
		String pw = "scott123153";
//		Class.forName(driver);
		Connection con;
		try {
			con = DriverManager.getConnection(url, id, pw);
			ResultSet rs = con.createStatement().executeQuery(Sql.getBj);
			while(rs.next()) {
				System.out.println(rs.getString("name"));
			}
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}