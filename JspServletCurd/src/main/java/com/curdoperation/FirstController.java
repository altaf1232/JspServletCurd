package com.curdoperation;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//@WebServlet("/FirstController") this curd operation create Annotaion base 
public class FirstController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String id = request.getParameter("id");
		Integer empId = Integer.parseInt(id);
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		String address = request.getParameter("address");

		PogoEmlpyee pogoEmlpyee = new PogoEmlpyee();
		pogoEmlpyee.setId(empId);
		pogoEmlpyee.setName(name);
		pogoEmlpyee.setEmail(email);
		pogoEmlpyee.setAddress(address);

		DaoImplements daoImplements = new DaoImplements();
		daoImplements.saveData(pogoEmlpyee);

	}

}
