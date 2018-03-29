<%@page import="com.zym.javaweb.mvc.domain.Student"%>
<%@page
	import="org.apache.taglibs.standard.tag.common.core.ForEachSupport"%>
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
	<h1>学生信息页面</h1>
	<table border="1" cellpadding="10" cellspacing="0">
		<tr>
			<th>Id</th>
			<th>name</th>
			<th>location</th>
			<th>gender</th>
			<th>grade</th>
			<th>删除</th>
		</tr>
		<%
			List<Student> studentsList;
			Object studentsObject = request.getAttribute("students");
			studentsList = (List<Student>) studentsObject;
			for (Student student : studentsList) {
		%>
		<tr>
			<td><%=student.getId()%></td>
			<td><%=student.getName()%></td>
			<td><%=student.getLocation()%></td>
			<td><%=student.getGender()%></td>
			<td><%=student.getGrade()%></td>
			<td><a href="studentsServlset?deleteId=<%=student.getId()%>">delete</a></td>
		</tr>
		<%
			}
		%>

	</table>

</body>
</html>