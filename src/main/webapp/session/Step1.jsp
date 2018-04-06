<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Step1:选择要购买的书籍</h1>
	<br>
	<form action="<%=request.getContextPath() %>/processStep1" method="post">
		<table border="1" cellpadding="10" cellspacing="0">
			<tr>
				<th>书名</th>
				<th>购买</th>
			</tr>
			<tr>
				<td>Jave</td>
				<td><input type="checkbox" name="book" value="java"></td>
			</tr>
			<tr>
				<td>Oracle</td>
				<td><input type="checkbox" name="book" value="oracle"></td>
			</tr>
			<tr>
				<td>Struts</td>
				<td><input type="checkbox" name="book" value="struts"></td>
			</tr>
			<tr>
				<td><input type="submit" value="继续"></td>
			</tr>
		</table>
	</form>
</body>
</html>