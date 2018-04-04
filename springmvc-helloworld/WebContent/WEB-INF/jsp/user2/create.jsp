<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>create page</title>
</head>
<body>
<form method="post" action="${pageContext.request.contextPath }/user2">
	用户名:<input type="text" name="userName"><br>
	密码:<input type="text" name="password"><br>
	<input type="submit" name="create" value="新增">
</form>
</body>
</html>