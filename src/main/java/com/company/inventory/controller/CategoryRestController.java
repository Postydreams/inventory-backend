package com.company.inventory.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.company.inventory.model.Category;
import com.company.inventory.response.CategoryResponseREST;
import com.company.inventory.services.ICategoryService;

@RestController
@RequestMapping("/api/v1")
public class CategoryRestController {
	
	@Autowired
	private ICategoryService service;
	
	/**
	 * Obtiene todas las categorias
	 * @return
	 */
	@GetMapping("/categories")
	public ResponseEntity<CategoryResponseREST> searchCategories() {
		
		ResponseEntity<CategoryResponseREST> response = service.search();
		return response;
	}
	
	/**
	 * Obtiene las categorias por ID
	 * @param id
	 * @return
	 */
	@GetMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseREST> searchCategoriesById(@PathVariable Long id){
		
		ResponseEntity<CategoryResponseREST> response = service.searchById(id);
		return response;
	}
	
	/**
	 * Guarda las categorias
	 * @param Category
	 * @return
	 */
	@PostMapping("/categories")
	public ResponseEntity<CategoryResponseREST> save(@RequestBody Category category){
		
		ResponseEntity<CategoryResponseREST> response = service.save(category);
		return response;
	}
	
	/**
	 * Actualiza las categorias
	 * @param category
	 * @param id
	 * @return
	 */
	
	@PutMapping("/categories/{id}")
	public ResponseEntity<CategoryResponseREST> update(@RequestBody Category category, @PathVariable Long id){
		
		ResponseEntity<CategoryResponseREST> response = service.update(category, id);
		return response;
	}
	
}