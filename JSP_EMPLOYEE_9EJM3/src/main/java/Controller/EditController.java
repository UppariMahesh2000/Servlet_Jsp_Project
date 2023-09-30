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


@WebServlet("/edit")
public class EditController  extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String address = req.getParameter("address");
		long phone = Long.parseLong(req.getParameter("phone"));
		String email = req.getParameter("email");
		String password = req.getParameter("password");

		Employee employee = new Employee();
		employee.setEmployeeId(id);
		employee.setEmployeeName(name);
		employee.setAddress(address);
		employee.setPhoneNumber(phone);
		employee.setEmail(email);
		employee.setPassword(password);

		EmployeeDao employeeDao=new EmployeeDao();
		Employee employee2 = employeeDao.updateEmployee(employee);

		if (employee2 != null) {
			List<Employee> employees = employeeDao.getAllEmployees();
			req.setAttribute("employees", employees);
			RequestDispatcher dispatcher = req.getRequestDispatcher("display.jsp");
			dispatcher.forward(req, resp);
		}
	}

}
