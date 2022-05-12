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
	@Column(name= "userId", nullable = false)
	private long userId;
	
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
	
	@OneToMany(mappedBy = "userComment")
	private List<Product> commnets = new ArrayList<>();
	
	@OneToMany(mappedBy = "userOrder")
	private List<Product> orders = new ArrayList<>();
}
