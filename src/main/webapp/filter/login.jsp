<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Login Page</h4>
	<%-- 	<c:if test="${!empty requestScope.MSG }">${requestScope.MSG } <br> --%>
	<%-- 	</c:if> --%>
	<font color="red">${requestScope.MSG }</font>
	<form action="hello.jsp" method="post">

		username:<input type="text" name="name" value="${param.name }">
		<br> <br> password: <input type="text" name="password"
			value="${param.password }"> <br> <br> <input
			type="submit" value="submit">
	</form>
</body>
</html>