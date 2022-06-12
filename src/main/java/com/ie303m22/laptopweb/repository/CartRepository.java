package com.ie303m22.laptopweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ie303m22.laptopweb.models.Cart;
import com.ie303m22.laptopweb.models.Product;
import com.ie303m22.laptopweb.models.User;

@Repository
public interface CartRepository extends JpaRepository<Cart, Long> {
	public List<Cart> findByUser(User user);

	public List<Cart> findByUserAndEnable(User user, Boolean enable);

	public boolean existsByProductAndUser(Product product, User user);

	public List<Cart> findByProduct(Product product);
}
