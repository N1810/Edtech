package com.Ravionics.EdTech.Backend.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Ravionics.EdTech.Backend.Entity.Category;
import com.Ravionics.EdTech.Backend.Service.CategoryService;

@RestController
public class MyController {
	@Autowired
	private CategoryService categoryservice;

	// For Testing
	@GetMapping("/home")
	public String home() {
		return "This is Home Page";
	}

	// Get The Category
	@GetMapping("/Category")
	public List<Category> getCategories() {
		return this.categoryservice.getCategories();

	}

	// Add The Category
	@PostMapping("/Category")
	public Category addCategory(@RequestBody Category category) {
		return this.categoryservice.addCategory(category);

	}

	@PutMapping("/categories")
	public Category updateCategory(@RequestBody Category category) {
		return this.categoryservice.updateCategory(category);

	}

	@DeleteMapping("/categories/{categoryId}")
	public ResponseEntity<HttpStatus> deleteCategory(@PathVariable String categoryId) {
		try {
			this.categoryservice.deleteCategory(Long.parseLong(categoryId));
			return new ResponseEntity<>(HttpStatus.OK);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}

	}

}
