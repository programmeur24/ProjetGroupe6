package Personnage;

import java.awt.Image;

import javax.swing.ImageIcon;

import BaseDonnee.IMap;
import BaseDonnee.Map;
import Element.Correspondence;
import Element.Type;
import model.IRoad;

public class Hero extends Personnage{
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence(selectNameImage(1), 'B');
	private static IMap map = new Map();
	private boolean versDroite = true;
	private boolean versHaut = false;
	private String str;
	private ImageIcon  icoPerso;
	private Image  imgPerso;
	private boolean faireRien = false;
	
	
	
	//****CONSTRUCTOR****//
	public Hero(int x, int y, IRoad road) {
		super(x, y,road, Type.HARD, correspondence);
		this.correspondenceUp = new Correspondence("JoueurVersDroite.png", 'M');
	}
	
	
	
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
	
	
		
	//****METHODES****//
	public static String selectNameImage(int i) {
		return null;
	}
	
	public Image travaille() {
		icoPerso = new ImageIcon(getClass().getResource("/Images/JoueurVersDroite.png"));
		return imgPerso = icoPerso.getImage();
	}
	
	public Image move() {
		if(this.versDroite == true) {
			str = selectNameImage(4);
			this.setX(this.getX() + 1);
		}
		else if(this.versDroite == false) {
			str = selectNameImage(3);
			this.setX(this.getX() - 1);
		}
		else if(this.versHaut == true) {
			str = selectNameImage(1);
			this.setY(this.getY() - 1);
		}
		else if(this.versHaut == false) {
			str = selectNameImage(2);
			this.setY(this.getY() + 1);
		}
		icoPerso = new ImageIcon(getClass().getResource("/Images"+str));
		return imgPerso = icoPerso.getImage();
	}

	public String isAlive() {
		return "HAAAAAAAAAAAAAAAAA!!!!!!!!!!!!!!!";
	}

	public String isDeaded() {
		return "HOOOOOOOOOOOOOOOOO!!!!!!!!!!!!!!!";
	}
}
