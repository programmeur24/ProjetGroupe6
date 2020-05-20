package Group;

import Element.Correspondence;
import Element.Type;

public class Metal extends GroupElement{
	//****ATTRIBUTS****//
	private static Correspondence correspondence = new Correspondence(selectNameImage(), '#');
	
	public Metal() {
		
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
