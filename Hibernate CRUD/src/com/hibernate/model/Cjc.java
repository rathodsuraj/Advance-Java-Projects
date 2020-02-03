package com.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Cjc {
	@Id
	private int studentid;
	private String studentname;
	private String studentaddr;
	private double fees;
	private String number;
	public int getStudentid() {
		return studentid;
	}
	public void setStudentid(int studentid) {
		this.studentid = studentid;
	}
	public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getStudentaddr() {
		return studentaddr;
	}
	public void setStudentaddr(String studentaddr) {
		this.studentaddr = studentaddr;
	}
	public double getFees() {
		return fees;
	}
	public void setFees(double fees) {
		this.fees = fees;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	

}
