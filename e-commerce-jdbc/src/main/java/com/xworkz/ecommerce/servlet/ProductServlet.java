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
		String productType = req.getParameter("productType");
		String price = req.getParameter("price");
		String customerId = req.getParameter("customerId");
		String customerName = req.getParameter("customerName");

		int convertedProductId = Integer.valueOf(productId);
		double convertedPrice = Double.valueOf(price);
		int convertedCustomerId = Integer.valueOf(customerId);

		ProductDTO productDTO = new ProductDTO(convertedProductId, productName, productType, convertedPrice,convertedCustomerId, customerName);

		ProductServiceImpl productServiceImpl = new ProductServiceImpl();
		productServiceImpl.save(productDTO);

		RequestDispatcher dispatcher = req.getRequestDispatcher("index.jsp");
		dispatcher.forward(req, resp);
	}
}
