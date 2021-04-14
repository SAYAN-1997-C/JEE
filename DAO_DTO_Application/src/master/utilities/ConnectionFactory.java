package master.utilities;

import java.sql.*;

public class ConnectionFactory {

	Connection cn = null;

	public Connection getCon() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jee","jee");
		} catch (ClassNotFoundException xe) {
			xe.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		return cn;
	}
}
