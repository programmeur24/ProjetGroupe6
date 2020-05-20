package Personnage;

import java.awt.Image;

import Element.Correspondence;
import Element.Type;

public class Hero extends Personnage{
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence(selectNameImage(), 'B');
	
	
	
	//****CONSTRUCTOR****//
	public Hero() {
		super(2, 2, Type.HARD, correspondence);
	}
	
	
	
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
	
	
		
	//****METHODES****//
	public static String selectNameImage() {
		return null;
	}
	
	public Image move() {
		return null;
	}
}
