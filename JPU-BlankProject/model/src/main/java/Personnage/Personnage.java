package Personnage;

import java.awt.Image;
import java.awt.Point;

import Element.Correspondence;
import Element.Element;
import Element.Type;


public class Personnage extends Element{
	//****ATTRIBUT****//
	private Point position;
	private boolean alive = true;
	private boolean versDroite = true;
	private boolean versHaut = true;
	
	
	
	//****CONSTRUCTOR****//
	public Personnage(Type type, Correspondence correspondence) {
		super(type, correspondence);
		this.position = new Point();
	}
	
	public Personnage(int x, int y, Type type, Correspondence correspondence) {
		this(type, correspondence);
		this.setX(x);
		this.setY(y);
	}
	
	
	
	//****SETTERS****//
	public void setX(int x) {
		position.x = x;
	}
	
	public void setY(int y) {
		position.y = y;
	}
	
	public void  setAddPersonnage(Personnage addPersonnage) {
		
	}
	
	
	
	//****GETTERS****//
	public int getX() {
		return position.x;
	}

	public int getY() {
		return position.y;
	}

	public Point getPosition() {
		return position;
	}
	
	public Personnage  getAddPersonnage() {
		return null;
		
	}
	
	
	
	//****METHODES****//
	public Image isAlive() {
		return null;
	}

	public Image isDeaded() {
		return null;
	}

	public Image move() {
		return null;
	}
}
