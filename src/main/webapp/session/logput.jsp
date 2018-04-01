<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	sessionID:<%=session.getId()%>
	<br>
	<br> IsNew:<%=session.isNew()%>
	<br>
	<br> MaxInactiveInterval:<%=session.getMaxInactiveInterval()%>
	<br>
	<br> createtime:<%=session.getCreationTime()%>
	<br>
	<br> LastAccessedTime:<%=session.getLastAccessedTime()%>
	<br>
	<br> bye：<%=session.getAttribute("username")%>
	<br><br>
	<a href="login.jsp">重新登录</a>
	<%
		session.invalidate();
	%>
</body>
</html>