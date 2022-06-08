package com.ie303m22.laptopweb.payload.response;

import com.ie303m22.laptopweb.models.EOrderStatus;

public class UpdateOrderResponse {
    private String orderStatus;

	public UpdateOrderResponse(EOrderStatus status) {
		orderStatus = status.toString();
	}

	public String getOrderStatus() {
		return orderStatus;
	}

	public void setOrderStatus(String orderStatus) {
		this.orderStatus = orderStatus;
	}
}
