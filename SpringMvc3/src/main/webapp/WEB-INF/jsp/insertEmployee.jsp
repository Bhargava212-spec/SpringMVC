<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" %>
	<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
	<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
		<!DOCTYPE html>
		<html>

		<head>
			<meta charset="ISO-8859-1">
			<title>Insert title here</title>
		</head>

		<body>
			<h1>Employee Information</h1>
			<c:url var="storeEmp" value="/insertEmp"/>
			<form:form action="${storeEmp }" method="post" commandName="empForm">
				<table>
					<tr>
						<td>Name :</td>
						<td>
							<form:input type="text" path="name" />
						</td>
					</tr>
					<tr>
						<td>Age :</td>
						<td>
							<form:input type="number" path="age" />
						</td>
					</tr>
					<tr>
						<td>Email :</td>
						<td>
							<form:input type="email" path="email" />
						</td>
					</tr>
					<tr>
						<td>Qualification :</td>
						<td>
							<form:input type="text" path="qualification" />
						</td>
					</tr>
					<tr>
						<td><input type="submit" /></td>
					</tr>
				</table>
			</form:form>
		</body>

		</html>