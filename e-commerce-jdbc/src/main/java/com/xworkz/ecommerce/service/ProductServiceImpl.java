package com.xworkz.ecommerce.service;

import com.xworkz.ecommerce.dto.ProductDTO;
import com.xworkz.ecommerce.repo.ProductRepoImpl;

public class ProductServiceImpl implements ProductService {

	@Override
	public boolean save(ProductDTO productDTO) {
		boolean isValid = true;

		if (productDTO != null) {

			if (!(productDTO.getCustomerName().length() > 6 && productDTO.getCustomerName().length() < 14)) {
				System.err.println("CustomerName is in-valid");
				isValid = false;
			}

			if (productDTO.getEmail() == null && !(productDTO.getEmail().contains("@") && (productDTO.getEmail().endsWith(".com") && productDTO.getEmail().indexOf('@') == 8))) {
				System.err.println("Email is in-valid");
				isValid = false;
			}

			if (!(productDTO.getPhoneNo().length() == 10 && productDTO.getPhoneNo().startsWith("9"))) {
				System.err.println("Phone number is in-valid");
				isValid = false;
			}

			if (!(productDTO.getAge() >5 && productDTO.getAge() <= 65)) {
				System.err.println("Age is in-valid");
				isValid = false;
			}

		}
		if (isValid) {
			ProductRepoImpl productRepoImpl = new ProductRepoImpl();
			return productRepoImpl.save(productDTO);
		} else {
			System.out.println("Data validation failed, not saving.");
			return isValid;
		}

	}
}
