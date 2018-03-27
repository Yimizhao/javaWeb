<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%
		pageContext.setAttribute("pageContextAttr", "pageContextValue");
		request.setAttribute("requestAttr", "requestValue");
		session.setAttribute("sessionAttr", "sessionValue");
		application.setAttribute("applicationAttr", "applicationValue");
	%>
	pageContext:<%=pageContext.getAttribute("pageContextAttr")%>
	<br>
	request:<%=request.getAttribute("requestAttr")%>
	<br>
	session:<%=session.getAttribute("sessionAttr")%>
	<br>
	application:<%=application.getAttribute("applicationAttr")%>
	<br>
	<a href="../jspBak/AttrTest1.jsp"> to AtteTest1.jsp</a>
	<br>
	<a href="../arrTest"> to Servlet arrTest</a>
</body>
</html>