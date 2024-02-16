<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>USER INFO</title>
</head>
<body>

	<form action="request1.jsp">
	
	Name : <input type="text" name="name"><br>
	Password : <input type="password" name="pass"><br>
	<button type="submit">Submit</button>
	</form>
	
	<%
	String name=request.getParameter("name");
	String pass=request.getParameter("pass");
	out.println(name);
	out.println(pass);
	%>

</body>
</html>