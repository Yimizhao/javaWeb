<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>C的页面</h1>
	<%
		out.println(pageContext.getAttribute("pageContextAttribute"));
	%>
	<br>
	<%
		out.println(request.getAttribute("requestAttribute"));
	%>
	<br>
	<%
		out.println(session.getAttribute("sessionAttribute"));
	%>
	<br>
	<%
		out.println(application.getAttribute("applicationAttribute"));
	%>
</body>
</html>