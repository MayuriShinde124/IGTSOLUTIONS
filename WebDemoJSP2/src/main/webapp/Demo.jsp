<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"  import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%!
	String name,designation;
	int id,age ,salary;
	%>
	<% 
	id=Integer.parseInt(request.getParameter("uid"));
	name=request.getParameter("uname");
	
	age=Integer.parseInt(request.getParameter("uage"));
	salary=Integer.parseInt(request.getParameter("usalary"));
	name=request.getParameter("udesignation");

	%>
	<h1>ID :<%=id %></h1>
	<h1>NAME :<%=name %></h1>
	<h1>AGE :<%=age%></h1>
	<h1>SALARY:<%=salary %></h1>
	<h1>DESIGNATION:<%=designation %></h1>
	
</body>
</html>