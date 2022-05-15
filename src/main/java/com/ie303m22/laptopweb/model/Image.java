package com.ie303m22.laptopweb.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="image")
public class Image {
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "imageId")
    private long id;

    @Column(name = "alt")
    private String alt;

    @Column(name = "url")
    private String url;

    @ManyToOne
	@JoinColumn(name = "userId")
    private User userImg;

    @ManyToOne
	@JoinColumn(name = "productId")
    private Product productImg;

    public Image() {
    }

    public Image(long id, String alt, String url, User userImg, Product productImg) {
        this.id = id;
        this.alt = alt;
        this.url = url;
        this.userImg = userImg;
        this.productImg = productImg;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getAlt() {
        return alt;
    }

    public void setAlt(String alt) {
        this.alt = alt;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public User getUserImg() {
        return userImg;
    }

    public void setUserImg(User userImg) {
        this.userImg = userImg;
    }

    public Product getProductImg() {
        return productImg;
    }

    public void setProductImg(Product productImg) {
        this.productImg = productImg;
    }

    @Override
    public String toString() {
        return "Image [alt=" + alt + ", id=" + id + ", productImg=" + productImg + ", url=" + url + ", userImg="
                + userImg + "]";
    }

    
}
