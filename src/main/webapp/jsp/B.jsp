<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>B的页面</h1>
	<%
		pageContext.setAttribute("pageContextAttribute", "pageContextAttributeValue");
		request.setAttribute("requestAttribute", "requestAttributeValue");
		session.setAttribute("sessionAttribute", "sessionAttributeValue");
		application.setAttribute("applicationAttribute", "applicationAttributeValue");
	%>

	<!-- 请求转发-->
	<%
		String path = "/jsp/C.jsp";
		request.getRequestDispatcher(path).forward(request, response);
	%>
	<%--

	<!-- 重定向 -->
	<%
		String path = "C.jsp";
		response.sendRedirect(path);
	%>
	--%>
</body>
</html>