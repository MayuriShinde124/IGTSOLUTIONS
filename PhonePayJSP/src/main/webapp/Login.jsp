<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


 

<body>
    <%

    String name=request.getParameter("uname");
	String pass=request.getParameter("upass");
	
	if(name.equalsIgnoreCase("Mayuri")&& pass.equalsIgnoreCase("Mayuri123"))
	{
		RequestDispatcher rd=request.getRequestDispatcher("Home.html");
		rd.forward(request, response);
		
		out.print("Logged In");
		
	}
	else
	{
		out.print("<p style='color:red'>Please try once again</p>");
		RequestDispatcher rd=request.getRequestDispatcher("Login.html");
		rd.include(request, response);
		
	}

    %>

 

 

</body>
</html>