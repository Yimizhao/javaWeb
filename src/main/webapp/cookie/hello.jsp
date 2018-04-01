<%@page import="java.util.Objects"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Object name = request.getParameter("name");

		if (name != null && !name.equals("")) {
			Cookie cookie = new Cookie("name", Objects.toString(name));
			cookie.setMaxAge(10);
			response.addCookie(cookie);
		} else {
			Cookie[] cookies = request.getCookies();
			if (cookies != null && cookies.length > 0) {
				for (Cookie cookie : cookies) {
					if ("name".equals(cookie.getName())) {
						name = cookie.getValue();
					}
				}
			}
		}
		
		if (name != null && !name.equals("")) {
			out.print("hello : " + name);
		} else {
			response.sendRedirect("login.jsp");
		}
	%>

</body>
</html>