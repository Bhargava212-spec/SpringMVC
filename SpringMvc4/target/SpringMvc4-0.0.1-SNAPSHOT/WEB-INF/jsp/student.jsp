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
			<c:url var="action" value="/saveStudent"/>
			<form:form action="${action}" method="post" commandName="studentForm">
				<table>
					<tr>
						<td>Name :</td>
						<td>
							<form:input type="text" path="name" /><font color="red"><form:errors path="name"/></font>
						</td>
					</tr>
					<tr>
						<td>Age :</td>
						<td>
							<form:input type="number" path="age" /><font color="red"><form:errors path="age"/></font>
						</td>
					</tr>
					<tr>
						<td>Address :</td>
						<td>
							<form:input type="text" path="address" /><font color="red"><form:errors path="address"/></font>
						</td>
					</tr>
					<tr>
						<td>Gender :</td>
						<td>
							Male<form:radiobutton path="gender" value="male"/>
							Female<form:radiobutton path="gender" value="female"/>
							<font color="red"><form:errors path="name"/></font>
						</td>
					</tr>
					<tr>
						<td>Qualification :</td>
						<td>
							<form:select path="qualification">
								<form:option value=" " >------Please Select------</form:option>
								
								<form:option value="BE">BE</form:option>
								<form:option value="Btech">B. Tech</form:option>
								<form:option value="BBBS">MBBS</form:option>
								<form:option value="BDS">BDS</form:option>
							</form:select>
							<font color="red"><form:errors path="name"/></font>
						</td>
					</tr>
					<tr>
						<td><input type="submit" /></td>
					</tr>
				</table>
			</form:form>
		</body>

		</html>