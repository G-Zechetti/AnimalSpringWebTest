<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Search Result</title>
</head>
<body>
	<div align="center">
		<h1>Search Result</h1>
			<table border = "1" cellpadding = "5">
				<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Hunger</th>
				</tr>
			
				<c:forEach items="${result}" var="animal">
				<tr>
					<td> ${animal.name}</td>
					<td> ${animal.age}</td>
					<td> ${animal.hunger}</td>
				</tr>
				</c:forEach>
			</table>
	</div>
	<h1>${message}</h1>
</body>
</html>