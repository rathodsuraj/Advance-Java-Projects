package com.wcs.app.mvccrud.daoImpl;

import java.util.List;

import org.hibernate.Session;

import com.wcs.app.mvccrud.Utility.HibernateUtil;
import com.wcs.app.mvccrud.daoI.DaoInterface;
import com.wcs.app.mvccrud.model.Employee;

public class DaoImpl implements DaoInterface {

	@Override
	public void saveEmployee(Employee e) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		session.save(e);
		session.beginTransaction().commit();
	}

	@Override
	public List<Employee> loginEmployee(String uname, String pass) {

		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Employee> list = session.createQuery("from Employee").getResultList();
		return list;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Employee> getEmployee(String uname, String pass) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Employee> list = session.createQuery("from Employee where username='" + uname + "'and password='" + pass + "'").getResultList();
		return list;
	}

	@Override
	public List<Employee> getAllData() {
		Session session = HibernateUtil.getSessionFactory().openSession();
		List<Employee> list = session.createQuery("from Employee").getResultList();
		return list;
	}

	@Override
	public void deleteEmployee(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Employee emp = session.get(Employee.class, id);
		session.delete(emp);
		session.beginTransaction().commit();

	}

	@Override
	public Employee editEmployee(int id) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		Employee emp = session.get(Employee.class, id);
		emp.getAge();
		emp.getName();
		emp.getAddress();
		emp.getUsername();
		emp.getPassword();
		return emp;
	}

	@Override
	public void updateEmployee(Employee e) {
		Session session = HibernateUtil.getSessionFactory().openSession();
		session.update(e);
		session.beginTransaction().commit();
	}

}
