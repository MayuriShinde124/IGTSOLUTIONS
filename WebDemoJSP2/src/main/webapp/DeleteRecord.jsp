<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body> 

    <%
    int id = Integer.parseInt(request.getParameter("uid"));


    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1", "root", "root");


		PreparedStatement  pstmt=con.prepareStatement("delete from employee1 where id=?"); 
	
		pstmt.setInt(1, id);
		pstmt.execute();

	    System.out.println("Data Deleted sucessfully...!");
	
		pstmt.close();


        out.print("<h1>");
        out.print("Id : "+id);
        out.print("<br>");
 
 
    
        out.print("</h1>");
	} 
	catch (Exception e) {
		System.out.println(e);
	}

	out.print("<h3>Data Deleted Sucessfully...!<h3>");
	out.print("<h4>");
	out.print("<a href='Entry.html'>HOME PAGE</a>");
	out.print("</h4>");
	

    %>

 

 

</body>
</html>