<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core"  prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="f"%>
<html>
<head>
<meta charset="ISO-8859-1">
<title>JPA Demo</title>
</head>
<body>
	<h1>JPA Demo Application</h1>
	<p>This demo uses In-Memory Database "HSQLDB" which makes this demo really "portable".<br/>
	Please feel free to update Database settings in applicationContext.xml</p>
	
	<c:if test="${people !=null}">
		<h3> Found ${f:length(people)} people in database!</h3>
		
		<ol>
		<c:forEach items="${people}" var="p">
			 <li>${p.name } ${p.surname }</li> 
		</c:forEach>
		</ol>
	</c:if>
	<a href="add">Add new person</a>
</body>
</html>