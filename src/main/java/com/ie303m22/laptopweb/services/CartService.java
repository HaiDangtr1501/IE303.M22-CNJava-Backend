package com.ie303m22.laptopweb.services;

import java.util.List;

import com.ie303m22.laptopweb.models.Cart;
import com.ie303m22.laptopweb.models.Product;
import com.ie303m22.laptopweb.models.User;
import com.ie303m22.laptopweb.repository.CartRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CartService {
    @Autowired
	CartRepository cartRepository;

	public Cart findById(Long id) {
		return cartRepository.findById(id).get();
	}

	public List<Cart> findByUser(User user) {
		return cartRepository.findByUser(user);
	}

	public List<Cart> findByUserAndEnable(User user, Boolean enable) {
		return cartRepository.findByUserAndEnable(user, enable);
	}

	public boolean existsByProductAndUser(Product product, User user) {
		return cartRepository.existsByProductAndUser(product, user);
	}

	public List<Cart> findByProduct(Product product) {
		return cartRepository.findByProduct(product);
	}

	public Cart save(Cart cart) {
		return cartRepository.save(cart);
	}

	public void remove(Long id) {
		cartRepository.deleteById(id);
	}
}
