package com.wcs.app.MVCCRUD.Controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.wcs.app.MVCCRUD.Model.Employee;
import com.wcs.app.MVCCRUD.ServiceImpl.ServiceImpl;
import com.wcs.app.MVCCRUD.serviceI.Serviceintrf;
@WebServlet(urlPatterns = "/reg")
public class RegisterController extends HttpServlet {
@Override
protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	Serviceintrf ser=new ServiceImpl();
	System.out.println("in Register Controller");
	Employee e=new Employee();
	e.setName(req.getParameter("name"));
	e.setAddress(req.getParameter("address"));
	e.setUsername(req.getParameter("username"));
	e.setPassword(req.getParameter("password"));
	ser.saveEmployee(e);
	resp.sendRedirect("login.jsp");
}
}
