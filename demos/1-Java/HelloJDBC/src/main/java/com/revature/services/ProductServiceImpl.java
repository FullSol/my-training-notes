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
		logger.info("In service layer - editing existing product...");
		return productDAO.update(product);
	}

	@Override
	public Product getProductById(int id) {
		logger.info("In service layer - getting product by id " + id + "...");
		return productDAO.findById(id);
	}

	@Override
	public List<Product> getAllProducts() {
		logger.info("In service layer - retrieving all products...");
		return productDAO.findAll();
	}

}
