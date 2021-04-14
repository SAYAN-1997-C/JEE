package master.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import master.DAO.StudentDAO;
import master.DTO.StudentDTO;

/**
 * Servlet implementation class StudentAddServe
 */
public class StudentAddServe extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		String name=request.getParameter("name");
		String roll=request.getParameter("roll");
		
		StudentDTO sdto=new StudentDTO();
		sdto.setName(name);
		sdto.setRoll(roll);
		
		StudentDAO sdao=new StudentDAO();
		sdao.InsertData(sdto);
		response.sendRedirect("show.jsp");
	}

}
