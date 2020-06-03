package com.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * The DBConnection class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */

public final class DBConnection {
	//****ATTRIBUTS****//
	private static DBConnection	INSTANCE	= null;
	private Connection connection;
	
	
	
	/**
	 * The DBConnection's constructor.
	 */
	private DBConnection() {
		this.open();
	}
	
	
	
	/**
	 * 
	 * @return DBConnection
	 */
	public static synchronized DBConnection getInstance() {
		if (DBConnection.INSTANCE == null) {
			DBConnection.INSTANCE = new DBConnection();
		}
		return DBConnection.INSTANCE;
	}


	
	
	/**
	 * 
	 * @return Boolean
	 */
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
	
	/**
	 *  Connection
	 * @return the connection
	 */
	public Connection getConnection() {
		return this.connection;
	}
}
