package com.revature.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConnectionUtil {

	private static Logger logger = Logger.getLogger(ConnectionUtil.class);

	public static Connection getConnection() {
		
		/**
		 * This is a less secure way to establish the DB connection
		 * String url = "some-where-out-there";
		 * String username = "something-or-other-you-do-not-know";
		 * String password = "none-of-your-business";
		 * conn = DriverManager.getConnection(url, username, password);
		 */
		
		Connection conn = null;
		Properties prop = new Properties();

		// Loading in credentials
		try {
			
			// This is more secure as you don't expose your credentials
			logger.debug(String.format(
					"Making a database credentials with following credentials: \nURL: %s \nUsername: %s \nPassword: %s", 
					System.getenv("db_url"), 
					System.getenv("db_username"), 
					System.getenv("db_password")
				)
			);
			conn = DriverManager.getConnection(
					System.getenv("db_url"), 
					System.getenv("db_username"), 
					System.getenv("db_password")
				);
//			logger.debug(String.format(
//					"Making a database credentials with following credentials: \nURL: %s \nUsername: %s \nPassword: %s", 
//					"jdbc:postgresql://solbikeshop2.chzlwngfvrtn.us-east-1.rds.amazonaws.com:5432/", 
//					"solbikeshop", 
//					"detnez-tehqev-5Qadwa"
//					)
//			);
//			conn = DriverManager.getConnection(
//					"jdbc:postgresql://solbikeshop2.chzlwngfvrtn.us-east-1.rds.amazonaws.com:5432/CycleCity", 
//					"solbikeshop", 
//					"detnez-tehqev-5Qadwa"
//				);
			
			logger.debug("Connection has been successfully established.");
			
		} catch (SQLException e) {

			logger.warn("Unable to obtain connection to database.", e);

		}

		return conn;
	}

}
