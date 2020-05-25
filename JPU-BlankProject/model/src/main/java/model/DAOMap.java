package model;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;

import entity.Map;

public class DAOMap extends DAOEntity<Map> {

	
	//****CONSTRUCTOR****//
	public DAOMap(final Connection connection) throws SQLException {
		super(connection);
	}

	
	
	
	//****METHODES****//
	public boolean create(final Map entity) {
		return false;
	}

	@Override
	public boolean delete(final Map entity) {
		// Not implemented
		return false;
	}

	@Override
	public boolean update(final Map entity) {
		// Not implemented
		return false;
	}

	@Override
	public Map find(final int id) {
		//HelloWorld helloWorld = new HelloWorld();
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
