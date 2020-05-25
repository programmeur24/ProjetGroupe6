package model;

import java.sql.Connection;
import java.sql.SQLException;

import entity.Entity;
public abstract class DAOEntity<E extends Entity> {

	//****ATTRIBUT****//
	private final Connection connection;
	
	
	
	//****CONSTRUCTOR****//
	public DAOEntity(final Connection connection) throws SQLException {
		this.connection = connection;
	}
	
	
	
	//****METHODES****//
	protected Connection getConnection() {
		return this.connection;
	}

	public abstract boolean create(E entity);

	public abstract boolean delete(E entity);

	public abstract boolean update(E entity);

	public abstract E find(int id);



}
