package Group;

import BaseDonnee.IMap;
import BaseDonnee.Map;
import Element.Correspondence;
import Element.Type;

public class Wall extends GroupElement {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence("/Images/mur.png", '|');
	private static IMap map = new Map();
		
	public Wall() {
			
		super(correspondence, Type.HARD);
	}
		
		
		
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
		
		
		
	//****METHODES****//
	public static String selectNameImage() {
		return map.selectWall(1);
	}
}
