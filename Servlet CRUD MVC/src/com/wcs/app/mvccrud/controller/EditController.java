package com.wcs.app.mvccrud.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.app.mvccrud.model.Employee;
import com.wcs.app.mvccrud.serviceI.ServiceInterface;
import com.wcs.app.mvccrud.serviceImpl.ServiceImpl;

@WebServlet(urlPatterns = "/edit")
public class EditController extends HttpServlet{

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		ServiceInterface s = new ServiceImpl();
		System.out.println("edit servlet");
		resp.setContentType("text/html");
		int id=Integer.parseInt(req.getParameter("eid"));
		System.out.println(id);
		Employee emp=s.editEmployee(id);
		req.setAttribute("details", emp);
		req.getRequestDispatcher("edit.jsp").forward(req, resp);
	}

}
