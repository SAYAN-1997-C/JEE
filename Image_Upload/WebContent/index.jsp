<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="java.sql.*" %>
    <%@page import="java.io.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
try
{
	Class.forName("oracle.jdbc.driver.OracleDriver");
	System.out.println("Connection loaded");
	Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee"); 
	System.out.println("Connection created");
	String ll=request.getParameter("user_file");
	String lo=request.getParameter("hint");
	File imgfile = new File(ll);
	FileInputStream fin = new FileInputStream(imgfile);
	PreparedStatement pre = con.prepareStatement("insert into IMAGEAIN(id,image) values(?,?)");
	pre.setString(1,lo);
	pre.setBinaryStream(2,fin,(int)imgfile.length());
	pre.executeUpdate();
	pre.close();
}
catch(Exception E){ out.println("the eror is  "+ E);}
	

%>
<p><a href="Search.jsp">Search</a>
</body>
</html>