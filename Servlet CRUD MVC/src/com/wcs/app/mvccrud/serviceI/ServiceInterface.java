package com.wcs.app.mvccrud.serviceI;

import java.util.List;

import com.wcs.app.mvccrud.model.Employee;

public interface ServiceInterface {
	
	void saveEmployee(Employee e);
	List<Employee> loginEmployee(String uname,String pass);
	List<Employee> getEmployee(String uname,String pass);
	List<Employee> getAllData();
	void deleteEmployee(int id);
	Employee editEmployee(int id);
	void updateEmployee(Employee e);

}
