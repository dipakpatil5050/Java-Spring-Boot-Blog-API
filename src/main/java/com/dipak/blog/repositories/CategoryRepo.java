package com.dipak.blog.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dipak.blog.entities.Category;

public interface CategoryRepo extends JpaRepository<Category, Integer> {

}
