package com.Ravionics.EdTech.Backend.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.Ravionics.EdTech.Backend.Entity.Category;

public interface CategoryDao extends JpaRepository<Category, Long> {

}
