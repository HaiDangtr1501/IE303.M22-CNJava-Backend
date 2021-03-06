package com.ie303m22.laptopweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ie303m22.laptopweb.models.Category;
import com.ie303m22.laptopweb.repository.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryRepository categoryRepository;

	@Override
	public List<Category> findAll() {
		return categoryRepository.findAll();
	}

	@Override
	public Optional<Category> findById(Long theId) {
		return categoryRepository.findById(theId);
	}

	@Override
	public void remove(Long theId) {
		categoryRepository.deleteById(theId);
	}

	@Override
	public Category save(Category theCategory) {
		return categoryRepository.save(theCategory);
	}

	public boolean existsCategoryName(String name) {
		return categoryRepository.existsByNameIgnoreCase(name);
	}

	public Category findFirstByCategoryName(String name) {
		return categoryRepository.findFirstByNameContainingIgnoreCase(name);
	}
}
