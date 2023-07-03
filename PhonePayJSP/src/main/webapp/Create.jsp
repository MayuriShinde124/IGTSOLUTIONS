<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>


 

<body>
    <%

	int id=Integer.parseInt(request.getParameter("uid"));
	String name=request.getParameter("uname");
	int acc=Integer.parseInt(request.getParameter("uacc"));
	String ifsc=request.getParameter("uifsc");
	String pan=request.getParameter("upan");
	int phn=Integer.parseInt(request.getParameter("uphn"));
	int adhar=Integer.parseInt(request.getParameter("uadhar"));
	int balance=Integer.parseInt(request.getParameter("ubalance"));

    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1", "root", "root");
        PreparedStatement pstmt=con.prepareStatement("insert into bank values(?,?,?,?,?,?,?,?)");
		System.out.println("data inserted sucessfully...!");

			pstmt.setInt(1, id);
			pstmt.setString(2, name);
			pstmt.setInt(3, acc);
			pstmt.setString(4, ifsc);
			pstmt.setString(5, pan);
			pstmt.setInt(6, phn);
			pstmt.setInt(7, adhar);
			pstmt.setInt(8, balance);
			pstmt.execute();
			
	
			out.print("<h3>ACCOUNT CREATED...!<h3>");
			out.print("<br>");
			out.print("<h3>");
			out.print(" <a href='Home.html'>Home Page</a>");
			out.print("</h3>");
	
		pstmt.close();

        out.print("<h1>");
        out.print("Inserted");
        out.print("</h1>");
    } catch(Exception e) {

        System.out.println(e);
    }    
  
    %>

 

 

</body>
</html>