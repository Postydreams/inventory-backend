package com.company.inventory.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.company.inventory.model.Product;
import com.company.inventory.response.ProductResponseRest;


@Service
public class ProductServiceImpl implements IProductService {

	@Override
	public ResponseEntity<ProductResponseRest> save(Product product, Long categoryId) {
		ProductResponseRest response = new ProductResponseRest();
		List<Product> list = new ArrayList<>();
		
		
		return null;
	}

}
