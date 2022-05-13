package com.ie303m22.laptopweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "orderDetail")
public class OrderDetail {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="orderDetailId")
	private long orderDetailId;
	
	@Column(name="quantity")
	private int quantity;
	
	@Column(name="detailPrice")
	private float detailPrice;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product productOrder;
	
	@ManyToOne
	@JoinColumn(name = "orderId")
	private Order orderDetail;
	
}
