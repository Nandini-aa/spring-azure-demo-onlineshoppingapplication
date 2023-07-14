package com.nandini.shopapp.Model;


import org.springframework.data.annotation.Id;

import org.springframework.data.mongodb.core.mapping.Document;

@Document("productDetails")
public class Product {
	@Id
	private int productId;
	private String productName;
	private String productDescription;
	private Double productPrice;
	private String productFeatures;
	private String productStatus;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDescription() {
		return productDescription;
	}
	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}
	public Double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}
	public String getProductFeatures() {
		return productFeatures;
	}
	public void setProductFeatures(String productFeatures) {
		this.productFeatures = productFeatures;
	}
	public String getProductStatus() {
		return productStatus;
	}
	public void setProductStatus(String productStatus) {
		this.productStatus = productStatus;
	}
	public Product(int productId, String productName, String productDescription, Double productPrice, String productFeatures, String productStatus) {
		super();
		this.productId=productId;
		this.productName = productName;
		this.productDescription = productDescription;
		this.productPrice = productPrice;
		this.productFeatures = productFeatures;
		this.productStatus = productStatus;
	}
	public Product() {
		// TODO Auto-generated constructor stub
	}
	

}





	
