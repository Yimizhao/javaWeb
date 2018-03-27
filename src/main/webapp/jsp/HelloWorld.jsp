<%@page import="java.util.Enumeration"%>
<%@page import="java.util.Iterator"%>
<%@page import="org.apache.jasper.tagplugins.jstl.core.ForEach"%>
<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%-- 	<% Date date = new Date();  --%>
<!-- // out.print(date); -->
<!-- // requset -->
<!-- // 	Enumeration names = request.getParameterNames(); -->
<!-- // 	while (names.hasMoreElements()) { -->
<!-- // 		out.print(names.nextElement()); -->
<%-- 		%> --%>
<!-- 		<br> -->
<%-- 		<% --%>
<!-- // 	} -->
<%-- 	%> --%>
<!-- 	<br> -->
<%-- 	<% --%>
<!-- // 	out.print(request.getParameter("name")); -->
<%-- 	%> --%>
<!-- 	<br> -->
<%-- 	<% --%>
<!-- // 	out.print(request.getParameter("password")); -->
<%-- 	%> --%>
<% 

 out.println(config.getInitParameter("test"));


%>
	
</body>
</html>