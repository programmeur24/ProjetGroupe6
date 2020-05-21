import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Properties;

public class BDConnection extends Properties {
	/**
	 * 
	 */
	private static final long serialVersionUID = 4221040714879950210L;

	/** The Constant PROPERTIES_FILE_NAME. */
	private final static String	PROPERTIES_FILE_NAME	= "model.properties";

	/** The url. */
	private String							url										= "";

	/** The login. */
	private String							login									= "";

	/** The password. */
	private String							password							= "";

	/**
	 * Instantiates a new DB properties.
	 */
	private Connection connection;
	private Statement statement;
	
	
	
	//****CONSTRUCTOR****//
	public BDConnection() {
		InputStream inputStream;

		inputStream = this.getClass().getClassLoader().getResourceAsStream(BDConnection.PROPERTIES_FILE_NAME);

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
		this.connection = null;
		this.statement = null;
	}
	
	
	
	//****GETTERS****//
	public String getUrl() {
		return url;
	}
	
	public String getLogin() {
		return login;
	}
	
	public String getPassword() {
		return password;
	}
	
	
	
	//****SETTERS****//
	public void setUrl(String url) {
		this.url = url;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	
	
	//****METHODES****//
	public boolean open() {
		try {
			Class.forName("com.mysql.jdbc.Driver");
			this.connection = DriverManager.getConnection(this.getUrl(), this.getLogin(), this.getPassword());
			this.statement = this.connection.createStatement();
		} catch (final ClassNotFoundException e) {
			e.printStackTrace();
			return false;
		} catch (final SQLException e) {
			e.printStackTrace();
			return false;
		}
		return true;
	}
	
	public void close() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public ResultSet executeQuery(String query) {
		try {
			statement = connection.createStatement();
			return statement.executeQuery(query);
		} catch (SQLException e) {
			return null;
		}
	}
	
	public int executeUpdate(String query) {
		try {
			statement = connection.createStatement();
			return statement.executeUpdate(query);
		} catch (SQLException e) {
			return 0;
		}
	}
}
