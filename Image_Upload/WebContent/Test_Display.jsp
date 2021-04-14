<%@page import="master.DTO.SearchDTO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
      <%@page import="java.sql.*" %>
    <%@page import="java.io.*" %>
    <%@page import="master.*" %>
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

InputStream sImage;
ResultSet  rs;
SearchDTO sdto=new SearchDTO();
out.println(sdto.getHint());
PreparedStatement psmnt;
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("Connection loaded");
Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","jee","jee"); 
System.out.println("Connection created");
 psmnt = con.prepareStatement("select image from IMAGEAIN where id=?");
psmnt.setInt(1,Integer.parseInt(session.getAttribute("id1").toString())); // here integer number '11' is image id from the table
rs = psmnt.executeQuery();
if(rs.next()) {
	byte[] bytearray = new byte[1048576];
	int size=0;
	sImage = rs.getBinaryStream(1);
	response.reset();
	//response.setContentType("image/jpeg");
	//response.setContentType("application/pdf");
	response.setContentType("application/msword");
	response.getOutputStream().flush();
	while((size=sImage.read(bytearray))!= -1 ){
	response.getOutputStream().write(bytearray,0,size);
	}
	}
	}
	catch(Exception ex){
	out.println("error :"+ex);
	}
	
	%>
</body>
</html>