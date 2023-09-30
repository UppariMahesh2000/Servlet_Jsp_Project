<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>WELCOME TO JSP FILE </title>
</head>
<body>

 <form action="save" method="post">
    <label> Employee Name</label ><input type="text" name="EmployeeName" placeholder="Enter the EmployeeName">
    <br>
    <label> Employee PhoneNumber</label ><input type="number" name="EmployeePhoneNumber" placeholder="Enter the PhoneNumber">
    <br>
    <label> Employee Address</label ><input type="text" name="EmployeeAddress" placeholder="Enter the Address">
    <br>
    <label> Employee Email</label ><input type="text" name="EmployeeEmail" placeholder="Enter the Email">
    <br>
    <label> Employee Password</label ><input type="text" name="EmployeePassword" placeholder="Enter the Password">
    <br>
   
    <button>SignUp</button>
 
 </form>
 
</body>
</html>