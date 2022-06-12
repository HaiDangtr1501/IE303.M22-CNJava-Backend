package com.ie303m22.laptopweb.payload.response;

import com.ie303m22.laptopweb.models.Brand;

public class BrandResponse {
	private Long id;
	private String name;

	public BrandResponse(Brand brand) {
		this.id = brand.getId();
		this.name = brand.getName().toString();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	};

}
