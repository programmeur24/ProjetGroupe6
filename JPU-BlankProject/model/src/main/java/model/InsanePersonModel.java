package model;

import Personnage.Hero;
import Personnage.IPerson;
import Personnage.Monstre;

public class InsanePersonModel implements IInsanePersonModel{
	//****ATTRIBUTS****//
	public IPerson hero;
	public IPerson monstre;
	public IRoad road;
	
	
	
	//****CONSTRUCTOR****//
	public InsanePersonModel(String fileName, int startX, int startY) throws Exception {
		this.road = new Road(fileName);
		this.hero = (IPerson) new Hero(startX, startY, road); 
		this.monstre = (IPerson) new Monstre(startX, startY, road); 
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
