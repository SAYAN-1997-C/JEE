<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form action="StudentAddServe" method="post">
		<table>
			<tr>
				<td><label>Name : </label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>Roll No : </label></td>
				<td><input type="text" name="roll"></td>
			</tr>
			<tr>
				<td><input type="submit" value="Save"></td>
			</tr>
		</table>
	</form>
</body>
</html>