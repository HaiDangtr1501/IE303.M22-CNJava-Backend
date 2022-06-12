package com.ie303m22.laptopweb.payload.request;

public class ReviewRequest {
	private float rating;
	private String comment;

	public float getRating() {
		return rating;
	}

	public void setRating(float rating) {
		this.rating = rating;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

}