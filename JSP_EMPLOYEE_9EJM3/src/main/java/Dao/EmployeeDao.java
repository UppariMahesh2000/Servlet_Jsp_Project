package Dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import Dto.Employee;

public class EmployeeDao {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("mahesh");
	EntityManager entityManager=entityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	public Employee saveEmployee(Employee employee){
		entityTransaction.begin();
		entityManager.persist(employee);
		entityTransaction.commit();	
		return employee;	
	}
	public Employee getEmployeeByEmail(String Email) {
		Query query=entityManager.createQuery("SELECT e FROM Employee e WHERE e.Email=?1");
		query.setParameter(1, Email);
		Employee employee=(Employee)query.getSingleResult();
		return employee;		
	}
	public List<Employee> getAllEmployees() {
		Query query=entityManager.createQuery("select e from Employee e");
		List<Employee> employee=query.getResultList();
		return employee;
	}
	
	public void update(int id,Employee employee) {
		Employee  employee2=entityManager.find(Employee.class, id);
		if(employee2!=null) {
			employee.setEmployeeId(id);
			entityTransaction.begin();
			entityManager.merge(employee);
			entityTransaction.commit();
		}
		
	}
	public Employee getEmployeeId(int id) {
		Employee employee=entityManager.find(Employee.class, id);
		return employee;
	}
	public boolean deleteEmployee(int id) {
		Employee employee = entityManager.find(Employee.class, id);
		if (employee != null) {
			entityTransaction.begin();
			entityManager.remove(employee);
			entityTransaction.commit();
			return true;
		}
		return false;
	}
	
	public Employee updateEmployee(Employee employee) {
		entityTransaction.begin();
		entityManager.merge(employee);
		entityTransaction.commit();

		return employee;
	}
}
