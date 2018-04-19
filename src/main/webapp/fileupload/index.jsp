<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>Index Page</h4>
	<form action="<%=request.getContextPath()%>/fileUploadServlet" method="post" enctype="multipart/form-data">
		file:<input type="file" name="file"> 
		<br> <br>
		desc:<input type="text" name="desc"> 
		<br> <br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>