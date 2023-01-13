package com.company.inventory.response;

import java.util.List;

import lombok.Data;

import com.company.inventory.model.Product;

@Data
public class ProductResponse {
	
	List<Product> products;
}
