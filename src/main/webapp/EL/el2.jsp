<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>EL试验二</h4>
	<p>name:${param.name }</p>
	<p>password:${param.password }</p>
	<p>sex:${param.sex }</p>
	<p>old:${param.old }</p>
	<p>
		<!-- 	复数param的获取 -->
		habit: ${paramValues.habit[0] } <br> ${paramValues.habit[1] }
	</p>

</body>
</html>