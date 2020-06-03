package model;

import java.sql.Connection;
import java.sql.SQLException;

import entity.Entity;

/**
 * The DBConnection class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */
public abstract class DAOEntity<E extends Entity> {

	/** The connection. */
	private final Connection connection;

	/**
	 * Instantiates a new DAO entity.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	
	public DAOEntity(final Connection connection) throws SQLException {
		this.connection = connection;
	}

	/**
	 * Gets the connection.
	 * @return the connection
	 */
	protected Connection getConnection() {
		return this.connection;
	}

	/**
	 * Creates the.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	
	public abstract boolean create(E entity);

	/**
	 * Creates the.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	
	public abstract boolean delete(E entity);

	/**
	 * Creates the.
	 *
	 * @param entity
	 *          the entity
	 * @return true, if successful
	 */
	
	public abstract boolean update(E entity);

	/**
	 * Find.
	 *
	 * @param id
	 *          the id
	 * @return the e
	 */
	public abstract E find(int id);



}
