package com.xworkz.ecommerce.service;

import com.xworkz.ecommerce.dto.ProductDTO;
import com.xworkz.ecommerce.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService{

	@Override
	public boolean save(ProductDTO productDTO) {
		
		System.out.println("This is service class ProductId="+productDTO.getProductId());
		System.out.println("This is service class ProductName="+productDTO.getProductName());
		System.out.println("This is service class ProductType="+productDTO.getProductType());
		System.out.println("This is service class Price="+productDTO.getPrice());
		System.out.println("This is service class CustomerId="+productDTO.getCustomerId());
		System.out.println("This is service class CustomerName="+productDTO.getCustomerName());
		
		ProductRepoImpl productRepoImpl=new ProductRepoImpl();
		boolean saved=productRepoImpl.save(productDTO);
		System.out.println("Saved=="+saved);
		
		return saved;
	}
}
