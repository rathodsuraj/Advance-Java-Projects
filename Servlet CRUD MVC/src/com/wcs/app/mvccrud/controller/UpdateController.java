package com.wcs.app.mvccrud.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.app.mvccrud.model.Employee;
import com.wcs.app.mvccrud.serviceI.ServiceInterface;
import com.wcs.app.mvccrud.serviceImpl.ServiceImpl;

@WebServlet(urlPatterns = "/updatedb")
public class UpdateController extends HttpServlet {

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServiceInterface s = new ServiceImpl();
		Employee e = new Employee();

		System.out.println("update controller");
		int id = Integer.parseInt(req.getParameter("editid"));
		e.setId(id);
		e.setAge(req.getParameter("age"));
		e.setName(req.getParameter("ename"));
		e.setAddress(req.getParameter("address"));
		e.setUsername(req.getParameter("uname"));
		e.setPassword(req.getParameter("passwd"));
		s.updateEmployee(e);
		List<Employee> list=s.getAllData();
		req.setAttribute("data", list);
		req.getRequestDispatcher("success.jsp").forward(req, resp);
	}

}
