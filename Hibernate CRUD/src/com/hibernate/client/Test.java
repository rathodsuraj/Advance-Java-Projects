package com.hibernate.client;

import java.util.Scanner;

import org.hibernate.Session;

import com.hibernate.model.Cjc;
import com.hibernate.serviceImpl.Aakurdi;

public class Test {

	public static void main(String[] args) {
		Aakurdi a = new Aakurdi();
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
				a.createData();
				break;
			case 2:
				a.updateData();
				break;
			case 3:
				a.readData();
				break;
			case 4:
				a.delete();
				break;
			case 5:
				flag = false;
				break;
			default:
				System.out.println("Enter Proper Choice:");
			}
		}

		Session session = HibernateUtility.getSessionFactory().openSession();
		session.beginTransaction().commit();

	}
}