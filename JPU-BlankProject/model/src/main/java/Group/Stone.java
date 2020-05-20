package Group;

import Element.Correspondence;
import Element.Type;

public class Stone extends GroupElement {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence(selectNameImage(), '.');
		
	public Stone() {
			
		super(correspondence, Type.HARD);
	}
		
		
		
	//****GETTERS****//
	public Correspondence getCorrespondence() {
		return correspondence;
	}
		
		
		
	//****METHODES****//
	public static String selectNameImage() {
		return null;
	}
}
