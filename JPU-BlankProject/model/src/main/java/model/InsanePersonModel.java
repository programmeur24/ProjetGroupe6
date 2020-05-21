package model;

import Personnage.IPerson;

public class InsanePersonModel implements IInsanePersonModel{
	//****ATTRIBUTS****//
	public IPerson hero;
	public IPerson monstre;
	public IRoad road;
	
	
	
	//****CONSTRUCTOR****//
	public InsanePersonModel(String fileName, int startX, int startY) {
		
	}
	
	public InsanePersonModel(String fileName) {
		
	}
	
	
	
	//****SETTERS****//
	public void setHero(IPerson hero) {
		this.hero = hero;
	}

	public void setMonstre(IPerson monstre) {
		this.monstre = monstre;
	}

	public void setRoad(IRoad road) {
		this.road = road;
	}
	
	
	
	//****GETTERS****//
	public IRoad getRoad() {
		return road;
	}

	public IPerson getHero() {
		return hero;
	}

	public IPerson getMonstre() {
		return monstre;
	}

}
