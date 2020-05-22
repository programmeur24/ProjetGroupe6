package Group;

import BaseDonnee.IMap;
import BaseDonnee.Map;
import Element.Correspondence;
import Element.Type;

public class BrokenWall extends GroupElement {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence("murcasse", '!');
	private static IMap map = new Map();
		
	public BrokenWall() {
			
		super(correspondence, Type.HARD);
	}
		
		
		
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
		
		
		
	//****METHODES****//
	public static String selectNameImage() {
		return map.selectBrokenWall(1);
	}
}
