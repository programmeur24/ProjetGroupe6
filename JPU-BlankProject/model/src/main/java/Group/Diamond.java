package Group;

import BaseDonnee.IMap;
import BaseDonnee.Map;
import Element.Correspondence;
import Element.Type;

public class Diamond extends GroupElement {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence("/Images/Diamantbleu.png", 'D');
	private static IMap map = new Map();
		
	public Diamond() {
			
		super(correspondence, Type.HARD);
	}
		
		
		
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
		
		
		
	//****METHODES****//
	public static String selectNameImage() {
		return map.selectDiamond(1);
	}
}
