package com.ie303m22.laptopweb.model;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	@Column(name = "productName", unique = true, nullable = false)
	private String productName;
	
	@Column(name = "oldPrice")
	private double oldPrice;
	
	@Column(name = "newPrice")
	private double newPrice;
	
	@Column(name = "mainImg")
	private String mainImg;
	
	@Column(name = "content")
	private String content;

	@Column(name = "category")
	private String category;

	@Column(name = "type")
	private String type;
	
	@Column(name = "brand")
	private String brand;
	
	@Column(name = "star")
	private float star;
	
	@Column(name = "image")
	private String image;

	@Column(name="listSubImg")
	private String[] listSubImg;
	
	
	@OneToMany(mappedBy = "productComment")
	private List<Comment> comments = new ArrayList<>();
	
	@OneToMany(mappedBy = "productOrder")
	private List<OrderDetail> orderDetails = new ArrayList<>();

	public Product() {
	}

	public Product(long productId, String productName, double oldPrice, double newPrice, String mainImg, String content,
			String category, String type, String brand, float star, String image, String[] listSubImg,
			List<Comment> comments, List<OrderDetail> orderDetails) {
		this.productId = productId;
		this.productName = productName;
		this.oldPrice = oldPrice;
		this.newPrice = newPrice;
		this.mainImg = mainImg;
		this.content = content;
		this.category = category;
		this.type = type;
		this.brand = brand;
		this.star = star;
		this.image = image;
		this.listSubImg = listSubImg;
		this.comments = comments;
		this.orderDetails = orderDetails;
	}

	public long getProductId() {
		return productId;
	}

	public void setProductId(long productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getOldPrice() {
		return oldPrice;
	}

	public void setOldPrice(double oldPrice) {
		this.oldPrice = oldPrice;
	}

	public double getNewPrice() {
		return newPrice;
	}

	public void setNewPrice(double newPrice) {
		this.newPrice = newPrice;
	}

	public String getMainImg() {
		return mainImg;
	}

	public void setMainImg(String mainImg) {
		this.mainImg = mainImg;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public float getStar() {
		return star;
	}

	public void setStar(float star) {
		this.star = star;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String[] getListSubImg() {
		return listSubImg;
	}

	public void setListSubImg(String[] listSubImg) {
		this.listSubImg = listSubImg;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<OrderDetail> getOrderDetails() {
		return orderDetails;
	}

	public void setOrderDetails(List<OrderDetail> orderDetails) {
		this.orderDetails = orderDetails;
	}

	@Override
	public String toString() {
		return "Product [brand=" + brand + ", category=" + category + ", comments=" + comments + ", content=" + content
				+ ", image=" + image + ", listSubImg=" + Arrays.toString(listSubImg) + ", mainImg=" + mainImg
				+ ", newPrice=" + newPrice + ", oldPrice=" + oldPrice + ", orderDetails=" + orderDetails
				+ ", productId=" + productId + ", productName=" + productName + ", star=" + star + ", type=" + type
				+ "]";
	}	

	
	
}
