<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>base info page</title>
</head>
<body>
<form method="post">
	用户名:<input type="text" name="userName" value="${user.userName }"/><br>
	密码:<input type="text" name="password" value="${user.password }"><br>
	真实姓名:<input type="text" name="realName" value="${user.realName }"><br>
	<input type="submit" name="_target1" value="下一步">
</form>
</body>
</html>