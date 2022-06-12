package com.ie303m22.laptopweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ie303m22.laptopweb.models.Product;
import com.ie303m22.laptopweb.models.Review;
import com.ie303m22.laptopweb.models.User;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Long> {
	public List<Review> findByProduct(Product product);

	public boolean existsByUserAndProduct(User user, Product product);

	public Review findByUser(User user);
}
