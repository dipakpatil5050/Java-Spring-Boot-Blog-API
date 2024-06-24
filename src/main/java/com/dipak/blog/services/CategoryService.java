package com.dipak.blog.services;

import java.util.List;

import com.dipak.blog.payloads.CategoryDto;

public interface CategoryService {

	// create
	CategoryDto createCategory(CategoryDto categoryDto);

	// update

	CategoryDto updateCategory(CategoryDto categoryDto, Integer categoryId);

	// Delete

	void deleteCategory(Integer categoryId);

	// get

	CategoryDto getCategory(Integer categoryId);

	// getAll

	List<CategoryDto> getCategories();
}
