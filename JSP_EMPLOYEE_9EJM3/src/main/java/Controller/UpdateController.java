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
@WebServlet("/update")
public class UpdateController  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id=Integer.parseInt(req.getParameter("id"));
		
		EmployeeDao employeeDao=new EmployeeDao();
		Employee employee=employeeDao.getEmployeeId(id);
		if (employee != null) {
			
			req.setAttribute("employee", employee);
			RequestDispatcher dispatcher = req.getRequestDispatcher("edit.jsp");
			dispatcher.forward(req, resp);
		} else {
			req.setAttribute("message", "Login first to update");
			RequestDispatcher dispatcher = req.getRequestDispatcher("login.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
