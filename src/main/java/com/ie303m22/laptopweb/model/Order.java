package com.ie303m22.laptopweb.model;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "order")
public class Order {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "orderId")
	private long orderId;
	
	@Column(name="totalPrice")
	private float totalPrice;
	
	@Column(name="timeCreate")
	private Date timeCreate;
	
	@Column(name="cancelReason")
	private String cancelReason;
	
	@Column(name="status")
	private Boolean status;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User userOrder;
	
	@OneToMany(mappedBy = "orderDetail")
	private List<OrderDetail> orderDetails = new ArrayList<>();

	//Constructor methods
	public Order() {
	}

	public Order(long orderId, float totalPrice, Date timeCreate, String cancelReason, Boolean status, User userOrder,
			List<OrderDetail> orderDetails) {
		this.orderId = orderId;
		this.totalPrice = totalPrice;
		this.timeCreate = timeCreate;
		this.cancelReason = cancelReason;
		this.status = status;
		this.userOrder = userOrder;
		this.orderDetails = orderDetails;
	}

	//Getter Setter
	public long getOrderId() {
		return orderId;
	}

	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public Date getTimeCreate() {
		return timeCreate;
	}

	public void setTimeCreate(Date timeCreate) {
		this.timeCreate = timeCreate;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public void setCancelReason(String cancelReason) {
		this.cancelReason = cancelReason;
	}

	public Boolean getStatus() {
		return status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	public User getUserOrder() {
		return userOrder;
	}

	public void setUserOrder(User userOrder) {
		this.userOrder = userOrder;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Order [cancelReason=" + cancelReason + ", orderDetails=" + orderDetails + ", orderId=" + orderId
				+ ", status=" + status + ", timeCreate=" + timeCreate + ", totalPrice=" + totalPrice + ", userOrder="
				+ userOrder + "]";
	}

	

	
}
