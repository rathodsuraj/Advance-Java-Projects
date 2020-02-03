package com.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.serrviceImpl.Operation;
import com.hibernate.utility.HibernateUtil;

public class Test {

	public static void main(String[] args) {
		Operation a=new Operation();
		Scanner sc = new Scanner(System.in);

		boolean flag = true;
		while (flag) {
			System.out.println("1=>create data.");
			System.out.println("2=>update data.");
			System.out.println("3=>read data.");
			System.out.println("4=>delete data");
			System.out.println("5=>exit.");

			System.out.println("enter your choice:");
			int n = sc.nextInt();
			switch (n) {
			case 1:
				a.insertData();
				break;
			case 2:
				a.updateData();
				break;
			case 3:
				a.retriveData();
				break;
			case 4:
				a.deleteData();
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Enter Proper Choice:");
			}
		}

/*
		Session session=HibernateUtil.getSessionFactory().openSession();
		session.beginTransaction().commit();
*/
		
		
		
		
	}

}
