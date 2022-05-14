package com.ie303m22.laptopweb.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "comment")
public class Comment {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long commentId;
	
	@Column(name="content")
	private String content;

	@Column(name="start")
	private int start;

	@Column(name="createdBy")
	private Date createdBy;
	
	@ManyToOne
	@JoinColumn(name = "productId")
	private Product productComment;
	
	@ManyToOne
	@JoinColumn(name = "userId")
	private User userComment;

	//Constructor methods
	public Comment(long commentId, String content, int start, Date createdBy, Product productComment,
			User userComment) {
		this.commentId = commentId;
		this.content = content;
		this.start = start;
		this.createdBy = createdBy;
		this.productComment = productComment;
		this.userComment = userComment;
	}

	public Comment() {
	}

	//Getter - Setter
	public long getCommentId() {
		return commentId;
	}

	public void setCommentId(long commentId) {
		this.commentId = commentId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public int getStart() {
		return start;
	}

	public void setStart(int start) {
		this.start = start;
	}

	public Date getCreatedBy() {
		return createdBy;
	}

	public void setCreatedBy(Date createdBy) {
		this.createdBy = createdBy;
	}

	public Product getProductComment() {
		return productComment;
	}

	public void setProductComment(Product productComment) {
		this.productComment = productComment;
	}

	public User getUserComment() {
		return userComment;
	}

	public void setUserComment(User userComment) {
		this.userComment = userComment;
	}

	//Override toString
	@Override
	public String toString() {
		return "Comment [commentId=" + commentId + ", content=" + content + ", createdBy=" + createdBy
				+ ", productComment=" + productComment + ", start=" + start + ", userComment=" + userComment + "]";
	}
	
	
	
	
	
	
}
