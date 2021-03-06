package com.ie303m22.laptopweb.repository.specification;

import org.springframework.data.jpa.domain.Specification;

import com.ie303m22.laptopweb.models.EOrderStatus;
import com.ie303m22.laptopweb.models.Order;

public final class OrderSpecification {
	public static Specification<Order> hasStatus(String status) {
		return (root, query, cb) -> {
			if (status.isEmpty()) {
				return cb.conjunction();
			}
			return cb.equal(root.get("status"), EOrderStatus.valueOf(status));
		};
	}

	public static Specification<Order> hasId(String id) {
		return (root, query, cb) -> {
			if (id.isEmpty()) {
				return cb.conjunction();
			}
			return cb.equal(root.get("id"), id);
		};
	}

	public static Specification<Order> hasUserName(String name) {
		return (root, query, cb) -> {
			if (name.isEmpty()) {
				return cb.conjunction();
			}
			return cb.like(cb.lower(root.get("user").get("name")), "%" + name.toLowerCase() + "%");
		};
	}
}
