<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
     <% String message=(String)request.getAttribute("message");
     
     if(message!=null){
    	 %> 
    	 <h2><%=message%></h2>
    	 <%
     }
       %>
   
    
    <form action="LOGIN" method="post">
  
    <label> Email :</label ><input type="text" name="Email" placeholder="Enter the Email">
    <br>
    <label> Password :</label ><input type="text" name="Password" placeholder="Enter the Password">
    <br>
    <br>
    <button>LOGIN</button>
    
    </form> 
    
 
</body>
</html>