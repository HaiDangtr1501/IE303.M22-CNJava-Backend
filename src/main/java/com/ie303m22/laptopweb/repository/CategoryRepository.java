package com.ie303m22.laptopweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ie303m22.laptopweb.models.Category;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
	public boolean existsByNameIgnoreCase(String name);

	public Category findFirstByNameContainingIgnoreCase(String name);
}
