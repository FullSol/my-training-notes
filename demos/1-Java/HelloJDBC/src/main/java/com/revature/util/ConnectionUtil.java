package com.revature.util;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import org.apache.log4j.Logger;

public class ConnectionUtil {

	private static Logger logger = Logger.getLogger(ConnectionUtil.class);

	public static Connection getConnection() {
		
		Connection conn = null;
		Properties prop = new Properties();

		// Loading in credentials
		try {

			// This is more secure as you don't expose your credentials
			prop.load(new FileReader("/Users/argos/Library/Mobile Documents/com~apple~CloudDocs/_dev/my-training-notes/demos/1-Java/HelloJDBC/src/main/resources/application.properties"));
			logger.info(prop.getProperty("url"));
			conn = DriverManager.getConnection(
					prop.getProperty("url"),
					prop.getProperty("username"),
					prop.getProperty("password")
			);
			
			/**
			 * This is a less secure way to establish the DB connection
			 * String url = "some-where-out-there";
			 * String username = "something-or-other-you-do-not-know";
			 * String password = "none-of-your-business";
			 * conn = DriverManager.getConnection(url, username, password);
			 */
			

		} catch (SQLException e) {

			logger.warn("Unable to obtain connection to database.", e);

		} catch (FileNotFoundException e) {

			logger.warn("Cannot locate properties file", e);

		} catch (IOException e) {

			e.printStackTrace();

		}

		return conn;
	}

}
