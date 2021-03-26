<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri = "http://www.springframework.org/tags/form" prefix = "form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Edit Animal</title>
</head>
<body>
	<div align = "center">
		<h2>Edit Animal</h2>
		<form:form action = "save" method = "post" modelAttribute="animal">
		<table border ="0" cellpadding="5">
			<tr>
				<td>Name:</td>
				<td>
					${animal.name}
					<form:hidden path="name"/>
				</td>
				<td>Age:</td>
				<td><form:input path="age" /></td>
			</tr>
			<tr>
				<td>Hunger:</td>
				<td><form:input path="hunger" /></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="Save" /></td>
		</table>
		</form:form>
	</div>
</body>
</html>