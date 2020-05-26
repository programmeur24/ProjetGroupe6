package com.databaseconnection;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;


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
	
	
	
	//****CONSTRUCTORS****//
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

	
	
	//****GETTERS****//
	public String getUrl() {
		return this.url;
	}
	
	public String getLogin() {
		return this.login;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	
	
	//****SETTERS****//
	private void setUrl(final String url) {
		this.url = url;
	}

	private void setLogin(final String login) {
		this.login = login;
	}

	private void setPassword(final String password) {
		this.password = password;
	}

}
