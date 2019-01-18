<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="sp" %>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add new person</title>
</head>
<body>
<h2>Adding new person</h2>
<sp:form method="post" commandName="person">
	Name : <sp:input path="name"/><br/>
	Surname: <sp:input path="surname"/><br/>
	<input type="submit" value="save"/>
</sp:form>
</body>
</html>