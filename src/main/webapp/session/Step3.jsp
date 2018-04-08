<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h1>Step3:订单确认</h1>
	<table border="1" cellpadding="10" cellspacing="0">

		<tr>
			<td>顾客姓名</td>
			<td><input type="text" name="name"
				value=<%=session.getAttribute("name")%>></td>
		</tr>
		<tr>
			<td>地址</td>
			<td><input type="text" name="address"
				value=<%=session.getAttribute("address")%>></td>
		</tr>
		<tr>
			<td>付款信息</td>
		</tr>
		<tr>
			<td>信用卡类型</td>
			<td><input type="text"
				value=<%=session.getAttribute("cardType")%>>
		</tr>
		<tr>
			<td>卡号</td>
			<td><input type="text" name="cardNumber"
				value=<%=session.getAttribute("cardNumber")%>></td>
		</tr>
		<tr>
			<td>订货项目</td>
		</tr>
		<tr>

			<td></td>
			<td>
				<%
					String[] bookItems = null;
					if (session.getAttribute("bookItems") != null) {

						bookItems = (String[]) session.getAttribute("bookItems");
						for (String book : bookItems) {
							out.print(book);
							out.print("<br>");
						}
					}
				%>
			</td>
		</tr>
	</table>
</body>
</html>