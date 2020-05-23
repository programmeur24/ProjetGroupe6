package model;

import java.util.Observable;

import Personnage.Hero;
import Personnage.IPerson;
import Personnage.Monstre;

public interface IInsanePersonModel {
	public IRoad getRoad();
	public Hero getHero();
	public Monstre getMonstre();
	public int getniveau();
	public Observable getObservable();
}
