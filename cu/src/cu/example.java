package cu;

import java.sql.*;

class TestConnection{
	Connection cn = null;
	Statement st = null;
	ResultSet rs = null;
	String select_sql="select * from student12";
	public void getdata()
	{
		try
		{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		cn=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","sayan","oracle");
		st=cn.createStatement();
		rs=st.executeQuery(select_sql);
		while(rs.next()) {
			System.out.println(rs.getString(1));
			System.out.println(rs.getString(2));
		}
		}
		catch(ClassNotFoundException ce)
		{
			ce.printStackTrace();
		}
		catch(SQLException se)
		{
			se.printStackTrace();
		}
	}
}

public class example {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConnection ts=new TestConnection();
		ts.getdata();
	}

}
