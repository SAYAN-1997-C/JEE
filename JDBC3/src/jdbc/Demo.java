package jdbc;

import java.sql.*;

class TestConnection {

	Statement st = null;
	PreparedStatement ps = null;
	ResultSet rs = null;
	String select_sql = "Select * from employee";
	String insert_sql="insert into employee values(?,?,?)";
	String delete_sql="delete from employee where eid=?";
	String update_sql="update employee set ename=?,dept=? where eid=?";
	
	con obj=new con();
	Connection cn=obj.get();
	
	void retriveData() {

		try {
			st = cn.createStatement();
			rs=st.executeQuery(select_sql);
			while(rs.next())
			{
				System.out.println(rs.getString(1)+" ==> "+rs.getString(2)+" ==> "+rs.getString(3));
			}
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	void InsertData() {
		
		try {
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1, "e6");
			ps.setString(2, "pritam");
			ps.setString(3, "electrical");
			ps.executeUpdate();
			cn.commit();
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	void DeleteData() {
		String res;
		
		try {
			ps=cn.prepareStatement(delete_sql);
			ps.setString(1, "e1");
			ps.executeUpdate();
			cn.commit();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	void UpdateData() {
		try {
			ps=cn.prepareStatement(update_sql);
			ps.setString(1, "koushik");
			ps.setString(2, "BCA");
			ps.setString(3, "e6");
			ps.executeUpdate();
			cn.commit();
		} catch (SQLException se) {
			se.printStackTrace();
		}
	}
	
}

public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TestConnection ts=new TestConnection();
		//ts.InsertData();
		ts.DeleteData();
		//ts.UpdateData();
		ts.retriveData();
	}

}
