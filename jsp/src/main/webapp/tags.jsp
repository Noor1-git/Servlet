<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<form action="tags.jsp">
		Name : <input type="text" name="name"><br><br>
		Password : <input type="password" name="password"><br><br>
		<button type="submit">Submit</button>
	</form>

	<%!
	
	String name;
	String password;
	
	double pi=3.142;
	
	int sum(int a,int b){
		return (a+b);
	}
	%>
	<% 
	name=request.getParameter("name");
	password=request.getParameter("password");
		out.println(name);
		
		out.println(password);
	%>
	<br>
	sum is : <%=sum(10,20) %>
</body>
</html>