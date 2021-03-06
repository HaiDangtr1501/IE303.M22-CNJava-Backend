package com.ie303m22.laptopweb.models;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

@Entity
@Table(name = "orders")
@EntityListeners(AuditingEntityListener.class)
public class Order extends Auditable<Long> {
	@Id
	@GeneratedValue(generator = "uuid")
	@GenericGenerator(name = "uuid", strategy = "uuid2")
	private String id;

	@ManyToOne
	@JoinColumn(name = "user_id", nullable = false)
	private User user;

	@OneToMany(mappedBy = "order", cascade = CascadeType.ALL)
	private Set<OrderItem> orderItems = new HashSet<>();

	@Enumerated(EnumType.STRING)
	@Column(length = 20)
	private EOrderStatus status;

	private Boolean settled = false;

	@Enumerated(EnumType.STRING)
	@Column(name = "payment_method")
	private EPaymentMethod paymentMethod;

	private String stripeChagreId;

	public Order() {
	}

	public Order(User user, List<Cart> listCart) {
		this.user = user;
		listCart.forEach(cart -> {
			orderItems.add(new OrderItem(this, cart));
		});
		this.status = EOrderStatus.Open;
		this.paymentMethod = EPaymentMethod.Cod;

	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public Set<OrderItem> getOrderItems() {
		return orderItems;
	}

	public void setOrderItems(Set<OrderItem> orderItems) {
		this.orderItems = orderItems;
	}

	public EOrderStatus getStatus() {
		return status;
	}

	public void setStatus(EOrderStatus status) {
		this.status = status;
	}

	public boolean isSettled() {
		return settled;
	}

	public void setSettled(boolean settled) {
		this.settled = settled;
	}

	public Long getTotal() {
		return orderItems.stream().mapToLong(OrderItem::getTotal).sum();
	}

	public Boolean getSettled() {
		return settled;
	}

	public void setSettled(Boolean settled) {
		this.settled = settled;
	}

	public EPaymentMethod getPaymentMethod() {
		return paymentMethod;
	}

	public void setPaymentMethod(EPaymentMethod paymentMethod) {
		this.paymentMethod = paymentMethod;
	}

	public String getStripeChagreId() {
		return stripeChagreId;
	}

	public void setStripeChagreId(String stripeChagreId) {
		this.stripeChagreId = stripeChagreId;
	}

}
