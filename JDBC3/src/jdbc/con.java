package jdbc;

import java.sql.*;

public class con {

	Connection cn = null;

	Connection get() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","jee","jee");
		} catch (ClassNotFoundException xe) {
			xe.printStackTrace();
		}catch (SQLException se) {
			se.printStackTrace();
		}
		return cn;
	}
}
