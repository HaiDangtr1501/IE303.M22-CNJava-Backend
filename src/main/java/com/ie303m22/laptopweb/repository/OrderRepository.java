package com.ie303m22.laptopweb.repository;

import com.ie303m22.laptopweb.models.Order;
import com.ie303m22.laptopweb.models.User;


import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order, String>, JpaSpecificationExecutor<Order> {
    public Page<Order> findByUser(User user, Pageable page);
}
