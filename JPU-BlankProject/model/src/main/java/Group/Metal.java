package Group;

import BaseDonnee.IMap;
import BaseDonnee.Map;
import Element.Correspondence;
import Element.Type;

public class Metal extends GroupElement{
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence(selectNameImage(), '#');
	private static IMap map = new Map();
	
	public Metal() {
		super(correspondence, Type.HARD);
	}
	
	
	
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
	
	
	
	//****METHODES****//
	public static String selectNameImage() {
		return map.selectMetal(1);
	}	
}
