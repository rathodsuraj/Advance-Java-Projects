package com.wcs.app.mvccrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.hibernate.Session;

import com.wcs.app.mvccrud.Utility.HibernateUtil;
import com.wcs.app.mvccrud.model.Employee;
import com.wcs.app.mvccrud.serviceI.ServiceInterface;
import com.wcs.app.mvccrud.serviceImpl.ServiceImpl;
@WebServlet(urlPatterns = "/signup")
public class SignUpController extends HttpServlet{
	ServiceInterface s=new ServiceImpl();
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Employee emp=new Employee();
	emp.setName(req.getParameter("ename"));
	emp.setAddress(req.getParameter("address"));
	emp.setUsername(req.getParameter("eusername"));
	emp.setPassword(req.getParameter("epassword"));
	emp.setAge(req.getParameter("eage"));
	s.saveEmployee(emp);
	req.getRequestDispatcher("login.jsp").forward(req, resp);
	
	}
}
