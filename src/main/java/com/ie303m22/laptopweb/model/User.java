package com.ie303m22.laptopweb.model;

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
	private long id;
	
	@Column(name= "user_name", nullable = false)
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
	//Constructor
	
	public User(long id, String userName, String password, String displayName, String phone, String email, String image,
			String role) {
		super();
		this.id = id;
		this.userName = userName;
		this.password = password;
		this.displayName = displayName;
		this.phone = phone;
		this.email = email;
		this.image = image;
		this.role = role;
	}
	public User() {
		super();
		
	}
	//Getter & Setter
	public long getId() {
		return id;
	}

	

	public void setId(long id) {
		this.id = id;
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
	@Override
	public String toString() {
		return "User [id=" + id + ", userName=" + userName + ", password=" + password + ", displayName=" + displayName
				+ ", phone=" + phone + ", email=" + email + ", image=" + image + ", role=" + role + "]";
	}
	
	

	
}
