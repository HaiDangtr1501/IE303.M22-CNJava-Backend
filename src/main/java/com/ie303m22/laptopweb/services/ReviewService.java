package com.ie303m22.laptopweb.services;

import java.util.List;

import com.ie303m22.laptopweb.models.Product;
import com.ie303m22.laptopweb.models.Review;
import com.ie303m22.laptopweb.models.User;

public interface ReviewService extends IGeneralService<Review> {

	public List<Review> findByProduct(Product product);

	public boolean existsByUserAndProduct(User user, Product product);

	public Review findByUser(User user);
}
