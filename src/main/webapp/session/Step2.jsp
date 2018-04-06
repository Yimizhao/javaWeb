<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Step2:客户信息</h1>
	<form action="<%=request.getContextPath() %>/processStep2" method="post">
		<table border="1" cellpadding="10" cellspacing="0">

			<tr>
				<td>基本信息</td>
			</tr>
			<tr>
				<td>姓名</td>
				<td><input type="text" name="name"></td>
			</tr>
			<tr>
				<td>寄送地址</td>
				<td><input type="text" name="address"></td>
			</tr>
			<tr>
				<td>信用卡信息</td>
			</tr>
			<tr>
				<td>种类</td>
				<td><input type="radio" name="cardType" value="visa">Visa
					<br> <input type="radio" name="cardType" value="master">Master</td>
			</tr>
			<tr>
				<td>卡号</td>
				<td><input type="text" name="cardNumber"></td>
			</tr>
			<tr>
				<td><input type="submit" value="继续"></td>
			</tr>
		</table>
	</form>
</body>
</html>