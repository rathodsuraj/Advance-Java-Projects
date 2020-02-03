package com.wcs.app.MVCCRUD.ServiceImpl;

import com.wcs.app.MVCCRUD.DaoI.DaoIntrf;
import com.wcs.app.MVCCRUD.DaoImpl.DaoImpl;
import com.wcs.app.MVCCRUD.Model.Employee;
import com.wcs.app.MVCCRUD.serviceI.Serviceintrf;

public class ServiceImpl implements Serviceintrf{
DaoIntrf dio=new DaoImpl();
	@Override
	public void saveEmployee(Employee e) {
		System.out.println("in serviceImpl");
		dio.saveEmployee(e);
		System.out.println("servicecomplte");
		
	}

}
