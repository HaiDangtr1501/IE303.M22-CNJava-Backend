package com.ie303m22.laptopweb.controllers;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ie303m22.laptopweb.models.Category;
import com.ie303m22.laptopweb.models.EProductCategory;
import com.ie303m22.laptopweb.payload.request.CategoryRequest;
import com.ie303m22.laptopweb.payload.response.CategoryResponse;
import com.ie303m22.laptopweb.payload.response.MessageResponse;
import com.ie303m22.laptopweb.services.CategoryServiceImpl;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/categories")
public class CategoryController {

	@Autowired
	CategoryServiceImpl categoryService;

	@GetMapping
	public ResponseEntity<?> getAllCategory() {
		List<CategoryResponse> categories = categoryService.findAll().stream()
				.map(category -> new CategoryResponse(category)).collect(Collectors.toList());
		return new ResponseEntity<>(categories, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<?> getCategory(@PathVariable Long id) {
		Category category = categoryService.findById(id).get();
		return ResponseEntity.status(HttpStatus.OK).body(new CategoryResponse(category));
	}

	@PostMapping
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> createNewCategory(@Valid @RequestBody CategoryRequest categoryRequest) {
		EProductCategory categoryName = EProductCategory.valueOf(categoryRequest.getName());

		if (categoryService.existsCategoryName(categoryName.toString())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Thể loại này đã tồn tại"));
		}

		Category category = new Category(EProductCategory.valueOf(categoryRequest.getName()));
		categoryService.save(category);

		return new ResponseEntity<>(new MessageResponse("Thêm thể loại '" + category.getName() + "' thành công!"),
				HttpStatus.OK);
	}

	// @formatter:off
	@PutMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<?> updateCategory(@PathVariable Long id,
											@Valid @RequestBody CategoryRequest categoryRequest) {
	// @formatter:on

		EProductCategory categoryName = EProductCategory.valueOf(categoryRequest.getName());

		if (categoryService.existsCategoryName(categoryName.toString())) {
			return ResponseEntity.badRequest().body(new MessageResponse("Thể loại này đã tồn tại"));
		}

		Optional<Category> categoryOptional = categoryService.findById(id);

		return categoryOptional.map(oldCategory -> {
			Category category = new Category(categoryName);
			String oldCategoryName = oldCategory.getName().toString();

			category.setId(oldCategory.getId());
			categoryService.save(category);

			return ResponseEntity.ok().body(
					new MessageResponse("Đã thay đổi thể loại '" + oldCategoryName + "' thành '" + category.getName() + "'"));
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}

	@DeleteMapping("/{id}")
	@PreAuthorize("hasRole('ROLE_ADMIN')")
	public ResponseEntity<Category> deleteCategory(@PathVariable Long id) {
		Optional<Category> categoryOptional = categoryService.findById(id);

		return categoryOptional.map(tempCategory -> {
			categoryService.remove(id);

			return new ResponseEntity<>(tempCategory, HttpStatus.OK);
		}).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
	}
}
