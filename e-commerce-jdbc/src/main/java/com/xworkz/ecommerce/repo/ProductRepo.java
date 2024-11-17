package com.xworkz.ecommerce.repo;

import com.xworkz.ecommerce.dto.ProductDTO;

public interface ProductRepo {

	boolean save(ProductDTO productDTO);
}
