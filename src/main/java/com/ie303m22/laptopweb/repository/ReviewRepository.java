package com.ie303m22.laptopweb.services;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.congnghejava.webbanhang.models.Product;
import com.congnghejava.webbanhang.models.Review;
import com.congnghejava.webbanhang.models.User;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	public List<Review> findByProduct(Product product);

	public boolean existsByUserAndProduct(User user, Product product);

	public Review findByUser(User user);
}