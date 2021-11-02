package com.example.demo.persistence;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.domain.Category;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}