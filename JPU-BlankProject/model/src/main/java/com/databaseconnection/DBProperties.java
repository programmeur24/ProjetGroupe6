package com.databaseconnection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * The DBConnection class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */

class DBProperties extends Properties {

	//****ATTRIBUTS****//
	private static final long		serialVersionUID			= 5289057445894568927L;
	private final static String	PROPERTIES_FILE_NAME	= "model.properties";

	/** The url. */
	private String url	= "";

	/** The login. */
	private String	login = "";

	/** The password. */
	private String	password = "";
	
	
	
	/**
	 * The DBProperties's constructor.
	 */
	public DBProperties() {
		InputStream inputStream;

		inputStream = this.getClass().getClassLoader().getResourceAsStream(DBProperties.PROPERTIES_FILE_NAME);

		if (inputStream != null) {
			try {
				this.load(inputStream);
			} catch (final IOException e) {
				e.printStackTrace();
			}
			this.setUrl(this.getProperty("url"));
			this.setLogin(this.getProperty("login"));
			this.setPassword(this.getProperty("password"));
		}
	}

	
	
	/**
	 * 
	 * @return String use for URL of the DataBase
	 */
	public String getUrl() {
		return this.url;
	}
	
	
	/**
	 * 
	 * @return String use for login of the DataBase
	 */
	public String getLogin() {
		return this.login;
	}
	
	/**
	 * 
	 * @return String use for password of the DataBase
	 */
	public String getPassword() {
		return this.password;
	}
	
	
	
	/**
	 * 
	 * @param url
	 */
	private void setUrl(final String url) {
		this.url = url;
	}

	/**
	 * 
	 * @param login
	 */
	private void setLogin(final String login) {
		this.login = login;
	}

	/**
	 * 
	 * @param password
	 */
	private void setPassword(final String password) {
		this.password = password;
	}

}
