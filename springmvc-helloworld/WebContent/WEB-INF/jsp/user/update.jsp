<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>create page</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/user/update" method="post">
	用户名:<input type="text" name="userName" value="${command.userName }"><br>
	密码:<input type="text" name="password" value="${command.password }"><br>
	<input type="submit" value="更新">
</form>
</body>
</html>