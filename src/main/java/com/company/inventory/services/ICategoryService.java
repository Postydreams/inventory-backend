package com.company.inventory.services;

import org.springframework.http.ResponseEntity;

import com.company.inventory.model.Category;
import com.company.inventory.response.CategoryResponseREST;

public interface ICategoryService {

	public ResponseEntity<CategoryResponseREST> search(); // Interfaz que permite dar uan estructura respuesta HTTP con codigo respectivo y dar respuesta custom
	public ResponseEntity<CategoryResponseREST> searchById(Long id);
	public ResponseEntity<CategoryResponseREST> save(Category category);
	public ResponseEntity<CategoryResponseREST> update(Category category, Long id);
}
 