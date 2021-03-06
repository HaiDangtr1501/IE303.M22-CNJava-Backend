package com.ie303m22.laptopweb.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ie303m22.laptopweb.models.Product;
import com.ie303m22.laptopweb.models.Review;
import com.ie303m22.laptopweb.models.User;
import com.ie303m22.laptopweb.repository.ReviewRepository;

@Service
public class ReviewServiceImpl implements ReviewService {

	@Autowired
	ReviewRepository reviewRepository;

	@Override
	public List<Review> findAll() {
		return reviewRepository.findAll();
	}

	@Override
	public Optional<Review> findById(Long theId) {
		return reviewRepository.findById(theId);
	}

	@Override
	public Review save(Review theReview) {
		return reviewRepository.save(theReview);
	}

	@Override
	public void remove(Long theId) {
		reviewRepository.deleteById(theId);
	}

	@Override
	public List<Review> findByProduct(Product product) {
		return reviewRepository.findByProduct(product);
	}

	@Override
	public boolean existsByUserAndProduct(User user, Product product) {
		return reviewRepository.existsByUserAndProduct(user, product);
	}

	@Override
	public Review findByUser(User user) {
		return reviewRepository.findByUser(user);
	}

}
