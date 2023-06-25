package com.Ravionics.EdTech.Backend.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Category {
	@Id
	private long id;
	private String Title;
	private String Description;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return Title;
	}
	public void setTitle(String title) {
		Title = title;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	
	public Category(long id, String title, String description) {
		super();
		this.id = id;
		Title = title;
		Description = description;
	}
	
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Category [id=" + id + ", Title=" + Title + ", Description=" + Description + "]";
	}

}
