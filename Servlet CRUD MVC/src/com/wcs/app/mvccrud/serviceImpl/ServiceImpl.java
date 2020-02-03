package com.wcs.app.mvccrud.serviceImpl;

import java.util.List;

import com.wcs.app.mvccrud.daoI.DaoInterface;
import com.wcs.app.mvccrud.daoImpl.DaoImpl;
import com.wcs.app.mvccrud.model.Employee;
import com.wcs.app.mvccrud.serviceI.ServiceInterface;

public class ServiceImpl implements ServiceInterface{
  DaoInterface d=new DaoImpl();
	@Override
	public void saveEmployee(Employee e) {
		
		d.saveEmployee(e);
	}

	@Override
	public List<Employee> loginEmployee(String uname, String pass) {
		List<Employee> list=d.loginEmployee(uname, pass);
		return list;
	}

	@Override
	public List<Employee> getAllData() {
		List<Employee> list=d.getAllData();
		return list;
	}

	@Override
	public void deleteEmployee(int id) {
		d.deleteEmployee(id);
		
	}

	@Override
	public Employee editEmployee(int id) {
		Employee emp=d.editEmployee(id);
		return emp;
	}

	@Override
	public void updateEmployee(Employee e) {
		d.updateEmployee(e);
		
	}

	@Override
	public List<Employee> getEmployee(String uname, String pass) {
		 List<Employee>	list=d.getEmployee(uname, pass);
		return list;
	}
	

}
