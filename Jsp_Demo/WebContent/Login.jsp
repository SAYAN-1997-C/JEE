<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%!
public int add(int a,int b)
{
	return a+b;
}
%>
<%
int a=10;
int b=20;

out.println(a+b);
out.println(add(99,99));

%>

</body>
</html>