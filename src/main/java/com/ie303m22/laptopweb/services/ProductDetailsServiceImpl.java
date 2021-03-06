package com.ie303m22.laptopweb.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ie303m22.laptopweb.models.ProductDetails;
import com.ie303m22.laptopweb.repository.ProductDetailsRepository;

@Service
public class ProductDetailsServiceImpl implements ProductDetailsService {
	@Autowired
	ProductDetailsRepository productDetailsRepository;

	@Override
	public ProductDetails save(ProductDetails productDetails) {
		return productDetailsRepository.save(productDetails);
	}

}
