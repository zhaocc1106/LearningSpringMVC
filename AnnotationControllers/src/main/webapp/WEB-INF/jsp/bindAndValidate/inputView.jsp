<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>bind and validate input view</title>
</head>
<body>
	<form:form commandName="dataBinderTest">
	bool:<form:input path="bool" />
		<form:errors path="bool" cssStyle="color:red"></form:errors>
		<br>
	date:<form:input path="date" />
		<form:errors path="date" cssStyle="color:red"></form:errors>
		<br>
	phoneNumber:<form:input path="phoneNumber" />
		<form:errors path="phoneNumber" cssStyle="color:red"></form:errors>
		<br>
		<input type="submit" value="提交">
	</form:form>
</body>
</html>