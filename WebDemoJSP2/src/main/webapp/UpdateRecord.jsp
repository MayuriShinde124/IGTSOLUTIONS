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
   
    int salary = Integer.parseInt(request.getParameter("usalary"));

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1", "root", "root");

        PreparedStatement pstmt=con.prepareStatement("update employee1 set salary=? where id=?");
		
		pstmt.setInt(1, salary);
		pstmt.setInt(2, id);
		pstmt.execute();
		
	pstmt.close();
	
    out.print("<h1>");
    out.print("Id : "+id);
    out.print("<br>");

    out.print("Salary : "+salary);

    out.print("</h1>");
	out.print("<br>");
	out.print("<h3>");
	out.print(" <a href='Index.html'>");
	out.print("</h3>");
} 
catch (Exception e) {
	System.out.println(e);
}


out.print("<h3>Data updated Sucessfully...!<h3>");
out.print("<br>");

out.print("</h3>");
out.print("<h4>");
out.print("<a href='Entry.html'>HOME PAGE</a>");
out.print("</h4>");

 

    %>

 

 

</body>
</html>