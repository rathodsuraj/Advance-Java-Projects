package com.wcs.app.MVCCRUD.DaoImpl;

import org.hibernate.Session;

import com.wcs.app.MVCCRUD.DaoI.DaoIntrf;
import com.wcs.app.MVCCRUD.Model.Employee;
import com.wcs.app.MVCCRUD.Utility.HibernateUtil;

public class DaoImpl implements DaoIntrf {

	@Override
	public void saveEmployee(Employee e) {
		System.out.println("in DaoImpl");
		System.out.println(e.getName()+"   "+e.getEmpid());
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.save(e);
		session.beginTransaction().commit();
		System.out.println("dao complte");
	}

}
