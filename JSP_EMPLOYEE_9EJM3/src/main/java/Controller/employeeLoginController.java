package Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDao;
import Dto.Employee;

@WebServlet("/LOGIN")
public class employeeLoginController  extends HttpServlet{

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		    String Email=req.getParameter("Email");
		    String Password=req.getParameter("Password");
		    
		    EmployeeDao employeeDao=new EmployeeDao();
		    Employee dbemployee=employeeDao.getEmployeeByEmail(Email);
		   
		    if(dbemployee.getPassword().equals(Password)) {
		    List<Employee>employee=employeeDao.getAllEmployees();
		    req.setAttribute("emp",employee);
		    	
		    RequestDispatcher requestDispatcher=req.getRequestDispatcher("display.jsp");
		    requestDispatcher.forward(req, resp);
	        }
		    
	else {
		req.setAttribute("message", "invalid credential");
		RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.jsp");
		requestDispatcher.forward(req, resp);
		
	   }
		
	}

	

}
