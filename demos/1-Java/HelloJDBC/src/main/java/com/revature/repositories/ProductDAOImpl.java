package com.revature.repositories;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.apache.log4j.Logger;

import com.revature.models.Product;
import com.revature.util.ConnectionUtil;

public class ProductDAOImpl implements ProductDAO {
	
	private static Logger logger = Logger.getLogger(ProductDAOImpl.class);

	@Override
	public boolean insert(Product product) {
		/**
		 * Steps
		 * 1. Create a connection using my ConnectionUtil class - try-with-resources
		 * 2. Preparing SQL statement using JDBC's prepared statement
		 * 3. Executing SQL Query
		 * 4. Return true if insert was successful in DB
		 */
		
		// 1. Create a connection using my ConnectionUtil class - try-with-resources
		try(Connection conn = ConnectionUtil.getConnection()){
			
			logger.info("In ProductDAO: Making a new product in DB...");
			
			// 2. Preparing SQL statement using JDBC's prepared statement
			
			/**
			 * This string represents the SQL code which we will execute in our DB
			 * We used (?)s as place-holders which we can insert values from Java using prepared statements
			 * We do this to avoid "SQL Injection" (security concept as which end-users can put in malicious data using your own code)
			 */ 
			String sql = "INSERT INTO products (name, price, expiration_date) VALUES (?, ?, ?)";
			
			PreparedStatement stmt = conn.prepareStatement(sql);
			stmt.setString(1, product.getProductName());
			stmt.setDouble(2, product.getProductPrice());
			stmt.setDate(3, Date.valueOf(product.getProductExpDate()));
			
			// 3. Executing SQL Query
			int targetId = stmt.executeUpdate();
			
			logger.info(String.format("New product has successfully been created. ID: %s", targetId));
			
		} catch (SQLException e) {
			logger.warn("Unable to execute SQL statement", e);
			return false;
		}
		
		// 4. Return true if insert was successful in DB
		return true;
	}

	@Override
	public boolean update(Product product) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Product findById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
