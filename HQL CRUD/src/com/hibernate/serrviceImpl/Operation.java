package com.hibernate.serrviceImpl;

import java.util.Scanner;
import org.hibernate.Session;
import com.hibernate.model.Employee;
import com.hibernate.service.HeadBranch;
import com.hibernate.utility.HibernateUtil;
import java.util.*;

public class Operation implements HeadBranch {
	Session session = HibernateUtil.getSessionFactory().openSession();
	Scanner sc = new Scanner(System.in);

	@Override
	public void insertData() {

		Employee emp = new Employee();
		System.out.println("enter emp id:");
		int id = sc.nextInt();
		emp.setId(id);
		System.out.println("enter emp Name::");
		String ename = sc.next();
		emp.setName(ename);
		System.out.println("enter emp Address::");
		String eaddr = sc.next();
		emp.setAddr(eaddr);
		System.out.println("enter emp Salary::");
		double sal = sc.nextDouble();
		emp.setSalary(sal);
		session.save(emp);
		session.beginTransaction().commit();
		System.out.println("Data inserted successfully..");
	}

	@Override
	public void retriveData() {
		List<Employee> list = session.createQuery("from Employee").getResultList();

		for (Employee e : list) {
			System.out.println("Emp id is::" + e.getId());
			System.out.println("Emp name is::" + e.getName());
			System.out.println("Emp address is::" + e.getAddr());
			System.out.println("Emp salary is::" + e.getSalary());
		}
	}
	/*
	 * @Override public void updateData() { Employee emp=new Employee();
	 * session.getTransaction().begin(); String UpdateQuery =
	 * "update Employee set name=:ename where id=:eid"; Query query =
	 * session.createQuery(UpdateQuery);
	 * System.out.println("enter name you want to update"); String name = sc.next();
	 * emp.setName(name); // emp.setName(name); query.setParameter("ename", name);
	 * System.out.println("Enter id of employee which you want to update::"); int id
	 * = sc.nextInt(); query.setParameter("eid", id); session.save(emp);
	 * session.getTransaction().commit();
	 * System.out.println("Data Updated Successfully..."); session.close(); }
	 * 
	 * @Override public void deleteData() { Employee emp=new Employee();
	 * session.getTransaction().begin(); String DeleteQuery =
	 * "delete from Employee where id=:eid"; Query query =
	 * session.createQuery(DeleteQuery);
	 * System.out.println("Enter Employee id whose data you want to delete::"); int
	 * id = sc.nextInt(); query.setParameter("eid", id); session.save(emp);
	 * session.getTransaction().commit();
	 * System.out.println("Data Deleted Successfully"); }
	 */

	@Override
	public void updateData() {
		System.out.println("enter employee id whose name you want to update::");
		int id = sc.nextInt();
		System.out.println("enter the new name:");
		String name = sc.next();
		session.getTransaction().begin();
		Employee e = session.load(Employee.class, id);
		e.setName(name);
		session.update(e);
		session.getTransaction().commit();

	}

	@Override
	public void deleteData() {
		System.out.println("Enter id of employee whose record you want to delete::");
		int id = sc.nextInt();
		Employee e = session.get(Employee.class, id);
		session.delete(e);
		session.getTransaction().commit();

	}

}
