package com.ie303m22.laptopweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ie303m22.laptopweb.models.Brand;
import com.ie303m22.laptopweb.repository.BrandRepository;

@Service
public class BrandServiceImpl implements BrandService {
	@Autowired
	BrandRepository brandRepository;

	@Override
	public List<Brand> findAll() {
		return brandRepository.findAll();
	}

	@Override
	public Optional<Brand> findById(Long theId) {
		return brandRepository.findById(theId);
	}

	@Override
	public Brand save(Brand theBrand) {
		return brandRepository.save(theBrand);
	}

	@Override
	public void remove(Long theId) {
		brandRepository.deleteById(theId);
	}

	public boolean existsBrandName(String name) {
		return brandRepository.existsByNameIgnoreCase(name);
	}

	public Brand findFirstByBrandName(String name) {
		return brandRepository.findFirstByNameContainingIgnoreCase(name);
	}

}
