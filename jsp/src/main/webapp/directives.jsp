<%@ page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%
	ArrayList<String> arrayList = new ArrayList<>();
	arrayList.add("hi");
	out.println(arrayList);
	%>

</body>
</html>