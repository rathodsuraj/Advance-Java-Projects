package com.hibernate.serviceImpl;

import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;

import com.hibernate.client.HibernateUtility;
import com.hibernate.model.Cjc;
import com.hibernate.service.Classes;

public class Aakurdi implements Classes {
	Session session = HibernateUtility.getSessionFactory().openSession();

	@Override
	public void createData() {

		Cjc c = new Cjc();
		
		c.setStudentid(25);
		c.setNumber("982111412");
		c.setFees(35000.00);
		c.setStudentaddr("Fort");
		c.setStudentname("Amol");
		session.save(c);
		System.out.println("data created..");
		session.beginTransaction().commit();
	}

	@Override
	public void updateData() {

		session.beginTransaction();
		Cjc c = session.get(Cjc.class, 25);
		c.setStudentname("Sagar");
		System.out.println("updated successfullly");
		session.getTransaction().commit();

	}

	@Override
	public void readData() {
		List<Cjc> li = session.createQuery("from Cjc").list();
		Iterator<Cjc> itr = li.iterator();
		while (itr.hasNext()) {
			Cjc c = itr.next();
			System.out.println(c.getStudentid());
			System.out.println(c.getStudentname());
			System.out.println(c.getNumber());
			System.out.println(c.getFees());
			System.out.println(c.getFees());
		}
	}

	@Override
	public void delete() {
		session.beginTransaction();
		Cjc c = session.get(Cjc.class, 25);
		session.delete(c);
		System.out.println("deleted successfully");
		session.beginTransaction().commit();
	}

}
