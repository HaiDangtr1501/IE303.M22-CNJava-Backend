package com.ie303m22.laptopweb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;


@Entity
@Table(name = "product")
public class Product {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "productId")
	private long productId;
	
	@Column(name = "productName")
	private String productName;
	
	@Column(name = "oldPrice")
	private double oldPrice;
	
	@Column(name = "newPrice")
	private double newPrice;
	
	@Column(name = "mainImg")
	private String mainImg;
	
	@Column(name = "content")
	private String content;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "star")
	private float star;
	
	@Column(name="listSubImg")
	private String[] listSubImg;
	
	
	@OneToMany(mappedBy = "productComment")
	private List<Comment> commnets = new ArrayList<>();
	
	@OneToMany(mappedBy = "productOrder")
	private List<OrderDetail> orderDetails = new ArrayList<>();
	
}
