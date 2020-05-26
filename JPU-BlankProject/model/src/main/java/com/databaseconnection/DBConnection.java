package com.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public final class DBConnection {
	//****ATTRIBUTS****//
	private static DBConnection	INSTANCE	= null;
	private Connection connection;
	
	
	
	//****CONTRUCTOR****//
	private DBConnection() {
		this.open();
	}
	
	
	
	//****GETTERS****//
	public static synchronized DBConnection getInstance() {
		if (DBConnection.INSTANCE == null) {
			DBConnection.INSTANCE = new DBConnection();
		}
		return DBConnection.INSTANCE;
	}


	
	
	//****METHODES****//
	private Boolean open() {
		final DBProperties dbProperties = new DBProperties();
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(dbProperties.getUrl(), dbProperties.getLogin(), dbProperties.getPassword());
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return true;
	}
	//****CONNECTION****//
	public Connection getConnection() {
		return this.connection;
	}
}
