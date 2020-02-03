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

@WebServlet(urlPatterns = "/login")
public class LoginController extends HttpServlet {
	ServiceInterface s = new ServiceImpl();

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("in login servlet");
		String uname = req.getParameter("username");
		String pass = req.getParameter("password");

		if (uname.equals("admin") && pass.equals("admin")) {
			List<Employee> list = s.loginEmployee(uname, pass);
			req.setAttribute("data", list);
			req.getRequestDispatcher("success.jsp").forward(req, resp);
		} else if (uname.equals(uname) && pass.equals(pass)) {
			List<Employee> list = s.getEmployee(uname, pass);
			req.setAttribute("data", list);
			req.getRequestDispatcher("success.jsp").forward(req, resp);
 		}

	}

}
