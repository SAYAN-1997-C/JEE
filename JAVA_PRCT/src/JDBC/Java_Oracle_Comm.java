package JDBC;

import java.sql.*;

class TestConnection {

	Connection cn = null;
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String select_sql = "select * from student";
	String insert_sql = "insert into student values(?,?,?)";
	String delete_sql = "delete from student where roll_no=?";
	String update_sql="update student set name=?,department=? where roll_no=?";

	public void insertData() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jee", "jee");
			ps = cn.prepareStatement(insert_sql);
			ps.setString(1, "4");
			ps.setString(2, "soumik");
			ps.setString(3, "cs");
			ps.executeUpdate();
			cn.commit();

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}

	public void DeleteData() {
		

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jee", "jee");
			ps = cn.prepareStatement(delete_sql);
			ps.setString(1, "4");
			ps.executeUpdate();
			cn.commit();

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
	public void updateData() {
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jee", "jee");
			ps = cn.prepareStatement(update_sql);
			ps.setString(1, "sayani");
			ps.setString(2, "physics");
			ps.setString(3, "1");
			ps.executeUpdate();
			cn.commit();

		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
	}
	public void getData() {

		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			cn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "jee", "jee");
			st = cn.createStatement();
			rs = st.executeQuery(select_sql);
			while (rs.next()) {
				System.out.println(rs.getString(1) + " ==> " + rs.getString(2) + " ==> " + rs.getString(3));
			}
		} catch (ClassNotFoundException ce) {
			ce.printStackTrace();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
}

public class Java_Oracle_Comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConnection ts = new TestConnection();
		//ts.insertData();
		//ts.DeleteData();
		ts.updateData();
		ts.getData();
	}

}
