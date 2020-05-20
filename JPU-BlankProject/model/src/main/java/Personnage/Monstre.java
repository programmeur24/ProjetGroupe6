package Personnage;

import java.awt.Image;

import Element.Correspondence;
import Element.Type;

public class Monstre extends Personnage {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence(selectNameImage(), 'X');
	
	
	
	//****CONSTRUCTOR****//
	public Monstre(){
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
