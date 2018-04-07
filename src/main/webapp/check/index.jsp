<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<font color="red">
	<%=request.getSession().getAttribute("MEG") == null ? ""
					: request.getSession().getAttribute("MEG") + ""%>
</font>
	<form action="<%=request.getContextPath()%>/checkCodeServlet"
		method="post">
		<table>
			<tr>
				<td>name:</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>checkCode:</td>
				<td><input type="text" name="CHECK_CODE_PRAM_KEY"></td>
			</tr>
			<tr>
				<td><img alt=""
					src="<%=request.getContextPath()%>/validateColorServlet"></td>
			</tr>
			<tr>
				<td><input type="submit" value="submit"></td>
			</tr>
		</table>
	</form>

</body>
</html>