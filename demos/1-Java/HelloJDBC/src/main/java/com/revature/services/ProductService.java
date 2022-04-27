package com.revature.services;

import java.util.List;

import com.revature.models.Product;

public interface ProductService {
	public boolean addNewProduct(Product product);
	public boolean editProduct(Product product);
	public Product getProductById(int id);
	public List<Product> getAllProducts();
	
}
