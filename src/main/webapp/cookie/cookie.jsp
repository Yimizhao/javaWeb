<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8" session="false"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
		Cookie[] cookies = request.getCookies();
		if (cookies != null && cookies.length > 0) {
			for (Cookie cookie : cookies) {
				out.print(cookie.getName() + ":" + cookie.getValue());
			}
		} else {
			out.print("创建Cookie");
			Cookie cookie = new Cookie("name", "zym");
// 			cookie.setMaxAge(expiry)
			response.addCookie(cookie);
		}
	%>

</body>
</html>