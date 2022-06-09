package com.ie303m22.laptopweb.payload.response;

import com.ie303m22.laptopweb.model.*;

public class CategoryResponse {
	private Long id;
	private String name;

	public CategoryResponse(Category category) {
		this.id = category.getId();
		this.name = category.getName().toString();
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
