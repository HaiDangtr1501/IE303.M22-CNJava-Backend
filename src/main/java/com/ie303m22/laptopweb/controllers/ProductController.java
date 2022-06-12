package com.ie303m22.laptopweb.controllers;

import java.util.Optional;


import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.http.HttpStatus;

import org.springframework.http.ResponseEntity;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

// import com.congnghejava.webbanhang.exception.BadRequestException;
// import com.congnghejava.webbanhang.models.Brand;
// import com.congnghejava.webbanhang.models.Category;
// import com.congnghejava.webbanhang.models.EProductBrand;
// import com.congnghejava.webbanhang.models.EProductCategory;
// import com.congnghejava.webbanhang.models.EProductImageTypeDisplay;
// import com.congnghejava.webbanhang.models.Product;
// import com.congnghejava.webbanhang.models.ProductDetails;
// import com.congnghejava.webbanhang.models.ProductPage;
// import com.congnghejava.webbanhang.models.Review;
// import com.congnghejava.webbanhang.models.User;
// import com.congnghejava.webbanhang.payload.request.ProductRequest;
// import com.congnghejava.webbanhang.payload.request.ReviewRequest;
// import com.congnghejava.webbanhang.payload.response.MessageResponse;
// import com.congnghejava.webbanhang.payload.response.ProductResponse;
// import com.congnghejava.webbanhang.payload.response.ReviewResponse;
// import com.congnghejava.webbanhang.repository.criteria.ProductSearchCriteria;
// import com.congnghejava.webbanhang.security.CurrentUser;
// import com.congnghejava.webbanhang.security.UserPrincipal;
// import com.congnghejava.webbanhang.services.BrandServiceImpl;
// import com.congnghejava.webbanhang.services.CartService;
// import com.congnghejava.webbanhang.services.CategoryServiceImpl;
// import com.congnghejava.webbanhang.services.FileStorageServiceImpl;
// import com.congnghejava.webbanhang.services.ProductDetailsServiceImpl;
// import com.congnghejava.webbanhang.services.ProductImageServiceImpl;
// import com.congnghejava.webbanhang.services.ProductService;
// import com.congnghejava.webbanhang.services.ReviewServiceImpl;
// import com.congnghejava.webbanhang.services.UserService;
import com.ie303m22.laptopweb.payload.response.*;
import com.ie303m22.laptopweb.model.*;
import com.ie303m22.laptopweb.repository.criteria.*;
import com.ie303m22.laptopweb.services.*;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController()
@RequestMapping("/products")
public class ProductController {

	@Autowired
	ProductService productService;

	@Autowired
	FileStorageServiceImpl fileStorageService;

	@Autowired
	ProductImageServiceImpl productImageService;

	@Autowired
	CategoryServiceImpl categoryService;

	@Autowired
	BrandServiceImpl brandService;

	@Autowired
	ProductDetailsServiceImpl productDetailsService;

	// @formatter:off
	@GetMapping
	public ResponseEntity<?> getProducts(@RequestParam(value = "page") Optional<Integer> page,
										   @RequestParam(value = "size") Optional<Integer> size,
										   @RequestParam(value = "sortDirection") Optional<String> sortDirection,
										   @RequestParam(value = "sortBy") Optional<String> sortBy,
										   @RequestParam(value = "name") Optional<String> name,
										   @RequestParam(value = "brand") Optional<String> brand,
										   @RequestParam(value = "category") Optional<String> category,
										   @RequestParam(value = "minPrice") Optional<Integer> minPrice,
										   @RequestParam(value = "maxPrice") Optional<Integer> maxPrice) {
	// @formatter:on
		ProductPage productPage = new ProductPage();
		ProductSearchCriteria productSearchCriteria = new ProductSearchCriteria();

		if (page.isPresent()) {
			productPage.setPage(page.get());
		}
		if (size.isPresent()) {
			productPage.setSize(size.get());
		}
		if (sortDirection.isPresent()) {
			productPage.setSortDirection(sortDirection.get());
		}
		else {
			productPage.setSortDirection("asc");
		}
		
		if (sortBy.isPresent()) {
			productPage.setSortBy(sortBy.get());
		}
		else {
			productPage.setSortBy("createdDate");
		}
	
		if (name.isPresent()) {
			productSearchCriteria.setName(name.get());
		}
		if (brand.isPresent()) {
			productSearchCriteria.setBrand(brand.get());
		}
		if (category.isPresent()) {
			productSearchCriteria.setCatorory(category.get());
		}
		if (minPrice.isPresent()) {
			productSearchCriteria.setMinPrice(minPrice.get());
		}
		if (maxPrice.isPresent()) {
			productSearchCriteria.setMaxPrice(maxPrice.get());
		}

		return new ResponseEntity<>(productService.findAllWithFilter(productPage, productSearchCriteria),
				HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ProductResponse getProduct(@PathVariable Long id) {
		Product product = productService.findById(id);
		return new ProductResponse(product);
	}
}
