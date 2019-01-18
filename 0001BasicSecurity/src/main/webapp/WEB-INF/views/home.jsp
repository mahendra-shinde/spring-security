<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page session="false" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
<h1>
	Hello world!  
</h1>

	<P>The time on the server is ${serverTime}.</P>
	<h1>Title : ${title}</h1>	
	<h1>Message : ${message}</h1>
	
	<h3>User credentials :</h3>
	<p>Username: <b>mahendra</b><br/>
	   Password: <b>password</b>
	</p>	
	<a href="admin">Admin Console (Secured)</a>
	
</body>
</html>
