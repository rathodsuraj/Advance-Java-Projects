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

@WebServlet(urlPatterns = "/delete")
public class DeleteController extends HttpServlet {

	ServiceInterface s = new ServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		int id = Integer.parseInt(req.getParameter("eid"));
		System.out.println(id);
		s.deleteEmployee(id);
		List<Employee> list=s.getAllData();
		req.setAttribute("data", list);
		req.getRequestDispatcher("success.jsp").forward(req, resp);
		
	}

}
