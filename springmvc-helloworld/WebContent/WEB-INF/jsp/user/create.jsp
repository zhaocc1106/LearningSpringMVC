<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>create page</title>
</head>
<body>
	<form:form method="post" commandName="command">
	用户名:<input type="text" name="userName" value="${command.userName}" />
		<form:errors path="userName" cssStyle="color:red"></form:errors>
		<br>
	密码:<input type="text" name="password">
		<br>
		<input type="submit" value="新增">
	</form:form>
</body>
</html>