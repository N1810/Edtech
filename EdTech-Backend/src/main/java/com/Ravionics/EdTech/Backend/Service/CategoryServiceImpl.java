package com.Ravionics.EdTech.Backend.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.Ravionics.EdTech.Backend.Dao.CategoryDao;
import com.Ravionics.EdTech.Backend.Entity.Category;

@Service
public class CategoryServiceImpl implements CategoryService {
	// List<Category> list;
	@Autowired
	private CategoryDao categoryDao;

	public CategoryServiceImpl() {
//		list = new ArrayList<>();
//		list.add(new Category(01, "Spring", "This is A Spring Course"));
	}

	@Override
	public List<Category> getCategories() {
		// TODO Auto-generated method stub
		return categoryDao.findAll();
	}

	@Override
	public Category addCategory(Category category) {
		// TODO Auto-generated method stub
		// list.add(category);
		categoryDao.save(category);
		return category;
	}

	@Override
	public Category updateCategory(Category category) {
//		list.forEach(e -> {
//			if (e.getId() == category.getId()) {
//				e.setTitle(category.getTitle());
//				e.setDescription(category.getDescription());
//			}
//		});
		categoryDao.save(category);
		return category;
	}

	@Override
	public void deleteCategory(long parseLong) {
		// TODO Auto-generated method stub
		// list = this.list.stream().filter(e -> e.getId() !=
		// parseLong).collect(Collectors.toList());
		Category entity = categoryDao.getOne(parseLong);
		categoryDao.delete(entity);
	}

}
