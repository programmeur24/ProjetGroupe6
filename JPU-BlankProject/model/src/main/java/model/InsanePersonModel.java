package model;

import java.util.Observable;

import Personnage.Hero;
import Personnage.IPerson;
import Personnage.Monstre;

public class InsanePersonModel extends Observable implements IInsanePersonModel{
	//****ATTRIBUTS****//
	public Hero hero;
	public Monstre monstre;
	public IRoad road;
	private final int niveau = 1;
	
	
	//****CONSTRUCTOR****//
	public InsanePersonModel(String fileName, int startX, int startY) throws Exception {
		this.road = new Road(fileName);
		this.hero = new Hero(startX, startY, road); 
		this.monstre = new Monstre(startX, startY, road); 
	}
	
	public InsanePersonModel(int startX, int startY) throws Exception {
		this.hero = new Hero(startX, startY, road); 
		this.monstre = new Monstre(startX + 64, startY + 64, road); 
	}
	
	
	
	//****SETTERS****//
	public void setHero(Hero hero) {
		this.hero = hero;
	}

	public void setMonstre(Monstre monstre) {
		this.monstre = monstre;
	}

	public void setRoad(IRoad road) {
		this.road = road;
	}
	
	
	
	//****GETTERS****//
	public IRoad getRoad() {
		return road;
	}

	public Hero getHero() {
		return hero;
	}

	public Monstre getMonstre() {
		return monstre;
	}
	public int getniveau() {
		return niveau;
	}

	public Observable getObservable() {
		return this;
	}

}
