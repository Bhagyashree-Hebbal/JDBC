package com.xworkz.information.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.information.dto.AppDTO;
import com.xworkz.information.service.AppServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/submit")
public class AppServlet extends HttpServlet {

	public AppServlet() {
		System.out.println("no-arg const in AppServlet");
	}

	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		String name = req.getParameter("name");
		String lastName = req.getParameter("lastName");
		String email = req.getParameter("email");
		String address = req.getParameter("address");
		String phoneNo = req.getParameter("phoneNo");
		String age = req.getParameter("age");

		int convertedAge = Integer.valueOf(age);

		AppDTO appDTO = new AppDTO(name, lastName, email, address, phoneNo, convertedAge);
		AppServiceImpl appServiceImpl = new AppServiceImpl();
		boolean validApp = appServiceImpl.save(appDTO);
		RequestDispatcher dispatcher = req.getRequestDispatcher("msg.jsp");
		if (validApp) {
			System.out.println("Data is valid");
			req.setAttribute("name", appDTO.getName());
		} else {
			System.out.println("Data is in-valid");
		}
		dispatcher.forward(req, resp);
	}

}
