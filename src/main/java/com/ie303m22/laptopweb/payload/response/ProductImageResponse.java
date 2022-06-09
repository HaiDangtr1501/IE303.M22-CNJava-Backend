package com.ie303m22.laptopweb.payload.response;

import com.ie303m22.laptopweb.model.*;
import com.ie303m22.laptopweb.utils.UrlImageUtils;

public class ProductImageResponse {

	UrlImageUtils urlImageUtils = new UrlImageUtils();

	private String url;
	private String type;

	public ProductImageResponse(ProductImage productImage) {
		this.url = urlImageUtils.buildPathWithName(productImage.getName());
		this.type = productImage.getType().toString();
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

}
