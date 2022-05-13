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
	
	@Column(name="cancleReason")
	private String cancleReason;
	
	@Column(name="status")
	private String status;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User userOrder;
	
	@OneToMany(mappedBy = "orderDetail")
	private List<OrderDetail> orderDetails = new ArrayList<>();
}
