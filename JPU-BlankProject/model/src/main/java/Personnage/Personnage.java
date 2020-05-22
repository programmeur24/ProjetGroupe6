package Personnage;

import java.awt.Image;
import java.awt.Point;

import Element.Correspondence;
import Element.Element;
import Element.Type;
import model.IRoad;


public abstract class Personnage extends Element{
	//****ATTRIBUT****//
	protected Point position;
	protected boolean alive = true;
	protected Correspondence correspondenceUp;
	protected Correspondence correspondenceDown;
	protected Correspondence correspondenceLeft;
	protected Correspondence correspondenceRight;
	
	
	
	//****CONSTRUCTOR****//
	public Personnage(Type type, IRoad road, Correspondence correspondence) {
		super(type, correspondence);
		this.position = new Point();
	}
	
	public Personnage(int x, int y, IRoad road, Type type, Correspondence correspondence) {
		this(type, road, correspondence);
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
	public abstract String isAlive();

	public abstract String isDeaded();

	public abstract Image move();
}
