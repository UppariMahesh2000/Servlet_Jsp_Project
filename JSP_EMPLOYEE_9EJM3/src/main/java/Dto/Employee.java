package Dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int EmployeeId;

	public int getEmployeeId() {
		return EmployeeId;
	}

	public void setEmployeeId(int employeeId) {
		EmployeeId = employeeId;
	}
	
   private String EmployeeName;
   private long PhoneNumber;
   private String Address;
   private String Email;
   private String Password;

public String getEmployeeName() {
	return EmployeeName;
}

public long getPhoneNumber() {
	return PhoneNumber;
}

public String getAddress() {
	return Address;
}

public String getEmail() {
	return Email;
}

public String getPassword() {
	return Password;
}

public void setEmployeeName(String employeeName) {
	EmployeeName = employeeName;
}

public void setPhoneNumber(long phoneNumber) {
	PhoneNumber = phoneNumber;
}

public void setAddress(String address) {
	Address = address;
}

public void setEmail(String email) {
	Email = email;
}

public void setPassword(String password) {
	Password = password;
}
}
