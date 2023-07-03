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
    String name = request.getParameter("uname");
    int age = Integer.parseInt(request.getParameter("uage"));
    int salary = Integer.parseInt(request.getParameter("usalary"));
    String desig = request.getParameter("udesignation");

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1", "root", "root");
        PreparedStatement p = con.prepareStatement("insert into employee1 values(?, ?, ?, ?, ?)");

        p.setInt(1, id);
        p.setString(2, name);
        p.setInt(3, age);
        p.setInt(4, salary);
        p.setString(5, desig);
        p.execute();
        p.close();

        out.print("<h1>");
        out.print("Inserted");
        out.print("</h1>");
    } catch(Exception e) {

        System.out.println(e);
    }    
    out.print("<h4>");
	out.print("<a href='Entry.html'>HOME PAGE</a>");
	out.print("</h4>");

    %>

 

 

</body>
</html>