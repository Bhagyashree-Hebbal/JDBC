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

		AppDTO appDTO = new AppDTO(name, lastName, email, address);
		AppServiceImpl appServiceImpl = new AppServiceImpl();
		appServiceImpl.save(appDTO);
		
		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
	}

}
