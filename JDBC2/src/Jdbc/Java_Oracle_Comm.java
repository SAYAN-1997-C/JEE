package Jdbc;

import java.sql.*;

class Query {

	Connection cn = null;
	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String select_sql = "select * from student";

	void getData() {

		try {
			Create_con obj = new Create_con();
			cn = obj.Con();
			st = cn.createStatement();
			rs=st.executeQuery(select_sql);
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" "+rs.getString(2)+" "+rs.getString(3));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}
}

public class Java_Oracle_Comm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Query q=new Query();
		q.getData();
	}

}
