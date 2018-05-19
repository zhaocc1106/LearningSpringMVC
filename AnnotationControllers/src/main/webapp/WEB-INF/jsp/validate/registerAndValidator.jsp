<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<form:form commandName="user">
<form:errors path="*" cssStyle="color:red"></form:errors><br/>
username:<form:input path="username"/>
<form:errors path="username" cssStyle="color:red"></form:errors>
<br/>

password:<form:password path="pwd"/>
<form:errors path="pwd" cssStyle="color:red"></form:errors>
<br/>
<input type="submit" value="注册"/>
</form:form>
