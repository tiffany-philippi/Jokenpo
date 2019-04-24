package joguinho;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BancoDados {

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = DriverManager.getConnection("jdbc:mysql://localhost" + "/obra?user=root");
		} catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			conn.close();
		} catch (SQLException e) {
			//TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
