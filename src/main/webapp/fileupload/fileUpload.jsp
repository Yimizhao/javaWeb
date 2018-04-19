<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h4>FileUpload Page</h4>
	<font color="red">${msg }</font>
	<form action="<%=request.getContextPath()%>/fileUploadServlet" method="post" enctype="multipart/form-data">
		<table>
			<tr class="file">
				<td>File1:</td>
				<td><input type="file" name="file1"/></td>
			</tr>
			<tr class="desc">
				<td>Desc1:</td>
				<td><input type="text" name="desc1"/></td>
			</tr>
			<tr>
				<td><input type="submit" id="submit" value="提交"/></td>
				<td><button id="addFile">新增一个附件</button></td>
			</tr>
		</table>
	</form>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/jquery-1.7.2.js"></script>
<script type="text/javascript" src="<%=request.getContextPath() %>/scripts/fileUpload.js"></script>
</body>
</html>