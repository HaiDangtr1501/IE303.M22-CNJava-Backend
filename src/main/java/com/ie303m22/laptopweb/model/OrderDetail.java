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

	//Constructor methods
	public OrderDetail() {
	}

	public OrderDetail(long orderDetailId, int quantity, float detailPrice, Product productOrder, Order orderDetail) {
		this.orderDetailId = orderDetailId;
		this.quantity = quantity;
		this.detailPrice = detailPrice;
		this.productOrder = productOrder;
		this.orderDetail = orderDetail;
	}

	//Getter - Setter
	public long getOrderDetailId() {
		return orderDetailId;
	}

	public void setOrderDetailId(long orderDetailId) {
		this.orderDetailId = orderDetailId;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public float getDetailPrice() {
		return detailPrice;
	}

	public void setDetailPrice(float detailPrice) {
		this.detailPrice = detailPrice;
	}

	
	public Product getProductOrder() {
		return productOrder;
	}

	public void setProductOrder(Product productOrder) {
		this.productOrder = productOrder;
	}

	public Order getOrderDetail() {
		return orderDetail;
	}

	public void setOrderDetail(Order orderDetail) {
		this.orderDetail = orderDetail;
	}

	@Override
	public String toString() {
		return "OrderDetail [detailPrice=" + detailPrice + ", orderDetail=" + orderDetail + ", orderDetailId="
				+ orderDetailId + ", productOrder=" + productOrder + ", quantity=" + quantity + "]";
	}

	
}
