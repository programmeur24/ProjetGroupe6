package model;

import java.sql.SQLException;
import java.util.Observable;

import com.databaseconnection.DBConnection;

import contract.IModel;
import entity.Map;

public final class Model extends Observable implements IModel {

	//****ATTRIBUTS****//
	private Map map;
	private final static int numberOfLevels = 7;
	
	
	
	//****CONSTRUCTOR****//
	public Model() {
		this.map = new Map();
	}

	
	
	//****GETTERS****//
	public Map getMap() {
		return this.map;
	}

	
	
	//****GETTERS****//
	private void setMap(final Map map) {
		this.map = map;
		this.modelNotify();
	}

	
	
	//****METHODES****//
	public void loadMap(final int id) throws IndexOutOfBoundsException {
		
		if(id <= numberOfLevels) {
			try {
				final DAOMap daoMap = new DAOMap(DBConnection.getInstance().getConnection());
				this.setMap(daoMap.find(id));
			} catch (final SQLException e) {
				e.printStackTrace();
			}
		} else {
				throw new IndexOutOfBoundsException("Incorrect id !");
		}
	}

	public Observable getObservable() {
		return this;
	}
	
	public void modelNotify() {
		setChanged();
		notifyObservers();
	}
	
	public void loop() {

		if(this.getMap().getNumberOfDiamondsNeeded() != 0) {
			this.getMap().loop();
			this.modelNotify();
		}
	}
}
