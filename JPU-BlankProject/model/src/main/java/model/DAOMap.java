package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Map;

/**
 * The DBConnection class.
 * @author Groupe 7 : Sipoufo, Regina, Christ, Wilfrid
 * @version 1.0
 *
 */
public class DAOMap extends DAOEntity<Map> {

	/**
	 * Instantiates a new DAO map.
	 *
	 * @param connection
	 *          the connection
	 * @throws SQLException
	 *           the SQL exception
	 */
	
	public DAOMap(final Connection connection) throws SQLException {
		super(connection);
	}

	/*
	 * @see model.DAOEntity#create(model.Entity)
	 */
	public boolean create(final Map entity) {
		return false;
	}

	/*
	 * @see model.DAOEntity#delete(model.Entity)
	 */
	public boolean delete(final Map entity) {
		return false;
	}

	/*
	 * @see model.DAOEntity#update(model.Entity)
	 */
	@Override
	public boolean update(final Map entity) {
		// Not implemented
		return false;
	}

	/*
	 * @see model.DAOEntity#find(int)
	 */
	public Map find(final int id) {
		Map map = new Map();
		
		try {
			final String sql = "{call mapById(?)}";
			final CallableStatement call = this.getConnection().prepareCall(sql);
			call.setInt(1, id);
			call.execute();
			final ResultSet resultSet = call.getResultSet();
			if (resultSet.first()) {
				map = new Map(id, resultSet.getString("levelContent"), resultSet.getInt("numberDiamondsNeeded"));
			}
			return map;
		} catch (final SQLException e) {
			e.printStackTrace();
		}
		return null;
	}
}
