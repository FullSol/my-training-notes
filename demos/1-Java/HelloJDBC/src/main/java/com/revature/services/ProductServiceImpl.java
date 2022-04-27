package com.revature.services;

import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Product;
import com.revature.repositories.ProductDAO;
import com.revature.repositories.ProductDAOImpl;

public class ProductServiceImpl implements ProductService {
	
	private static Logger logger = Logger.getLogger(ProductServiceImpl.class);
	private ProductDAO productDAO = new ProductDAOImpl();

	@Override
	public boolean addNewProduct(Product product) {
		return productDAO.insert(product);
	}

	@Override
	public boolean editProduct(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
