package com.flipkart.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Item_details")
public class Product {

	@Id
	@GeneratedValue
	private int productId;

	@Column(name = "product_name")
	private String productname;

	@Column(name = "product_price")
	private float productPrice;

	@Column(name = "product_rating")
	private String productRating;

	public Product(String productname, float productPrice, String productRating) {
		super();
		this.productname = productname;
		this.productPrice = productPrice;
		this.productRating = productRating;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public float getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(float productPrice) {
		this.productPrice = productPrice;
	}

	public String getProductRating() {
		return productRating;
	}

	public void setProductRating(String productRating) {
		this.productRating = productRating;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productname=" + productname + ", productPrice=" + productPrice
				+ ", productRating=" + productRating + "]";
	}

}
