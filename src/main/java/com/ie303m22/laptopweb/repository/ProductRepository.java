package com.ie303m22.laptopweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ie303m22.laptopweb.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
