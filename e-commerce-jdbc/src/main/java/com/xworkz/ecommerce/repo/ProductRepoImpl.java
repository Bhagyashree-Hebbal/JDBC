package com.xworkz.ecommerce.repo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import com.xworkz.ecommerce.constants.ProductEnum;
import com.xworkz.ecommerce.dto.ProductDTO;

public class ProductRepoImpl implements ProductRepo {

	@Override
	public boolean save(ProductDTO productDTO) {
		System.out.println("This is data");

		boolean ifSaved = false;
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e1) {
			e1.printStackTrace();
		}

		try {
			Connection connection = null;
			connection = DriverManager.getConnection(ProductEnum.URL.getValue(), ProductEnum.USERNAME.getValue(),ProductEnum.PASSWORD.getValue());
			PreparedStatement prst = null;

			prst = connection.prepareStatement("insert into product_table(productId,productName,productType,price,customerId,customerName) values(?,?,?,?,?,?)");
			prst.setInt(1, productDTO.getProductId());
			prst.setString(2, productDTO.getProductName());
			prst.setString(3, productDTO.getProductType());
			prst.setDouble(4, productDTO.getPrice());
			prst.setInt(5, productDTO.getCustomerId());
			prst.setString(6, productDTO.getCustomerName());

			int values = prst.executeUpdate();
			if (values > 0) {
				System.out.println("data saved");
				ifSaved = true;
			} else {
				System.out.println("data not saved");
				ifSaved = false;
			}
		} catch (Exception e) {
			e.printStackTrace();
		}

		return ifSaved;
	}

}
