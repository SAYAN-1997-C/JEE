package master.DAO;

import java.sql.*;

import master.DTO.StudentDTO;
import master.utilities.ConnectionFactory;

public class StudentDAO {

	PreparedStatement ps = null;
	String insert_sql = "insert into student values(?,?,?,?)";
	String delete_sql="delete from student where roll=?";
	
	ConnectionFactory obj = new ConnectionFactory();
	Connection cn = obj.getCon();

	public void InsertData(StudentDTO sdto) {
		try {
			ps = cn.prepareStatement(insert_sql);
			ps.setString(1, sdto.getRoll_no());
			ps.setString(2, sdto.getName());
			ps.setString(3, sdto.getGmail());
			ps.setString(4, sdto.getPhno());
			ps.executeUpdate();
			cn.commit();
		} catch (SQLException se) {
			se.printStackTrace();
		}

	}
	
	public void DeleteData(StudentDTO sdto) {
		
		try {
			ps=cn.prepareStatement(delete_sql);
			ps.setString(1, sdto.getRoll_no());
			ps.executeUpdate();
			cn.commit();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
	}

}
