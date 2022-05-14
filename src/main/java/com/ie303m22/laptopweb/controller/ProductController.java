//package com.ie303m22.laptopweb.controller;
//
//import java.util.List;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//import org.springframework.web.bind.annotation.RequestBody;
//import com.ie303m22.laptopweb.model.Product;
//import com.ie303m22.laptopweb.model.ResponseObject;
//import com.ie303m22.laptopweb.repository.ProductRepository;
//
//@CrossOrigin(origins = "*", maxAge = 3600)
//@RestController()
//@RequestMapping("api/v1/products")
//public class ProductController {
//	@Autowired
//	private ProductRepository userrepository;
//	
//	@GetMapping("")
//	List<Product> getAllProduct(){
//		return userrepository.findAll();
//	}
//	@PostMapping("/insert-product")
//	ResponseEntity<ResponseObject> insertProduct(@RequestBody Product newProduct){
//		return ResponseEntity.status(HttpStatus.OK).body(
//				
//				);
//	}
//}
