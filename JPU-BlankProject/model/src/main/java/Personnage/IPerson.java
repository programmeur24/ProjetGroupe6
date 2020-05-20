package Personnage;

import java.awt.Image;
import java.awt.Point;

public interface IPerson {
	public Image move();
	public int getX();
	public int getY();
	public Image isAlive();
	public Image isDeaded();
	public Point getPosition();
}
