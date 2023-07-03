<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<!-- Declaration tag -->
<%!
  int a=100;
  int b=200;
%>
<!-- Screplet tag -->
<%!
int c=a+b;
%>

<!-- Expression tag -->
<h1 style="color:red">the sum of a+b:<%= c %></h1>
</body>
</html>