<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>

<body>
    <%

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1", "root", "root");
      
		java.sql.Statement stmt=con.createStatement();
		
		
		out.print("<h3>");
		out.print("Record of Employeee..........!!!!!!!!!!!!!!");
		out.print("<br>");
		out.print("</h3>");
		out.print("<br>");
		out.print("<br>");
		out.print("<br>");
		out.print("<h4>");
		
		
		ResultSet rs=stmt.executeQuery("select * from bank");
		out.print("<h4>");

            out.print("<h4>");
           while(rs.next()) {
               out.print(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getInt(3)+" "+rs.getString(4)+" "+rs.getString(5)+" "+rs.getString(6)+" "+rs.getString(7)+" "+rs.getString(8));
               out.print("<br>");
           } 
       	out.print("<h4>");
           out.print("<a href='Home.html'>HOME PAGE</a>");
            out.print("</h4>");
        }
        catch(Exception e)
        {
            System.out.println(e);    
        }
	

    %>

 

 

</body>
</html>