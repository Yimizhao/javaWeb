<%@page import="java.util.List"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h5>学生信息页面</h5>
	<%
		List<String> studentsList;
		Object studentsObject = request.getAttribute("students");
		studentsList = (List<String>)studentsObject;
		out.print(studentsList.toString());
	%>
</body>
</html>