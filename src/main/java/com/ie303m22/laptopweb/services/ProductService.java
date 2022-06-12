package com.ie303m22.laptopweb.services;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.stereotype.Service;

import com.ie303m22.laptopweb.payload.response.*;
import com.ie303m22.laptopweb.model.*;
import com.ie303m22.laptopweb.repository.*;
import com.ie303m22.laptopweb.repository.criteria.*;

@Service
public class ProductService {

	@Autowired
	ProductRepository productRepository;

	@Autowired
	ProductCriteriaRepository productCriteriaRepository;

	@Autowired
	FileStorageServiceImpl fileStorageServiceImpl;

	public List<Product> findAll() {
		return productRepository.findAll();
	}

	public Page<ProductResponse> findAllWithFilter(ProductPage productPage,
			ProductSearchCriteria productSearchCriteria) {
		return productCriteriaRepository.findAllWithFilter(productPage, productSearchCriteria);
	}

	public Product findById(Long theId) {
		return productRepository.findById(theId).get();
	}

	public Product save(Product theProduct) {
		return productRepository.save(theProduct);
	}

	public Product save(Product theProduct, User user) {
		theProduct.setUser(user);
		return productRepository.save(theProduct);
	}

	public void remove(Long theId) {
		productRepository.deleteById(theId);
	}

}
