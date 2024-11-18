package com.xworkz.ecommerce.servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.xworkz.ecommerce.dto.ProductDTO;
import com.xworkz.ecommerce.service.ProductServiceImpl;

@WebServlet(loadOnStartup = 1, urlPatterns = "/send")
public class ProductServlet extends HttpServlet {

	public ProductServlet() {
		System.out.println("no-arg const of ProductServlet");
	}

	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String productId = req.getParameter("productId");
		String productName = req.getParameter("productName");
		String price = req.getParameter("price");
		String customerName = req.getParameter("customerName");
		String phoneNo = req.getParameter("phoneNo");
		String email = req.getParameter("email");
		String age = req.getParameter("age");

		int convertedProductId = Integer.valueOf(productId);
		double convertedPrice = Double.valueOf(price);
		int convertedAge = Integer.valueOf(age);

		ProductDTO productDTO = new ProductDTO(convertedProductId, productName, convertedPrice, customerName, phoneNo,email, convertedAge);

		ProductServiceImpl productServiceImpl = new ProductServiceImpl();
		boolean validProduct = productServiceImpl.save(productDTO);
		RequestDispatcher dispatcher = req.getRequestDispatcher("msg.jsp");
		if (validProduct) {
			System.out.println("Data is valid");
			req.setAttribute("productName", productDTO.getProductName());
		} else {
			System.out.println("Data is in-valid");
		}
		dispatcher.forward(req, resp);
	}
}
