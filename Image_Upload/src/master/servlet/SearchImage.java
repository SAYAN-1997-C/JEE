package master.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import master.DTO.SearchDTO;

/**
 * Servlet implementation class SearchImage
 */
public class SearchImage extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id=Integer.parseInt(request.getParameter("hint"));
		SearchDTO sdto=new SearchDTO();
		//sdto.setHint(id);
		HttpSession session=request.getSession();
		session.setAttribute("id1",id);
		response.sendRedirect("Test_Display.jsp");
	}

}
