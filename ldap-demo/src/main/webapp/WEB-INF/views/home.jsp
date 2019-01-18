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
	
	<h3>User credentials (Manager) :</h3>
	<p>Username: <b>ben</b><br/>
	   Password: <b>benspassword</b>
	</p>	
	
	<h3>User credentials (developers)</h3>
	<p>Username: <b>bob</b><br/>
	   Password: <b>bobspassword</b>
	</p>	
	
	<a href="admin">Admin Console (Secured Only for managers)</a>
	
</body>
</html>
