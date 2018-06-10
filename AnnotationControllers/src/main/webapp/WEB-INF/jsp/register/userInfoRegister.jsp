<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>user register</title>
</head>
<body>
<form method="post">
name:<input type="text" name="name" value="${user.name }" /><br>
password:<input type="text" name="password" value="${user.password}" /><br>
email:<input type="text" name="email" value="${user.email }"/><br>
<input type="submit" name="submit" value="提交" />
</form>
</body>
</html>