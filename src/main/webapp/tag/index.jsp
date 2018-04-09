<%@page import="java.util.HashMap"%>
<%@page import="java.util.Map"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.zym.javaweb.mvc.domain.Customer"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@taglib uri="http://www.zym.com/mytag/core" prefix="zym"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%-- 	<zym:hello value="${param.name }" count="${param.count }"/> --%>
	<%-- 	<zym:MAX num2="-1" num1="0" /> --%>
	<!-- 	<br> -->
	<%-- 	<zym:MAX num2="0" num1="0" /> --%>
	<!-- 	<br> -->
	<%-- 	<zym:MAX num2="0" num1="1" /> --%>
	<!-- 	<br> -->
	<%-- 	<zym:MAX num2="5" num1="22" /> --%>
	<zym:printUpper count="9">yds</zym:printUpper>

	<br>
	<%
		// 		List<Customer> customers = new ArrayList<Customer>();
		// 		customers.add(new Customer("AAA", "aaa", "111"));
		// 		customers.add(new Customer("BBB", "bbb", "222"));
		// 		customers.add(new Customer("CCC", "ccc", "333"));
		// 		customers.add(new Customer("DDD", "ddd", "444"));
		// 		customers.add(new Customer("EEE", "eee", "555"));
		// 		request.setAttribute("customers", customers);
		Map<Integer, Customer> customers = new HashMap<Integer, Customer>();
		customers.put(1, new Customer("AAA", "aaa", "111"));
		customers.put(2, new Customer("BBB", "bbb", "222"));
		customers.put(3, new Customer("CCC", "ccc", "333"));
		customers.put(5, new Customer("EEE", "eee", "555"));
		customers.put(9, new Customer("DDD", "ddd", "444"));
		request.setAttribute("customers", customers);
	%>

	<%-- 	<zym:forEach items="${requestScope.customers }" var="customer"> --%>
	<zym:forEach items="${customers }" var="customer">
	${customer.key} -- ${customer.value.name} -- ${customer.value.address} -- 	${customer.value.phone}
<%-- 	${customer.name} -- ${customer.address} -- 	${customer.phone} --%>
		<br>
	</zym:forEach>
		${fn:length(param.name) }
<%-- 	${zym:length(param.name) } --%>
	<br>
	<c:set var="age" value="20" scope="request"></c:set>
	<c:if test="${requestScope.age  >= 18}"> 成年了</c:if>
	<c:choose>
		<c:when test=""></c:when>
		<c:otherwise></c:otherwise>
	</c:choose>
</body>
</html>