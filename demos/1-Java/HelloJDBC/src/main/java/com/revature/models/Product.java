package com.revature.models;

import java.time.LocalDate;

public class Product {

	private int id;
	private String productName;
	private double productPrice;
	private LocalDate productExpDate;

	public Product() {
		super();
	}

	public Product(String productName, double productPrice, LocalDate productExpDate) {
		super();
		this.productName = productName;
		this.productPrice = productPrice;
		this.productExpDate = productExpDate;
	}

	public Product(int id, String productName, double productPrice, LocalDate productExpDate) {
		super();
		this.id = id;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productExpDate = productExpDate;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}

	public LocalDate getProductExpDate() {
		return productExpDate;
	}

	public void setProductExpDate(LocalDate productExpDate) {
		this.productExpDate = productExpDate;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", productName=" + productName + ", productPrice=" + productPrice
				+ ", productExpDate=" + productExpDate + "]";
	}

}
