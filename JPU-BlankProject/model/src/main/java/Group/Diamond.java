package Group;

import Element.Correspondence;
import Element.Type;

public class Diamond extends GroupElement {
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence(selectNameImage(), 'D');
		
	public Diamond() {
			
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
