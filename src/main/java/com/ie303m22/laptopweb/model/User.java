package com.ie303m22.laptopweb.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.*;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Entity
@Table(name = "user")
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name= "userId")
	private long userId;
	
	@Column(name= "user_name", nullable = false, unique = true)
	private String userName;
	
	@Column(name= "password", nullable = false)
	private String password;
	
	@Column(name= "display_name", nullable = false)
	private String displayName;
	
	@Column(name= "phone")
	private String phone;
	
	@Column(name= "email")
	private String email;
	
	@Column(name= "image")
	private String image;
	
	@Column(name= "role")
	private String role;
	
	@OneToMany(mappedBy = "userComment")
	private List<Comment> comments = new ArrayList<>();
	
	@OneToMany(mappedBy = "userOrder")
	private List<Order> orders = new ArrayList<>();

	public User() {
	}

	public User(long userId, String userName, String password, String displayName, String phone, String email,
			String image, String role, List<Comment> comments, List<Order> orders) {
		this.userId = userId;
		this.userName = userName;
		this.password = password;
		this.displayName = displayName;
		this.phone = phone;
		this.email = email;
		this.image = image;
		this.role = role;
		this.comments = comments;
		this.orders = orders;
	}

	public long getUserId() {
		return userId;
	}

	public void setUserId(long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getDisplayName() {
		return displayName;
	}

	public void setDisplayName(String displayName) {
		this.displayName = displayName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<Comment> getComments() {
		return comments;
	}

	public void setComments(List<Comment> comments) {
		this.comments = comments;
	}

	public List<Order> getOrders() {
		return orders;
	}

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	@Override
	public String toString() {
		return "User [comments=" + comments + ", displayName=" + displayName + ", email=" + email + ", image=" + image
				+ ", orders=" + orders + ", password=" + password + ", phone=" + phone + ", role=" + role + ", userId="
				+ userId + ", userName=" + userName + "]";
	}

	
}
