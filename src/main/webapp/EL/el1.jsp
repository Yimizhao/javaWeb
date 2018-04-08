<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>EL试验一</h4>
	<form action="${pageContext.request.contextPath}/EL/el2.jsp">
		<p>
			name:<input type="text" name="name" size="15">
		</p>
		<p>
			password:<input type="text" name="password" size="15">
		</p>
		<p>
			sex:<input type="radio" name="sex" value="man"> man<input
				type="radio" name="sex" value="women"> women
		</p>
		<p>
			old:<select name="old">
				<option value="10">10 - 20</option>
				<option value="20" selected>20 - 30</option>
				<option value="30">30 - 40</option>
				<option value="40">40 - 50</option>
			</select>
		</p>
		<p>
			habit: <input type="checkbox" name="habit" value="read"> read
			<input type="checkbox" name="habit" value="baskatbool">
			baskatbool <input type="checkbox" name="habit" value="footbool">
			footbool <input type="checkbox" name="habit" value="movie">
			movie
		</p>

		<p>
			<input type="submit" value="submit"> <input type="reset"
				value="reset">

		</p>
	</form>
</body>
</html>