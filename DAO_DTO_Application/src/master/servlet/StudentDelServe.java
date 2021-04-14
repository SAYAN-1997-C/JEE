package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.StudentDAO;
import master.DTO.StudentDTO;

/**
 * Servlet implementation class StudentDelServe
 */
public class StudentDelServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String roll_no=request.getParameter("roll_no");
		
		StudentDTO sdto=new StudentDTO();
		sdto.setRoll_no(roll_no);
		
		StudentDAO sdao=new StudentDAO();
		sdao.DeleteData(sdto);
		response.sendRedirect("Del.jsp");
	}

}
