package Group;

import BaseDonnee.IMap;
import BaseDonnee.Map;
import Element.Correspondence;
import Element.Type;

public class Stone extends GroupElement {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence("/Images/rock.png", '.');
	private static IMap map = new Map();
		
	public Stone() {
			
		super(correspondence, Type.HARD);
	}
		
		
		
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
		
		
		
	//****METHODES****//
	public static String selectNameImage() {
		return map.selectStone(1);
	}
}
