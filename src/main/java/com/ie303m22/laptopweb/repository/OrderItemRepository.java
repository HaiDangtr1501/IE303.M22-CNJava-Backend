package com.ie303m22.laptopweb.repository;

import com.ie303m22.laptopweb.models.OrderItem;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderItemRepository extends JpaRepository<OrderItem, Long>{
    
}
