<%@page import="com.gzechett.animal.base.Animal"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>New Elephant</title>
</head>
<body>
	<div align = "center">
		<h2>New Elephant</h2>
		<form:form action = "saveElephant" method = "post" modelAttribute="animal">
		<table border ="0" cellpadding="5">
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			<tr>
				<td>Age:</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
		</table>
		</form:form>
	</div>
</body>
</html>
<%

final String s = "gui";

final Animal a = null;


%>