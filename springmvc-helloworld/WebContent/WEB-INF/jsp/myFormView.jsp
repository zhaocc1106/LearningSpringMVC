<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>my form view.</title>
</head>
<body>
<!-- 表单 -->
<form method="post">
	userName:<input type="text" name="userName" value="${user.userName }"><br/>
	userPassword:<input type="password" name="userPassword" value="${user.password }"><br/>
	city:<select>
		<c:forEach items="${cityList }"  var="city">
			<option>${city}</option>
		</c:forEach>
	</select><br/>
	<input type="submit" name="submit"/>
</form>
</body>
</html>