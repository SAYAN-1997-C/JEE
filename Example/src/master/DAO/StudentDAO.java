package master.DAO;

import java.sql.*;

import master.DTO.StudentDTO;
import master.utilities.ConnectionFactory;

public class StudentDAO {

	PreparedStatement ps=null;
	String insert_sql="insert into studentex values(?,?)";
	
	ConnectionFactory cobj=new ConnectionFactory();
	Connection cn=cobj.getCon();
	
	public void InsertData(StudentDTO sdto) {
		
		try {
			ps=cn.prepareStatement(insert_sql);
			ps.setString(1,sdto.getName());
			ps.setString(2,sdto.getRoll());
			ps.executeUpdate();
			cn.commit();
		} catch (SQLException se) {
			se.printStackTrace();
		}
		
	}
}
