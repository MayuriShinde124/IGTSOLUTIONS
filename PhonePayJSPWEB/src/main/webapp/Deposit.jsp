<%@ page language="java" contentType="text/html; charset=ISO-8859-1" pageEncoding="ISO-8859-1" import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
    <%
	int acc=Integer.parseInt(request.getParameter("uacc"));
	
	String pan=request.getParameter("upan");
	int phn=Integer.parseInt(request.getParameter("uphn"));
	
		int amount=Integer.parseInt(request.getParameter("uamount"));
		//int balance=Integer.parseInt(request.getParameter("ubalance"));


    try {

        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/igt1", "root", "root");
      
		PreparedStatement pstmt=con.prepareStatement("update bank set balance=balance+? where accno=? or pan=? or phn=?");
		System.out.println("Data Updated sucessfully...!");
	
			pstmt.setInt(1, amount);
			pstmt.setInt(2, acc);
			pstmt.setString(3, pan);
			pstmt.setInt(4, phn);
	
			pstmt.execute();
			
   
	pstmt.close();



} 
catch (Exception e) {
	System.out.println(e);
}


out.print("<h3>Money Deposit Sucessfully...!<h3>");
out.print("<br>");

out.print("</h3>");
out.print("<h4>");
out.print("<a href='Home.html'>HOME PAGE</a>");
out.print("</h4>");

 

    %>

 

 

</body>
</html>