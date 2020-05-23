package Personnage;

import BaseDonnee.IPersonnage;
import BaseDonnee.Personn;

import java.awt.Image;

import javax.swing.ImageIcon;

import Element.Correspondence;
import Element.Type;
import model.IRoad;

public class Monstre extends Personnage {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence("JoueurVersDroite.png", 'B');
	private static IPersonnage per = new Personn();
	private boolean versDroite = true;
	private boolean versHaut = false;
	private String str;
	private ImageIcon  icoPerso;
	private Image  imgPerso;
	
	
	
	//****CONSTRUCTOR****//
	public Monstre(int x, int y, IRoad road){
		super(x, y,road, Type.HARD, correspondence);
		this.correspondenceUp = new Correspondence(selectNameImage(1), 'M');
	}
	
	
	
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
	
	
		
	//****METHODES****//
	public static String selectNameImage(int i) {
		return null;
		//return per.selectPersonnage(i);
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
		return "You is Alive";
	}


	public String isDeaded() {
		return "You is Deaded";
	}
}
