package com.sapiens.dao;

import java.util.List;

import com.sapiens.model.Address;
import com.sapiens.model.Employee;
import com.sapiens.model.Project;

public interface EmployeeDAO {

	void addEmp(Employee emp);
	void addAddress(Address add);
	void addProject(Project poj);
	 List viewAllEmployee();
	 String deleteEmp(int id);
	 String updateEmp(Employee emp);
	 Employee getEmpbyId(int id);
	 
	
	
}
