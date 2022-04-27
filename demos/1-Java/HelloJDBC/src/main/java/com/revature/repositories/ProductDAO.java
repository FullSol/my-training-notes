package com.revature.repositories;

import java.util.List; // Not allowed to use in project

import com.revature.models.Product;

public interface ProductDAO {
	public boolean insert(Product product);
	public boolean update(Product product);
	public Product findById(int id);
	public List<Product> findAll();
	
	
}
