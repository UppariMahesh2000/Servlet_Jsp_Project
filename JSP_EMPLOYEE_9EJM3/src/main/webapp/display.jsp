<%@page import="java.util.List"%>
<%@page import="Dto.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
  <%
     List<Employee> employees=(List) request.getAttribute("emp");
  %>
  <table border="2px solid">
    <tr>
    <th>Id</th>
    <th>Name</th>
    <th>Address</th>
    <th>Phone</th>
    <th>Email</th>
    <th>Password</th>
   </tr>
   <%
   for(Employee employee : employees ){
	%>  
   <tr>
   <td><%=employee.getEmployeeId()%></td>
   <td><%=employee.getEmployeeName()%></td>
   <td><%=employee.getPhoneNumber()%></td>
   <td><%=employee.getAddress()%></td>
   <td><%=employee.getEmail()%></td>
   <td><%=employee.getPassword()%></td>
   <td><a href="delete?id=<%=employee.getEmployeeId()%>"><button>DELETE</button></a></td>
   <td><a href="update?id=<%=employee.getEmployeeId()%>"><button>UPDATE</button></a></td>
   </tr>
   <%
   }
   %>
  </table>

</body>
</html>