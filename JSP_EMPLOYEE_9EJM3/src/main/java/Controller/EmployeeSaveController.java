package Controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import Dao.EmployeeDao;
import Dto.Employee;


@WebServlet("/save")
public class EmployeeSaveController  extends HttpServlet{
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String EmployeeName=req.getParameter("EmployeeName");
		long EmployeePhNo=Long.parseLong(req.getParameter("EmployeePhoneNumber"));
		String EmployeeAddress=req.getParameter("EmployeeAddress");
		String EmployeeEmail=req.getParameter("EmployeeEmail");
		String EmployeePassword=req.getParameter("EmployeePassword");
		
		Employee employee=new Employee();
		employee.setEmployeeName(EmployeeName);
		employee.setPhoneNumber(EmployeePhNo);
		employee.setAddress(EmployeeAddress);
		employee.setEmail(EmployeeEmail);
		employee.setPassword(EmployeePassword);
		
		EmployeeDao employeeDao=new EmployeeDao();
		Employee dbemployee=employeeDao.saveEmployee(employee);
		
		if(dbemployee!=null) {
			req.setAttribute("message", "Successfully SignedUp procced for Login ");
			RequestDispatcher requestDispatcher=req.getRequestDispatcher("login.jsp");
			requestDispatcher.forward(req, resp);	
		}	
	}
}
