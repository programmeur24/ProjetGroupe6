package Personnage;

import java.awt.Image;
import java.awt.Point;

import Element.Element;

public class Personnage extends Element implements IPerson{
	//****ATTRIBUT****//
	private Point position;
	private boolean alive = true;
	private boolean versDroite = true;
	private boolean versHaut = true;
	
	
	
	//****CONSTRUCTOR****//
	public Personnage() {
		super(null, null);
	}
	
	
	
	public Image move() {
		return null;
	}

	public int getX() {
		return 0;
	}

	public int getY() {
		return 0;
	}

	public Image isAlive() {
		return null;
	}

	public Image isDeaded() {
		return null;
	}

	public Point getPosition() {
		return null;
	}
	
}
