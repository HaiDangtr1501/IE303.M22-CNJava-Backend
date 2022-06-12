package com.ie303m22.laptopweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ie303m22.laptopweb.models.Brand;

@Repository
public interface BrandRepository extends JpaRepository<Brand, Long> {
	public boolean existsByNameIgnoreCase(String name);

	public Brand findFirstByNameContainingIgnoreCase(String name);
}
