<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>list page</title>
</head>
<body>
<a href="${pageContext.request.contextPath }/user/create">新增用户</a><br>
<table border="1" width="50%">
	<tr>
		<th>用户名</th>
		<th>密码</th>
	</tr>
	<c:forEach items="${userList }" var="user">
		<tr>
			<td>${user.userName }</td>
			<td>${user.password }</td>
			<td>
				<a href="${pageContext.request.contextPath }/user/update?userName=${user.userName }">更新</a>
				<a href="${pageContext.request.contextPath }/user/delete?userName=${user.userName }">删除</a>
			</td>
		</tr>
	</c:forEach>
</table>
</body>
</html>