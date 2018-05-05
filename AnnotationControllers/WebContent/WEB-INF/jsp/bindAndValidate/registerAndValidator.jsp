<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<form:form commandName="user">
	<br />
username:<form:input path="userName" />
	<form:errors path="userName" cssStyle="color:red"></form:errors>
	<br />
password:<form:password path="password" />
	<form:errors path="password" cssStyle="color:red"></form:errors>
	<br />
	<input type="submit" value="注册" />
</form:form>