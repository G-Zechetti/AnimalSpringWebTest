<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Animal Manager</title>
</head>
<body>
	<div align="center">
		<h1>Animal Manager</h1>
			<form method="get" action="search">
				<input type="text" name="keyword" />
				<input type="submit" value="Search" />
			</form>
			<h3><a href= "newLion">New Lion</a> || <a href= "newElephant">New Elephant</a> || <a href= "newMonkey">New Monkey</a> || <a href= "newTiger">New Tiger</a></h3>
			<table border = "1" cellpadding = "5">
				<tr>
				<th>Name</th>
				<th>Age</th>
				<th>Hunger</th>
				<th>Action</th>
				</tr>
			
				<c:forEach items="${listAnimal}" var="animal">
				<tr>
					<td> ${animal.name}</td>
					<td> ${animal.age}</td>
					<td> ${animal.hunger}</td>
	
					<td>
						<a href="editAnimal?name=${animal.name}">Edit</a>
						&nbsp;&nbsp;&nbsp;
						<a href="deleteAnimal?name=${animal.name}">Delete</a>
					</td>
				</tr>
				</c:forEach>
			</table>
	</div>

</body>
</html>