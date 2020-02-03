package com.wcs.app.mvccrud.Utility;

import java.util.HashMap;
import java.util.Map;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Environment;

import com.wcs.app.mvccrud.model.Employee;




public class HibernateUtil {

	private static StandardServiceRegistry reg;
	private static SessionFactory sessionfactory;

	public static SessionFactory getSessionFactory() {

		if (sessionfactory == null) {

			Map<String, String> settings = new HashMap<String, String>();
			settings.put(Environment.DRIVER, "com.mysql.jdbc.Driver");
			settings.put(Environment.URL, "jdbc:mysql://localhost:3306/mvc");
			settings.put(Environment.USER, "root");
			settings.put(Environment.PASS, "root");
			settings.put(Environment.DIALECT, "org.hibernate.dialect.MySQLDialect");
			settings.put(Environment.HBM2DDL_AUTO, "update");
			settings.put(Environment.SHOW_SQL, "true");

			reg = new StandardServiceRegistryBuilder().applySettings(settings).build();
			MetadataSources mds = new MetadataSources(reg);

			mds.addAnnotatedClass(Employee.class);
			Metadata md = mds.getMetadataBuilder().build();
			sessionfactory = md.getSessionFactoryBuilder().build();
		}
		return sessionfactory;
	}

}
