package com.Ravionics.EdTech.Backend.Service;

import java.util.List;

import com.Ravionics.EdTech.Backend.Entity.Category;

public interface CategoryService {
	public List<Category> getCategories();

	public Category addCategory(Category category);

	public Category updateCategory(Category category);

	public void deleteCategory(long parseLong);

}
