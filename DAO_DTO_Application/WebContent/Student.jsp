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
				<td><label>ENTER ROLL NO : </label></td>
				<td><input type="text" name="roll_no"></td>
			</tr>
			<tr>
				<td><label>ENTER NAME : </label></td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td><label>ENTER GMAIL : </label></td>
				<td><input type="text" name="gmail"></td>
			</tr>
			<tr>
				<td><label>ENTER PHONE NO : </label></td>
				<td><input type="text" name="phno"></td>
			</tr>
			<tr>
				<td><input type="submit" value="INSERT"></td>
			</tr>
			
		</table>
	</form>
</body>
</html>